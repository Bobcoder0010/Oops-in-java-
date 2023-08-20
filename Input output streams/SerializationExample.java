import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Roshan");
        person.setAge(21);

        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(person);
            System.out.println("Object serialized and saved to person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Person implements java.io.Serializable {
    private String name;
    private int age;

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
}

