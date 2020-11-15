package org.personalfebus;

import java.io.Serializable;

public class Transfer implements Serializable {
    private long originId;
    private long destinationId;
    private boolean isCancelled;
    private long delay;

    public Transfer(long origId, long destId) {
        originId = origId;
        destinationId = destId;
    }

    public void setDelay(long d) {
        delay = d;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}