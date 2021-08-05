package com.suraj.learning.common.model;

import java.util.Set;

public class Metadata {
    private Long parent;
    private Set<Long> children;

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Set<Long> getChildren() {
        return children;
    }

    public void setChildren(Set<Long> children) {
        this.children = children;
    }
}
