package com.suraj.learning.common.model;

public interface Graph <T extends TGModel> {

    void addNode(T e);
    void removeNode(T e);


}
