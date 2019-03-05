import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadFromFile {

    public static void main(String[] args) {

        String line;
        try{

            File file = new File("Text");
            FileReader fileReader = new FileReader(file.getName());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            fileReader.close();
            System.out.println("File End....");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
