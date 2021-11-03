package il.ac.tau.cs.sw1.ex9.starfleet;

public abstract class myCrewMember implements CrewMember{

    private String name;
    private int age;
    private int yearsInService;

    protected myCrewMember(int age, int yearsInService, String name){

        this.name = name;
        this.age = age;
        this.yearsInService = yearsInService;

    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getYearsInService() {
        return this.yearsInService;
    }

}
