import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarADayTest {

    @Test
    void assert_correct_value_returned(){
        DollarADay dollarADay = new DollarADay();
        int expected = 406;
        int actual = dollarADay.calculateTotal(28);

        assertEquals(expected, actual);
    }
}