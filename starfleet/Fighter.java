package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Fighter extends myArmedSpaceShip {


	private List<Weapon> weapons;

	public Fighter(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons){
		super(name, commissionYear, maximalSpeed, crewMembers,weapons);

	}

	@Override
	public int getAnnualMaintenanceCost() {
		return (int) (2500 + getWeaponsCost() + getMaximalSpeed());

	}
}
