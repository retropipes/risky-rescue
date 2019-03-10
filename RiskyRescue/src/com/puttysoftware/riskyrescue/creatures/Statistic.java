/*  Risky Rescue: A Roguelike RPG
 Copyright (C) 2013-2014 Eric Ahnell

 Any questions should be directed to the author via email at: support@puttysoftware.com
 */
package com.puttysoftware.riskyrescue.creatures;

class Statistic {
    // Fields
    private int value;
    private boolean hasMax;
    private int maxID;
    private final boolean hasMin;
    private int minVal;

    // Constructor
    Statistic() {
        this.value = 0;
        this.hasMax = false;
        this.maxID = StatConstants.STAT_NONE;
        this.hasMin = true;
        this.minVal = 0;
    }

    // Methods
    int getValue() {
        return this.value;
    }

    void setValue(int newValue) {
        this.value = newValue;
    }

    void offsetValue(int newValue) {
        this.value += newValue;
    }

    boolean hasMax() {
        return this.hasMax;
    }

    void setHasMax(boolean newHasMax) {
        this.hasMax = newHasMax;
    }

    int getMaxID() {
        return this.maxID;
    }

    void setMaxID(int newMaxID) {
        this.maxID = newMaxID;
    }

    boolean hasMin() {
        return this.hasMin;
    }

    int getMinVal() {
        return this.minVal;
    }

    void setMinVal(int newMinVal) {
        this.minVal = newMinVal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.hasMax ? 1231 : 1237);
        result = prime * result + (this.hasMin ? 1231 : 1237);
        result = prime * result + this.maxID;
        result = prime * result + this.minVal;
        return prime * result + this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Statistic)) {
            return false;
        }
        Statistic other = (Statistic) obj;
        if (this.hasMax != other.hasMax) {
            return false;
        }
        if (this.hasMin != other.hasMin) {
            return false;
        }
        if (this.maxID != other.maxID) {
            return false;
        }
        if (this.minVal != other.minVal) {
            return false;
        }
        if (this.value != other.value) {
            return false;
        }
        return true;
    }
}
