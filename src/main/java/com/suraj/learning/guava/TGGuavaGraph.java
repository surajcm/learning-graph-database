package com.suraj.learning.guava;

import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.suraj.learning.common.model.TGModel;

import java.util.Set;

public class TGGuavaGraph implements Graph<TGModel> {


    @Override
    public Set<TGModel> nodes() {
        return null;
    }

    @Override
    public Set<EndpointPair<TGModel>> edges() {
        return null;
    }

    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public boolean allowsSelfLoops() {
        return false;
    }

    @Override
    public ElementOrder<TGModel> nodeOrder() {
        return null;
    }

    @Override
    public ElementOrder<TGModel> incidentEdgeOrder() {
        return null;
    }

    @Override
    public Set<TGModel> adjacentNodes(TGModel tgModel) {
        return null;
    }

    @Override
    public Set<TGModel> predecessors(TGModel tgModel) {
        return null;
    }

    @Override
    public Set<TGModel> successors(TGModel tgModel) {
        return null;
    }

    @Override
    public Set<EndpointPair<TGModel>> incidentEdges(TGModel tgModel) {
        return null;
    }

    @Override
    public int degree(TGModel tgModel) {
        return 0;
    }

    @Override
    public int inDegree(TGModel tgModel) {
        return 0;
    }

    @Override
    public int outDegree(TGModel tgModel) {
        return 0;
    }

    @Override
    public boolean hasEdgeConnecting(TGModel tgModel, TGModel n1) {
        return false;
    }

    @Override
    public boolean hasEdgeConnecting(EndpointPair<TGModel> endpointPair) {
        return false;
    }
}
