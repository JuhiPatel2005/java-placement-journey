import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
  public static void main(String[] args) {
    Student s1 = new Student(101, "Juhi");
    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))){
      oos.writeObject(s1);
      System.out.println("Object serialized: " + s1);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))){
      Student s2 = (Student) ois.readObject();
      System.out.println("Object deserialized: " + s2);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
