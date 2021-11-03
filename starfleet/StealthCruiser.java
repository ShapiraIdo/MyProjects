package il.ac.tau.cs.sw1.ex9.starfleet;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class StealthCruiser extends Fighter {

	private static int num_of_StealthCruiser = 0;

	public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons) {
		super(name, commissionYear, maximalSpeed, crewMembers, weapons);
		num_of_StealthCruiser++;
	}

	public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers){
		super(name, commissionYear, maximalSpeed, crewMembers,
				new ArrayList<Weapon>((Collection<Weapon>) new Weapon ("Laser Cannons",10,100)));
		num_of_StealthCruiser++;
	}

	@Override
	public int getAnnualMaintenanceCost() {
		return super.getAnnualMaintenanceCost() + num_of_StealthCruiser*50;
	}
}
