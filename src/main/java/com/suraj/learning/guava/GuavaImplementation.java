package com.suraj.learning.guava;

import com.google.common.graph.Graph;
import com.google.common.graph.GraphBuilder;

public class GuavaImplementation {
    private void tryGuavaCode() {
        //GraphUtil util;
        Graph<Integer> graph = GraphBuilder
                .directed()
                .allowsSelfLoops(false).build();

    }
}
