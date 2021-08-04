package com.suraj.learning.guava;

import com.google.common.graph.Graph;
import com.google.common.graph.GraphBuilder;

public class GuavaImplementation {
    private void tryGuavaCode() {
        Graph<Integer> graph = GraphBuilder
                .directed()
                .allowsSelfLoops(false).build();

    }
}
