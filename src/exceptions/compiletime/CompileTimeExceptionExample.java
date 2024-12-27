package exceptions.compiletime;

import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class CompileTimeExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("E://file.txt");
            FileReader file1 = new FileReader(file); // Checked //exception
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}