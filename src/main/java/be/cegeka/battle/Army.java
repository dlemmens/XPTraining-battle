package be.cegeka.battle;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Army {


    private List<Soldier> soldiers = new ArrayList<>();

    public void enroll(Soldier soldier) {
        soldiers.add(soldier);
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public Soldier getFrontMan() {
        return soldiers.get(0);
    }
}
