package com.suraj.learning.common.model;

public class TGModel {
    private boolean isDGEnabled;
    private String destinationType;
    private Metadata metadata;

    public boolean isDGEnabled() {
        return isDGEnabled;
    }

    public void setDGEnabled(boolean DGEnabled) {
        isDGEnabled = DGEnabled;
    }

    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
