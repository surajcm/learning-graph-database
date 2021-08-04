package com.suraj.learning.jgrapht;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.DirectedWeightedMultigraph;
import org.jgrapht.graph.builder.GraphTypeBuilder;

public class JGraphImplementation {
    private String graphTraversal() {
        DirectedWeightedMultigraph<String, DefaultWeightedEdge> graphTime =
                new DirectedWeightedMultigraph<>(DefaultWeightedEdge.class);
        return "hi";
    }

    private static Graph<Integer, DefaultEdge> buildEmptySimpleGraph() {
        return GraphTypeBuilder.<Integer, DefaultEdge> undirected().allowingMultipleEdges(false)
                .allowingSelfLoops(false).edgeClass(DefaultEdge.class).weighted(false).buildGraph();
    }
}
