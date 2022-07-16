package Books;

import java.util.*;


public class LogicBooks {

    private static List<String> doncova() {
        List<String> doncova = new ArrayList<>();
        doncova.add("Dama s kogotkami");
        doncova.add("Jena moego muga");
        doncova.add("Za vsemi zaicami");
        return doncova;

    }

    private static List<String> borisAkunin() {
        List<String> borisAkunin = new ArrayList<>();
        borisAkunin.add("jhfshfj");
        borisAkunin.add("jhfuhf");
        borisAkunin.add("jfwkfh");
        return borisAkunin;

    }

    private static List<String> agataKristi() {
        List<String> agataKristi = new ArrayList<>();
        agataKristi.add("jhvbsf");
        agataKristi.add("kjfkj");
        return agataKristi;

    }

    public static List<String> getListAuthors() {
        Map<String, List<String>> listAuthors = new HashMap<>();
        listAuthors.put("doncova", doncova());
        listAuthors.put("boris akunin", borisAkunin());
        listAuthors.put("agata Kristi", agataKristi());
        return getListAuthors();
    }
}
