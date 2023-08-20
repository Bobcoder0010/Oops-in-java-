import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);

            char[] c = new char[20];

            if (br.markSupported()) {
                System.out.println("mark() method is supported.");
                br.mark(100);
            }

            br.skip(8);

            if (br.ready()) {
                String line = br.readLine();
                if (line != null) {
                    System.out.println(line);
                }

                int bytesRead = br.read(c);
                if (bytesRead != -1) {
                    for (int i = 0; i < bytesRead; i++) {
                        System.out.print(c[i]);
                    }
                }
                System.out.println();

                br.reset();
                for (int i = 0; i < 8; i++) {
                    int ch = br.read();
                    if (ch != -1) {
                        System.out.print((char) ch);
                    }
                }
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

