import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteIOstream {
    public static void main(String[] args) {
        try {
            File inputFile = new File("myFile.txt");
            File outputFile = new File("CopyOfMyFile.txt");

            // Check if the input file exists before proceeding
            if (!inputFile.exists()) {
                System.out.println("Input file does not exist.");
                return;
            }

            FileReader reader = new FileReader(inputFile);
            char[] chars = new char[(int) inputFile.length()];

            // Reading data from the input file
            int bytesRead = reader.read(chars);
            reader.close();

            if (bytesRead == -1) {
                System.out.println("Input file is empty.");
                return;
            }

            // Writing data to the output file
            FileWriter writer = new FileWriter(outputFile);
            writer.write(chars);
            writer.close();

            System.out.println("Successfully copied data from input file to output file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

