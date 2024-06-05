package com.ey.problem4;

import java.io.Serializable;

public class CallDetailRecord implements Serializable {
    private int fromNumber;
    private int toNumber;
    private float duration;
    private float charge;

    public CallDetailRecord(int fromNumber, int toNumber, float duration) {
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.duration = duration;
        this.charge = calculateCharge();
    }

    private float calculateCharge() {
        return duration * 1; // 1 Rupee per minute rate
    }

    @Override
    public String toString() {
        return "From: " + fromNumber + ", To: " + toNumber + ", Charge: " + charge;
    }
}
