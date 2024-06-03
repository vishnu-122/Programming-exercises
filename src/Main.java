import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] words = new String[100][];
        Scanner scanner;
        // to keep track of the rows
        int rows = 0;
        try {
            scanner = new Scanner(new File("src/ragged.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNext()) {
            String lineOfFile = scanner.nextLine();
            String myStr = lineOfFile;
            String regex = " ";

            String[] array = myStr.split(regex);

            words[rows] = new String[array.length];

            //copying the array of words in java
            for(int i = 0;i< array.length;i++){
                words[rows][i] = array[i];
            }
            rows++;
            scanner.close();
            /*for(String splitWords: array){
                System.out.println(splitWords);
            }*/
        }



    }
}