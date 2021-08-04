package com.suraj.learning.jgrapht.model;

import com.suraj.learning.common.model.TGModel;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;

import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;

public class TGJGraphtGraph implements Graph<Long, TGModel> {

    @Override
    public Set<TGModel> getAllEdges(Long aLong, Long v1) {
        return null;
    }

    @Override
    public TGModel getEdge(Long aLong, Long v1) {
        return null;
    }

    @Override
    public Supplier<Long> getVertexSupplier() {
        return null;
    }

    @Override
    public Supplier<TGModel> getEdgeSupplier() {
        return null;
    }

    @Override
    public TGModel addEdge(Long aLong, Long v1) {
        return null;
    }

    @Override
    public boolean addEdge(Long aLong, Long v1, TGModel tgModel) {
        return false;
    }

    @Override
    public Long addVertex() {
        return null;
    }

    @Override
    public boolean addVertex(Long aLong) {
        return false;
    }

    @Override
    public boolean containsEdge(Long aLong, Long v1) {
        return false;
    }

    @Override
    public boolean containsEdge(TGModel tgModel) {
        return false;
    }

    @Override
    public boolean containsVertex(Long aLong) {
        return false;
    }

    @Override
    public Set<TGModel> edgeSet() {
        return null;
    }

    @Override
    public int degreeOf(Long aLong) {
        return 0;
    }

    @Override
    public Set<TGModel> edgesOf(Long aLong) {
        return null;
    }

    @Override
    public int inDegreeOf(Long aLong) {
        return 0;
    }

    @Override
    public Set<TGModel> incomingEdgesOf(Long aLong) {
        return null;
    }

    @Override
    public int outDegreeOf(Long aLong) {
        return 0;
    }

    @Override
    public Set<TGModel> outgoingEdgesOf(Long aLong) {
        return null;
    }

    @Override
    public boolean removeAllEdges(Collection<? extends TGModel> collection) {
        return false;
    }

    @Override
    public Set<TGModel> removeAllEdges(Long aLong, Long v1) {
        return null;
    }

    @Override
    public boolean removeAllVertices(Collection<? extends Long> collection) {
        return false;
    }

    @Override
    public TGModel removeEdge(Long aLong, Long v1) {
        return null;
    }

    @Override
    public boolean removeEdge(TGModel tgModel) {
        return false;
    }

    @Override
    public boolean removeVertex(Long aLong) {
        return false;
    }

    @Override
    public Set<Long> vertexSet() {
        return null;
    }

    @Override
    public Long getEdgeSource(TGModel tgModel) {
        return null;
    }

    @Override
    public Long getEdgeTarget(TGModel tgModel) {
        return null;
    }

    @Override
    public GraphType getType() {
        return null;
    }

    @Override
    public double getEdgeWeight(TGModel tgModel) {
        return 0;
    }

    @Override
    public void setEdgeWeight(TGModel tgModel, double v) {

    }
}
