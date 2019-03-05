import java.io.*;

public class WritingToFile {
    public static void main(String[] args) {
        try{
            String teamToAdd = "Wales";
             File file = new File("Teams");
             if (!file.exists()){
                 file.createNewFile();
             }

            FileWriter fw = new FileWriter(file,true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(teamToAdd);
            bw.close();
            System.out.println("Write Complete");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
