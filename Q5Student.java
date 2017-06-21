import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Q5Student {

    String Name;
    Double Score;
    Double Age;

    public Q5Student()
    {
        this.Name=null;
        this.Age=0.0;
        this.Score=0.0;
    }

    public Q5Student(String n, double ag, double sc){
        this.Name=n;
        this.Score=sc;
        this.Age=ag;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public Double getAge() {
        return Age;
    }

    public void setAge(Double age) {
        Age = age;
    }

    public String toString()
    {
        return "Name : "+this.Name+" Age: "+this.Age+" Score: "+this.Score;
    }

    public static void main(String args[])
    {
        CompByScoreAndFname score= new CompByScoreAndFname();
        Set<Q5Student> studentsc= new TreeSet<>(score);

        studentsc.add(new Q5Student("Avani",(double)24,(double)52));
        studentsc.add(new Q5Student("Anamika",(double)26,(double)57));
        studentsc.add(new Q5Student("Shreya",(double)22,(double)53));
        studentsc.add(new Q5Student("Garima",(double)28,(double)52));

        for(Q5Student s : studentsc){
            System.out.println(s);
        }
    }
}

class CompByScoreAndFname implements Comparator<Q5Student> {

    public int compare(Q5Student s1, Q5Student s2) {

        double flag= s1.getScore() - s2.getScore();
        if(flag==0)
            flag=s1.getName().compareTo(s2.getName());
        return (int) flag;

    }
}


