public class Q11 {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    float multiply(float a,float b){
        return a*b;
    }
    int multiply(int a,int b){
        return a*b;
    }
    String concat(String a, String b){
        return a+b;
    }
    String concat(String a, String b,String c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Q11 obj=new Q11();
        System.out.println("2+3 = " + obj.add(2,3));
        System.out.println("2.4 + 9.1 = "+obj.add(2.4,9.1));
        System.out.println("1.2 X 8.1 = " +obj.multiply((float)1.2,(float)8.1));
        System.out.println("2 X 4 = " +obj.multiply(2,4));
        System.out.println("abc + def is "+ obj.concat("abc","def"));
        System.out.println("a1 + b1 + c1 is "+ obj.concat("a1","b1","c1"));

    }



}

