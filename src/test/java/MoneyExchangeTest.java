import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

public class MoneyExchangeTest {
    private MoneyExchange dollarsAndBolivianos;

    @Before
    public void setUp() {
        BigDecimal purchaseRate = new BigDecimal("6.95");
        BigDecimal saleRate = new BigDecimal("6.97");
        dollarsAndBolivianos = new MoneyExchange(purchaseRate, saleRate);
    }

    @Test
    public void change_Case1_FromDollarsToBolivianos() {
        Money result = dollarsAndBolivianos.change(new Money("Dollars", new BigDecimal("100")));
        assertEquals(new BigDecimal("695").setScale(2, RoundingMode.FLOOR), result.getValue());
        assertEquals("Bolivianos", result.getName());
    }

    @Test
    public void change_Case2_FromBolivianosToDollars() {
        Money result = dollarsAndBolivianos.change(new Money("Bolivianos", new BigDecimal("697")));
        assertEquals(new BigDecimal("100").setScale(2, RoundingMode.FLOOR), result.getValue());
        assertEquals("Dollars", result.getName());
    }

    @Test
    public void change_Case3_FromDollarsToBolivianos() {
        Money result = dollarsAndBolivianos.change(new Money("Dollars", new BigDecimal("50")));
        assertEquals(new BigDecimal("347.5").setScale(2, RoundingMode.FLOOR), result.getValue());
        assertEquals("Bolivianos", result.getName());
    }

    @Test
    public void change_Case4_FromBolivianosToDollars() {
        Money result = dollarsAndBolivianos.change(new Money("Bolivianos", new BigDecimal("348.5")));
        assertEquals(new BigDecimal("50").setScale(2, RoundingMode.FLOOR), result.getValue());
        assertEquals("Dollars", result.getName());
    }
}