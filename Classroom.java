import java.util.*;
public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list1  = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        // get element - o(1)
        int element = list1.get(2);
        System.out.println(element);

        // remove or delete element

        list1.remove(2);
        System.out.println(list1);

        }
}
