import java.io.*;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        int sum;
        try {
            FileReader fileReader = new FileReader("input.txt");
            Scanner scanner = new Scanner(fileReader);
            int a = 0;
            int b = 0;
            int c = 0;
            while (scanner.hasNext()) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
            }
            sum = a + b + c;
            scanner.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter fileWriter;
        {
            try {
                fileWriter = new FileWriter("output.txt", false);
                fileWriter.write("Сумма - " + sum);
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
