import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Q4Employee{

    String name;
    Double age;
    Double salary;

    public Q4Employee(){
        this.name=null;
        this.age=0.0;
        this.salary=0.0;
    }

    public Q4Employee(String n, double a, double s){
        this.name = n;
        this.age= a;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+this.name+" Age: "+this.age+" Salary: "+this.salary;
    }

    public static void main(String args[])
    {
        salComparator sc= new salComparator();
        Set<Q4Employee> empSet= new TreeSet<>(sc);
        Q4Employee employee1=new Q4Employee();
        Q4Employee employee2=new Q4Employee();
        Q4Employee employee3=new Q4Employee();
        Q4Employee employee4= new Q4Employee();
        Q4Employee employee5=new Q4Employee();
        Q4Employee employee6=new Q4Employee();

        employee1.setName("Avani");
        employee1.setAge((double) 23);
        employee1.setSalary((double)15000);
        empSet.add(employee1);

        employee2.setName("Astha");
        employee2.setAge((double)28);
        employee2.setSalary((double)12000);
        empSet.add(employee2);

        employee3.setName("Shivangi");
        employee3.setAge((double)26);
        employee3.setSalary((double)13400);
        empSet.add(employee3);

        employee4.setName("Nimisha");
        employee4.setAge((double)24);
        employee4.setSalary((double)17800);
        empSet.add(employee4);

        employee5.setName("Avaleen");
        employee5.setAge((double)23);
        employee5.setSalary((double)15990);
        empSet.add(employee5);

        employee6.setName("Ankita");
        employee6.setAge((double)21);
        employee6.setSalary((double)10000);
        empSet.add(employee6);

        for(Q4Employee e : empSet){
            System.out.println(e);
        }
    }

}

class salComparator implements Comparator<Q4Employee> {

    public int compare(Q4Employee o1, Q4Employee o2) {

        if ((o1).salary < (o2).salary)
            return 1;
        else
            return -1;
    }
}


