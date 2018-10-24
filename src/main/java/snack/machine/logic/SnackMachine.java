package snack.machine.logic;

import app.Entity;
import lombok.Data;
import snack.machine.model.Money;

@Data
//@Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter
// and @RequiredArgsConstructor/
public final class SnackMachine extends Entity {

    private Money moneyInside;
    private Money moneyTransaction;

    public void insertMoney(Money money) {
        Money.sum(money, moneyTransaction);
    }

    public void returnMoney() {
//       moneyTransaction = 0
    }

    public void buy() {
        Money.sum(moneyInside, moneyTransaction);
        //       moneyTransaction = 0
    }
}






