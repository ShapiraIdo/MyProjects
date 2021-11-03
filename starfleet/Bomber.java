package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Bomber extends myArmedSpaceShip{

	private int numberOfTechnicians;

	public Bomber(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons, int numberOfTechnicians){
		super(name, commissionYear, maximalSpeed, crewMembers, weapons);

		this.numberOfTechnicians = numberOfTechnicians;
	}

	public int getNumberOfTechnicians(){
		return this.numberOfTechnicians;
	}

	@Override
	public int getAnnualMaintenanceCost() {
		return (int) (5000 + getWeaponsCost() *( 1 - (0.1*numberOfTechnicians)));
	}
}
