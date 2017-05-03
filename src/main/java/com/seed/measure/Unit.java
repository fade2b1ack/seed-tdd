package com.seed.measure;

/**
 * Created by fade2b1ack on 2017.5.3.
 */
public enum Unit {
    BASE(1),
    YARD(1760),
    MILE(1),
    FEED(5280), INCH(63360);
    Integer weight;

    Unit(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

}
