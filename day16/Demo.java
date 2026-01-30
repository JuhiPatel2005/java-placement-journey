import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Demo {
  public static void main(String[] args) {
    try {
      File odj = new File("myfile.txt");
      if (odj.createNewFile()) {
        System.out.println("fiel created. " + odj.getName());
      } else {
        System.out.println("file alresdy exists");
      }
      FileWriter writer = new FileWriter("myfile.txt");
      writer.write("Files in java are seriously good!");
      writer.close();
      System.out.println("Successfully written.");

      Scanner reader = new Scanner(odj);
      while(reader.hasNextLine()){
        String data = reader.nextLine();
        System.out.println(data);
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("error occured.");
      e.printStackTrace();
    }

  }
}
