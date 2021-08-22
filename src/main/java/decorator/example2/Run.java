package decorator.example2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Run {
    public void test() {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\Prog\\Java\\Projects\\DesignPatterns\\src\\main\\java\\test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
