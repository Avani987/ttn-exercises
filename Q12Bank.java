public class Q12Bank {
    public void getDetails() {
        System.out.println("Function of Bank class");
    }

    public static void main(String[] args)
    {
        Q12Bank b=new Q12Bank();
        b.getDetails();
        Q12Bank sbi=new SBI();
        sbi.getDetails();
        Q12Bank boi=new BOI();
        boi.getDetails();
        Q12Bank icici=new ICICI();
        icici.getDetails();
    }

}

class SBI extends Q12Bank{
    static float ROI=(float)6.6;
    static String name="SBI";
    static String location="DELHI";
    @Override
    public void getDetails() {
        System.out.println("ROI: "+ROI);
        System.out.println("NAME: "+name);
        System.out.println("LOCATION: "+location);
    }


}

class BOI extends Q12Bank{
    static float ROI=(float)9.6;
    static String name="BOI";
    static String location="GUJRAT";

    @Override
    public void getDetails() {
        System.out.println("ROI: "+ROI);
        System.out.println("NAME: "+name);
        System.out.println("LOCATION: "+location);

    }
}

class ICICI extends Q12Bank{
    static float ROI=(float)12.6;
    static String name="ICICI";
    static String location="GOA";
    @Override
    public void getDetails() {
        System.out.println("ROI: "+ROI);
        System.out.println("NAME: "+name);
        System.out.println("LOCATION: "+location);

    }
}

