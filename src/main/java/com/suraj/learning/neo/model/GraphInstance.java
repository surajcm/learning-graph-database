package com.suraj.learning.neo.model;

import org.jgrapht.graph.Multigraph;

public class GraphInstance {
    private static Multigraph<InternalNode, DataWeighedEdge>
            multiGraph = new Multigraph<>(DataWeighedEdge.class);

    /**
     * @return the Multigraph instance
     */
    public static Multigraph<InternalNode, DataWeighedEdge> getMultiGraph() {
        return multiGraph;
    }

    /**
     * Set the provided Multigraph instance
     *
     * @param multiGraph
     */
    public static void setMultiGraph(Multigraph<InternalNode, DataWeighedEdge> multiGraph) {
        GraphInstance.multiGraph = multiGraph;
    }

}
