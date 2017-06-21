import java.util.*;

public class Q6 {
    public static void main(String[] args)
    {
        List<String> arrlist = new ArrayList();
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("C");
        arrlist.add("C");
        System.out.println("Elements in array are : "+ arrlist);
        Map<String,Integer> arrcount = new HashMap<>();
        int arrfreq=0;
        for(String n : arrlist) {
            arrfreq = Collections.frequency(arrlist,n);
            if(arrcount.containsKey(n))
                continue;
            else
                arrcount.put(n,arrfreq);
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (Map.Entry<String, Integer> entry : arrcount.entrySet()) {
            if(set.contains(entry.getValue()))
                continue;
            else
                System.out.println("Value = " + entry.getKey() + ", Frequency = " + entry.getValue());
            set.add(entry.getValue());
        }
    }
}
