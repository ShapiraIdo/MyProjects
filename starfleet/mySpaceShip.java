package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Set;

public abstract class mySpaceShip implements Spaceship {

    private String name;
    private  int commissionYear;
    private  float maximalSpeed;
    private  Set<CrewMember> crewMembers;

    protected mySpaceShip(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers) {
        this.name = name;
        this.commissionYear = commissionYear;
        this.maximalSpeed = maximalSpeed;
        this.crewMembers = crewMembers;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCommissionYear() {
        return this.commissionYear;
    }

    @Override
    public float getMaximalSpeed() {
        return this.maximalSpeed;
    }

    @Override
    public int getFirePower() {
        return 10;
    }

    @Override
    public Set<? extends CrewMember> getCrewMembers() {
        return this.crewMembers;
    }

    @Override
    public abstract int getAnnualMaintenanceCost();
}
