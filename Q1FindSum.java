import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1FindSum {
    public static void main(String args[])
    {
        List<Float> numList = new ArrayList<>();
        numList.add(1.5f);
        numList.add(8.5f);
        numList.add(5.8f);
        numList.add(2.9f);
        numList.add(10.5f);

        Float sum = 0.0f;
        System.out.println("The numbers in list are : ");
        Iterator<Float> floatIterator = numList.iterator();
        while(floatIterator.hasNext()){
            Float obj = floatIterator.next();
            System.out.println(obj);
            sum+=obj;
        }
        System.out.println("The sum of numbers is : " + sum);
    }

}

