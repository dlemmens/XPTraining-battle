package be.cegeka.battle;

public enum Weapon {
    BARE_FIST(1),
    AXE(3),
    SPEAR(2),
    SWORD(2);

    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
