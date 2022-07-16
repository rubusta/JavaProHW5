package Car2;
import java.util.ArrayList;
import java.util.List;

public class Logic {
    public static List<Person> listAllCandidats() {
        // create a general list of all candidates
        List<Person> list = new ArrayList<>();
        list.add(new Person("Tom", true, true, 688));
        list.add(new Person("Jim", false, true, 23));
        list.add(new Person("Bob", true, true, 333));
        list.add(new Person("kim", true, false, 255));
        return list;
    }

    //check the condition of those who can drive a car
    public static List<Person> permission(List<Person> list) {
        for (Person person : listAllCandidats()) {
            if (person.getDriverLicense() && (person.getPassport()) & person.getNoFinesDays() >= 365) {
                list.add(person);
            }
        }
        return list;
    }
}


