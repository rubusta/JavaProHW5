package Car2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //print data to console
        List<Person> driversList = new ArrayList<>();
        System.out.println("List of all people:" + "\n" + Logic.listAllCandidats() + "\n\n" +
                "List of all who can drive car:" + "\n" + Logic.permission(driversList));
    }
}


