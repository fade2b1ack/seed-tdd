import com.seed.measure.Distance;
import com.seed.measure.Unit;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by fadeb1ack on 2017.5.3.
 */
public class MeasureTest {
    @Test
    public void should_return_true_when_input_same_length_and_same_unit() {
        //given
        Distance distance = new Distance(3, Unit.MILE);
        Distance anotherDistance = new Distance(3, Unit.MILE);

        //when
        Boolean isEquals = distance.equal(anotherDistance);

        //then
        assertThat(isEquals, is(true));
    }
}
