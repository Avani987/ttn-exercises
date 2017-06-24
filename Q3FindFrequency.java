import java.util.*;

public class Q3FindFrequency {

    public static void main(String args[])
    {
        String s = "abeaccebbb";
        System.out.println("The string is : " + s);
        Q3FindFrequency ff = new Q3FindFrequency();
        ff.printFreq(s);
    }

    void printFreq(String s)
    {
        s = s.replaceAll(" ", "");
        Map<String,Integer> count = new HashMap<>();
        List<String> list= Arrays.asList(s.split(""));
        int freq=0;
        for(String num : list) {
            freq = Collections.frequency(list,num);
            if(count.containsKey(num))
                continue;
            else
                count.put(num,freq);
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println("Character = " + entry.getKey() + ", Count = " + entry.getValue());
        }
    }
}
