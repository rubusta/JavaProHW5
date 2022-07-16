package Cat;

import java.util.*;

public class Return {
    public static void printCollection(String title, Map<Cat, List<String>> hash_Cats) {

        System.out.println(title);
        hash_Cats.forEach((a, b) -> System.out.println("name: "
                + a.name + " city " + b.get(0)));
    }

    public static Map<Cat, List<String>> changeCity(Map<Cat, List<String>> A, List<String> B) {
        System.out.println(B);
        Set<Cat> allKeys = A.keySet();
        for (Cat cat : allKeys) {
            A.put(cat, B);
        }
        return A;
    }
}


