import org.jetbrains.annotations.NotNull;

import java.io.*;

public class ReadFromWarAndPeace {
    public static void main(String[] args) {

        String line;
        try{

            File file = new File("WarAndPeace.txt");
            FileReader fileReader = new FileReader(file.getName());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File fileOut = new File("WarAndPeace_NoWallys.txt");
            if(!fileOut.exists()){
                fileOut.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(fileOut, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean isWallyFound = false;
            int wallyCounter = 0;
            int wallyLocation = 0;
            int lineNumber = 1;

            line = bufferedReader.readLine();
            while (line != null) {
                int numberOfWallysInLine = countWallysInLine(line);
                wallyCounter += numberOfWallysInLine;

                if(!isWallyFound && numberOfWallysInLine > 0){
                    isWallyFound = true;
                    wallyLocation = lineNumber;
                }

                if(numberOfWallysInLine > 0){
                    line = removeWallysFromLine(line);
                }

                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
                lineNumber++;
            }

            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            fileReader.close();

            System.out.println("Was Wally Found? " + (isWallyFound ? "Yes" : "No"));
            System.out.println("Wally was found " + wallyCounter + " times");
            System.out.println("First occurence of Wally was on line " + wallyLocation);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String removeWallysFromLine(String line){
        while(line.contains("Wally")){
            line = line.substring(0,line.indexOf("Wally")) +
                    line.substring(line.indexOf("Wally") +5, line.length());
        }
        return line;
    }

    private static int countWallysInLine(String line){
        int count = 0;
        while(line.contains("Wally")){
            count++;
            line = line.substring(line.indexOf("Wally") + 5, line.length());
        }
        return count;
    }
}
