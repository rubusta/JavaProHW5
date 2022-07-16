package Cat;
import java.util.*;

public class Logic {
    public static void main(String[] args) {

        Map<Cat, List<String>> hash_Cats = new HashMap<>();
        var city1 = new ArrayList<String>();
        var city2 = new ArrayList<String>();

        city1.add("Kiev");
        city2.add("Odessa");


        hash_Cats.put(new Cat("Murzik"), city1);
        hash_Cats.put(new Cat("Tom"), city1);
        hash_Cats.put(new Cat("Jerry"), city1);

        Return.printCollection("Koti jivut v Kieve: ", hash_Cats);

        Return.printCollection("Koti reshili pereehat v Odessu: ",
                 Return.changeCity(hash_Cats, city2));

    }
}



