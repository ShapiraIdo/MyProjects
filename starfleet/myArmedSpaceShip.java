package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public abstract class myArmedSpaceShip extends mySpaceShip {

    private List<Weapon> weapons;

    protected myArmedSpaceShip(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers,List<Weapon> weapons) {
        super(name, commissionYear, maximalSpeed, crewMembers);
        this.weapons = weapons;
    }

    public List<Weapon> getWeapon(){
        return this.weapons;
    }

    @Override
    public int getFirePower() {

        int sum_weapons_fire_power = 0;

        sum_weapons_fire_power = weapons.stream().map(a->a.getFirePower())
                .reduce(0,(a,b)->a+b);

        return super.getFirePower() + sum_weapons_fire_power;
    }

    public int getWeaponsCost(){
        return weapons.stream().map(a->a.getAnnualMaintenanceCost())
                .reduce(0,(a,b)->a+b);
    }
}
