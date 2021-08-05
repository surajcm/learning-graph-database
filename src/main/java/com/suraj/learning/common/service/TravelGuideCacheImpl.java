package com.suraj.learning.common.service;

import com.suraj.learning.common.model.TGModel;
import com.suraj.learning.common.model.TGNode;

import java.util.HashMap;
import java.util.Map;

public class TravelGuideCacheImpl implements TravelGuideCache<TGNode> {

    private static final Map<Long, TGModel> cache = new HashMap<>();

    @Override
    public boolean insertNode(TGNode node, boolean forceUpdate) {
        boolean status = false;
        // contains check and retrieve on same call itself
        if (cache.containsKey(node.getGaiaId()) && forceUpdate) {
            cache.put(node.getGaiaId(), node.getTgModel());
            // this should be a default method
            Long parentKey = node.getTgModel().getMetadata().getParent();
            updateParentNode(parentKey, node.getGaiaId(), true);
            status = true;
        }
        return status;
    }

    @Override
    public TGModel fetchNode(Long id) {
        // use optional
        return cache.get(id);
    }

    @Override
    public void updateParentNode(Long id, TGModel tgModel) {
        cache.put(id, tgModel);
    }

    @Override
    public boolean removeChildNode(TGNode node) {
        boolean status = false;
        if (cache.containsKey(node.getGaiaId())) {
            Long parentKey = node.getTgModel().getMetadata().getParent();
            updateParentNode(parentKey, node.getGaiaId(), false);
            cache.remove(node.getGaiaId());
            status = true;
        }
        return status;
    }
}
