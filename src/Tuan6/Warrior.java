package Tuan6;

public class Warrior {
    private int name;
    private int hp;
    private int gold;
    private boolean isCommander;

    public Warrior(int name, int hp, int gold, boolean isCommander) {
        this.name = name;
        this.hp = hp;
        this.gold = gold;
        this.isCommander = isCommander;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public boolean isCommander() {
        return isCommander;
    }

    public void setCommander(boolean isCommander) {
        this.isCommander = isCommander;
    }

    public void attack(Warrior opponent) {
        int damage = (int) (Math.random() * 41) + 10;
        damage -= opponent.hp;
        if (opponent.hp < 0) {
            damage = 0;
        }
    }

}
