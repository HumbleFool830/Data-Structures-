import java.util.LinkedList;
import java.util.List;

public class linkedList{
   public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();   // by using collections frame work.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i=0;i<list.size();i++)   // traversing each and element in linked list.
        {
            System.out.print(list.get(i)+" --> ");
        }
    }
}