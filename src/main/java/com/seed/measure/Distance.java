package com.seed.measure;

/**
 * Created by fade2b1ack on 2017.5.3.
 */
public class Distance {
    private final Integer length;
    private final Unit unit;

    public Distance(Integer length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public Boolean equal(Distance anotherDistance) {
        Integer thisBaseLength = getLength() * anotherDistance.getUnit().getWeight() * Unit.BASE.getWeight();
        Integer anotherBaseLength = anotherDistance.getLength() * getUnit().getWeight() * Unit.BASE.getWeight();
        return thisBaseLength.equals(anotherBaseLength);
    }

    public Integer getLength() {
        return length;
    }

    public Unit getUnit() {
        return unit;
    }
}
