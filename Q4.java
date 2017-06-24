import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string with mixed character set: ");
        String str=scan.nextLine();
        str = str.replaceAll(" ","");

        int upperCase=0,lowerCase=0,digits=0,special=0;

        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i)))
                lowerCase++;
            else if(Character.isUpperCase(str.charAt(i)))
                upperCase++;
            else if(Character.isDigit(str.charAt(i)))
                digits++;
            else
                special++;
        }

        int len=str.length();

        double upperCasePer=(upperCase*100.0)/len;
        double lowerCasePer=(lowerCase*100.0)/len;
        double digitsPer=(digits*100.0)/len;
        double specialPer=(special*100.0)/len;

        System.out.println("Number of Upper case characters: "+upperCase);
        System.out.println("Number of Lower case characters: "+lowerCase);
        System.out.println("Number of Digits: "+digits);
        System.out.println("Number of special characters: "+special);

        System.out.println("Percentage of Upper case characters: "+upperCasePer);
        System.out.println("Percentage of Lower case characters: "+lowerCasePer);
        System.out.println("Percentage of Digits: "+digitsPer);
        System.out.println("Percentage of special characters: "+specialPer);

    }
}
