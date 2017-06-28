import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.util.stream.Collectors;

public class Q6Employee {

    private String name;
    private int age;
	
	public Q6Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString(){
        return "Employee Name: "+this.name
                +"  Age: "+this.age;
    }

    public static void main(String[] args) {

        List<Q6Employee> emp= Arrays.asList(new Q6Employee("neena",26),new Q6Employee("nimisha",28),new Q6Employee("sara",21),new Q6Employee("kiara",29),new Q6Employee("naira",23));
        System.out.println("Employee List : ");
        System.out.println(emp);
        List<Q6Employee> filteredemp = emp.stream().filter(e->e.getName().startsWith("n") && e.getAge() > 24).collect(Collectors.toList());
        System.out.println("Employees whose name start with n and age is greater than 24 : ");
        filteredemp.forEach(u -> System.out.println("\t" + u));

    }

}
