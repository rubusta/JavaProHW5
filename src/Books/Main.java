package Books;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("List of authors :" + Books.getListBooks().keySet());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of author: ");
        String nameAuthor = sc.nextLine();
        sc.close();

        Map<String, List<String>> authorBookMap = Books.getListBooks();
        System.out.println("The list of books of: " + nameAuthor
                + ReturnMethod.listBooksAuthor(nameAuthor, authorBookMap));


    }

}

