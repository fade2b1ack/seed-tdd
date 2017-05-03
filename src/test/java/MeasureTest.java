import com.seed.measure.Distance;
import com.seed.measure.Unit;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by fade2b1ack on 2017.5.3.
 */
public class MeasureTest {

    private Distance distance;
    private Distance anotherDistance;
    private Boolean isEquals;

    @Test
    public void should_return_true_when_input_same_length_and_same_unit() {
        //given
        distance = new Distance(3, Unit.MILE);
        anotherDistance = new Distance(3, Unit.MILE);

        //when
        isEquals = distance.equal(anotherDistance);

        //then
        assertThat(isEquals, is(true));
    }

    @Test
    public void should_return_false_when_input_same_length_but_different_unit() {
        //given
        distance = new Distance(3, Unit.YARD);
        anotherDistance = new Distance(3, Unit.MILE);
        //when
        isEquals = distance.equal(anotherDistance);

        //then
        assertThat(isEquals, is(false));
    }

    @Test
    public void should_return_true_when_input_1_mile_and_1760_yard() {
        //given
        distance = new Distance(1, Unit.MILE);
        anotherDistance = new Distance(1760, Unit.YARD);
        //when
        isEquals = distance.equal(anotherDistance);

        //then
        assertThat(isEquals, is(true));
    }

    @Test
    public void should_return_true_when_input_1_yard_and_3_feed() {
        //given
        distance = new Distance(1, Unit.YARD);
        anotherDistance = new Distance(3, Unit.FEED);
        //when
        isEquals = distance.equal(anotherDistance);
        //then
        assertThat(isEquals, is(true));
    }

    @Test
    public void should_return_true_when_input_1_feed_and_12_inch() {
        //given
        distance = new Distance(1, Unit.FEED);
        anotherDistance = new Distance(12, Unit.INCH);
        //when
        isEquals = distance.equal(anotherDistance);
        //then
        assertThat(isEquals, is(true));
    }


}
