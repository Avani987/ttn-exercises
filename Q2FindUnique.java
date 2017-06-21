import java.util.*;

public class Q2FindUnique {

    public static void main(String a[])
    {
        String str = "this is a sample string";
        Q2FindUnique fu =  new Q2FindUnique();
        int size= fu.uniqueChars(str);
        System.out.println("The number of unique characters in string : " + size);
    }

    int uniqueChars(String str)
    {
        System.out.println("The string is : " + str);
        str = str.replaceAll(" ", "");
        Set<String> charset = new HashSet<>();
        List<String> list= Arrays.asList(str.split(""));
        int ufreq=0;
        for(String ch : list) {
            ufreq= Collections.frequency(list,ch);
            if(ufreq > 1)
                continue;
            else
                charset.add(ch);
        }
        System.out.println("The characters are : " + charset);
        int size = charset.size();
        return size;
    }
}

