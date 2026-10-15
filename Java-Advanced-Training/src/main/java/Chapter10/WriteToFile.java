package Chapter10;

import java.io.*;

public class WriteToFile {
    static void main(String[] args) {
        //Path
        String filePath = "src/main/resources/Hobbies.txt";
        //Create a file resource
        File hobbiesFile = new File(filePath);

        try {
            PrintStream pen = new PrintStream(hobbiesFile);
            //write to file
            pen.println("Tennis");
            pen.println("Soccer");
            pen.println("Hiking");

            pen.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found..." + ex.getMessage());
        }

        System.out.println("Abs Path: " + hobbiesFile.getAbsolutePath());
        System.out.println("Path: " + hobbiesFile.getPath());
        System.out.println("Parent: " + hobbiesFile.getParent());
        //System.out.println("Last Modified: " + hobbiesFile.);
    }
}
