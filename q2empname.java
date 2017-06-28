import java.io.*;

public class q2empname implements Serializable {

    private static final long serialVersionUID = -55857686305273843L;

    private String name;
    transient private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {

        String value = "name : " + name + " \nPassword : " + password;
        return value;

    }

}

class SerializationUtil{

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    public static void serialize(Object obj, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.flush();
        oos.close();
    }
}

class SerializationTest {

    public static void main(String[] args) {
        q2empname en = new q2empname();
        en.setName("Avani");
        en.setPassword("xxxx");

        try {

            SerializationUtil.serialize(en, "serialization.txt");
            q2empname en1= (q2empname) SerializationUtil.deserialize("serialization.txt");
            System.out.println(en1.toString());
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}