package com.suraj.learning.common.service;

import com.suraj.learning.common.model.TGModel;
import com.suraj.learning.common.model.TGNode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface TravelGuideCache extends TravelGuideCacheService<TGNode> {
    Map<Long, TGModel> cache = new HashMap<>();
    Consumer<TGNode> insert = node -> cache.put(node.getGaiaId(), node.getTgModel());
    Consumer<TGNode> remove = node -> cache.remove(node.getGaiaId());

    @Override
    default boolean insertNode(TGNode node) {
        return handleChildNode(node, insert, true);
    }

    @Override
    default boolean removeChildNode(TGNode node) {
        return handleChildNode(node, remove, false);
    }
}
