package be.cegeka.battle;

import org.apache.commons.lang3.Validate;

import static be.cegeka.battle.Weapon.BARE_FIST;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private final String name;
    private Weapon weapon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon = BARE_FIST;
    }
    public Soldier(String name, Weapon weapon) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon = weapon;
    }

    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String fight(Soldier soldier) {
        if (soldier.weapon.getDamage() >= this.weapon.getDamage()) {

            return soldier.getName();
        }
        return this.getName();
    }

}
