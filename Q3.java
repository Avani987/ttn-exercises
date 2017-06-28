import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Q3 {
    private int id;
    public String name;
    public int age;


    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
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

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Q3 q= new Q3();
        q.setName("Avani");
        q.setAge(23);
        q.setId(110);

        Field[] fields = q.getClass().getFields();
        Method[] methods = q.getClass().getDeclaredMethods();
        for(Field f :fields) {
            System.out.println("Field Name : " +f.getName()+" Type : "+f.getType());
        }
        for(Method m :methods) {
            System.out.println("Method Name : "+m.getName()+" Type : "+m.getReturnType());

        }

    }

}
