package com.suraj.learning.common.service;

import com.suraj.learning.common.model.TGModel;
import com.suraj.learning.common.model.TGNode;

public interface TravelGuideCache<T extends TGNode> {
    boolean insertNode(T node, boolean forceUpdate);

    default void updateParentNode(Long parent, Long child, boolean insert) {
        TGModel model = fetchNode(parent);
        if (insert) {
            model.getMetadata().getChildren().add(child);
        } else {
            model.getMetadata().getChildren().remove(child);
        }
        updateParentNode(parent, model);
    }

    boolean removeChildNode(T node);
    TGModel fetchNode(Long id);
    public void updateParentNode(Long id, TGModel tgModel);
}
