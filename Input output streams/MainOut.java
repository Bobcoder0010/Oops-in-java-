import java.io.FileOutputStream;                
import java.io.IOException;
public class MainOut {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("fileout.txt") ;
            outputStream.write("Hello World".getBytes());
            outputStream.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        } 
    }
}
