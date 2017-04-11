import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class FileOperations {

    static ArrayList<Integer> readFromFile(String filename) {

        ArrayList<Integer> arrayFromFile = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filename));

            while(sc.hasNext()) {
                arrayFromFile.add(Integer.parseInt(sc.next()));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arrayFromFile;
    }
}
