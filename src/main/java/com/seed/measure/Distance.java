package com.seed.measure;

/**
 * Created by fadeb1ack on 2017.5.3.
 */
public class Distance {
    private final Integer length;
    private final Unit unit;

    public Distance(Integer length, Unit unit) {

        this.length = length;
        this.unit = unit;
    }

    public Boolean equal(Distance anotherDistance) {

        return getLength().equals(anotherDistance.getLength()) && getUnit().equals(anotherDistance.getUnit());
    }

    public Integer getLength() {
        return length;
    }

    public Unit getUnit() {
        return unit;
    }
}
