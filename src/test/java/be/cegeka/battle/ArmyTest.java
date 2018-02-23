package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static be.cegeka.battle.Weapon.AXE;
import static be.cegeka.battle.Weapon.SWORD;
import static org.assertj.core.api.Assertions.assertThat;

public class ArmyTest {

    @Test
    public void asASoldier_ICanEnlistInAnArmy() throws Exception {
        Soldier soldier = new Soldier("Nicky", AXE);
        Army army = new Army();
        army.enroll(soldier);

        assertThat(army.getSoldiers()).contains(soldier);
    }

    @Test
    public void whenEnlistedSoldiersFrontMan_shouldBeFirstEnlistedSoldier() throws Exception {
        Soldier firstSoldier = new Soldier("Nicky", AXE);
        Soldier secondSoldier = new Soldier("Thibault", SWORD);

        Army army = new Army();
        army.enroll(firstSoldier);
        army.enroll(secondSoldier);

        assertThat(army.getFrontMan()).isEqualTo(firstSoldier);
    }

}
