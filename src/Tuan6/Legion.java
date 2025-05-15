package Tuan6;

import java.util.List;

public class Legion {
    public List<Warrior> warriors;

    public Legion(List<Warrior> warriors) {
        this.warriors = warriors;
    }

    public int getTotalHP() {
        int sum = 0;
        for (Warrior warrior : warriors) {
            sum += warrior.getHp();
        }
        return sum;
    }

    public boolean hasCommander() {
        for (Warrior warrior : warriors) {
            if (warrior.isCommander()) {
                return true;
            }
        }
        return false;
    }
}
