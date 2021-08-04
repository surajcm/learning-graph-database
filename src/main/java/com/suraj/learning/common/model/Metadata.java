package com.suraj.learning.common.model;

public class Metadata {
    private Long parent;
    private Long[] children;

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long[] getChildren() {
        return children;
    }

    public void setChildren(Long[] children) {
        this.children = children;
    }
}
