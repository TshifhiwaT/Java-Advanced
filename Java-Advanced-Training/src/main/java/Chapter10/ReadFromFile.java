package Chapter10;

import java.io.*;

public class ReadFromFile {
    static void main(String[] args) {
        String filePath = "src/main/resources/Modules.txt";
        File moduleFile = new File(filePath);
        String text;

        try {
            FileReader fr = new FileReader(moduleFile);
            BufferedReader br = new BufferedReader(fr);

            while((text = br.readLine()) != null){
                System.out.println(text);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
