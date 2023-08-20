import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializationExample {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            Person person = (Person) objectIn.readObject();
            System.out.println("Object deserialized: " + person.getName() + ", " + person.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
