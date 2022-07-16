package Books;

import java.util.*;

public class ReturnMethod {
    public static List<String> listBooksAuthor
                (String userAuthor, Map<String, List<String>> authorBookMap) {
            return authorBookMap.get(userAuthor);

        }
    }

