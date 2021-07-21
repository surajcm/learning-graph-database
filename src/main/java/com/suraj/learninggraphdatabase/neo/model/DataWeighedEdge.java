package com.suraj.learninggraphdatabase.neo.model;

import org.jgrapht.graph.DefaultWeightedEdge;

public class DataWeighedEdge extends DefaultWeightedEdge {

    private Object relationMetadata;

    public DataWeighedEdge() {
        super();
    }

    /**
     * Get edge metadata
     *
     * @return edgeMetadata object
     */
    public Object getRelationMetadata() {
        return relationMetadata;
    }

    /**
     * Set edge metadata
     *
     * @param relationMetadata Set the Edge relational metadata
     */
    public void setRelationMetadata(Object relationMetadata) {
        this.relationMetadata = relationMetadata;

    }

    @Override
    public String toString() {
        return "DataWeighedEdge{" +
                "relationMetadata=" + relationMetadata +
                '}';
    }

    /**
     * @return Get the edge parent vertex
     */

    public Object getSourceVertex() {
        return this.getSource();

    }

    /**
     * @return Get the edge child vertex
     */
    public Object getTargetVertex() {
        return this.getTarget();
    }
}

