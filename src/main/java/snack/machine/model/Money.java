package snack.machine.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.BiFunction;


@Data
@AllArgsConstructor
public class Money {
    private int oneCentCount;
    private int tenCentCount;
    private int quarterCentCount;
    private int oneDollarCount;
    private int fiveDollarCount;
    private int twentyDollarCount;

    public static Money sum(Money money1, Money money2) {
        BiFunction<Money, Money, Money> function = (m1, m2) -> new Money(
                m1.oneCentCount + m2.oneCentCount,
                m1.tenCentCount + m2.tenCentCount,
                m1.quarterCentCount + m2.quarterCentCount,
                m1.oneDollarCount + m2.oneDollarCount,
                m1.fiveDollarCount + m2.fiveDollarCount,
                m1.twentyDollarCount + m2.twentyDollarCount);
        return function.apply(money1, money2);
    }

}
