package com.suraj.learning.common.service;

import com.suraj.learning.common.model.TGModel;
import com.suraj.learning.common.model.TGNode;

import java.util.function.Consumer;
import java.util.function.ToLongFunction;

public interface TravelGuideCacheService<T extends TGNode> {
    ToLongFunction<TGNode> parentKey = node -> node.getTgModel().getMetadata().getParent();
    boolean insertNode(T node);

    default void updateParentNode(Long parent, Long child, boolean insert) {
        TGModel model = fetchNode(parent);
        if (insert) {
            model.getMetadata().getChildren().add(child);
        } else {
            model.getMetadata().getChildren().remove(child);
        }
        updateParentNode(parent, model);
    }

    default boolean handleChildNode(TGNode node, Consumer<TGNode> action, boolean parentAction) {
        boolean status = false;
        if (containsGaiaIdInCache(node.getGaiaId())) {
            action.accept(node);
            updateParentNode(parentKey.applyAsLong(node), node.getGaiaId(), parentAction);
            status = true;
        }
        return status;
    }
    boolean containsGaiaIdInCache(Long gaiaId);
    boolean removeChildNode(T node);
    TGModel fetchNode(Long id);
    void updateParentNode(Long id, TGModel tgModel);
}
