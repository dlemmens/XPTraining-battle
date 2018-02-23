package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static be.cegeka.battle.Weapon.AXE;
import static be.cegeka.battle.Weapon.SPEAR;
import static be.cegeka.battle.Weapon.SWORD;
import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test
    public void everySoldierHasAWeapon() throws Exception {
        Soldier soldier = new Soldier("Gerri");
        assertThat(soldier.getWeapon()).isNotNull();
    }

    @Test
    public void givenWeaponIsAxe_soldierShouldHaveWeaponAxe() throws Exception {
        Soldier soldier = new Soldier("Gerri", AXE);
        assertThat(soldier.getWeapon()).isEqualTo(AXE);
    }

    @Test
    public void givenWeaponIsSword_soldierShouldHaveWeaponSword() throws Exception {
        Soldier soldier = new Soldier("Gerri", SWORD);
        assertThat(soldier.getWeapon()).isEqualTo(SWORD);
    }

    @Test
    public void givenWeaponIsSpear_soldierShouldHaveWeaponSpear() throws Exception {
        Soldier soldier = new Soldier("Gerri", SPEAR);
        assertThat(soldier.getWeapon()).isEqualTo(SPEAR);
    }

    @Test
    public void whenGettingDamageOfAxe_shouldReturn3() throws Exception {
        Soldier soldier = new Soldier("Gerri", AXE);
        assertThat(soldier.getWeapon().getDamage()).isEqualTo(3);
    }
}