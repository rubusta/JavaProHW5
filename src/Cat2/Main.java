package Cat2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("Tom","Kiev",3));
        list.add(new Cat("Jim","Lviv",4));
        list.add(new Cat("Bob","Luck",6));

        System.out.println("List of all cats before moving: " + list);

        allCatsMove(list);
    }
    private static ArrayList<Cat> allCatsMove(ArrayList<Cat> list) {
        for (int i = 0; i < list.size();  i++) {

            list.get(i).setCity("Krakov");

        }
        System.out.println("Cats after moving live in city:" + list);
        return list;
    }
}
