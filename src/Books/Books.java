package Books;

import java.util.*;


public class Books implements ShowListBooks {
    public static Map<String, List<String>> getListBooks() {
        Map<String, List<String>> authorBookMap = new HashMap<>();
        authorBookMap.put("Daria Doncova", ListBooks.dariaDoncova());
        authorBookMap.put("Boris Akunin", ListBooks.borisAkunin());
        authorBookMap.put("Agata Kristi", ListBooks.agataKristi());
        return authorBookMap;
    }

}