package Car;

public class Person {
    public String name;
    public boolean passport;
    public boolean driverLicense;

    public int fines;
//create a constructor
    public Person(String name, boolean passport, boolean driverLicense, int noFinesDays) {
        this.name = name;
        this.passport = passport;
        this.driverLicense = driverLicense;
        this.fines = noFinesDays;
    }
    //create a getters
    public boolean getPassport() {
        return passport;
    }
    public boolean getDriverLicense() {
        return driverLicense;
    }

    public int getNoFinesDays() {
        return fines;
    }
//redefine
    @Override
    public String toString() {
        return "Person: " +
                "name: " + name +
                "age: " + passport +
                "driverLicense: " + driverLicense +
                "noFinesDays: " + fines +
                '\n';
    }
}

