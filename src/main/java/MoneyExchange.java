import java.math.BigDecimal;
import java.math.RoundingMode;

class MoneyExchange {
    private BigDecimal purchaseRate;
    private BigDecimal saleRate;

    MoneyExchange(BigDecimal purchaseRate, BigDecimal saleRate) {
        this.purchaseRate = purchaseRate;
        this.saleRate = saleRate;
    }

    Money change(Money money) {
        if ("Dollars".equals(money.getName())) {
            return new Money("Bolivianos", money.getValue().multiply(purchaseRate));
        } else {
            //noinspection SingleStatementInBlock,BigDecimalMethodWithoutRoundingCalled
            return new Money("Dollars", money.getValue().divide(saleRate).setScale(2, RoundingMode.FLOOR));
        }
    }
}
