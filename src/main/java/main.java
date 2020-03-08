import java.io.OutputStream;
import java.io.PrintStream;


public class main {
    // Imports the Google Cloud client library
    public static void main(String... args) throws Exception {
        DetectText textReader = new DetectText();
        DetectLabel labelReader = new DetectLabel();
        String filePath = "C:\\Users\\Pavitar K\\Desktop\\All files\\UBC\\2017 Winter\\Phys 157\\testImage.jpg";
/*
        System.out.println(System.getenv("GOOGLE_APPLICATION_CREDENTIALS"));
*/
        PrintStream result = new PrintStream(OutputStream.nullOutputStream());
        PrintStream result2 = new PrintStream(OutputStream.nullOutputStream());
        textReader.detectText(filePath, result);
        labelReader.detectLabel(filePath, result2);
        System.out.println(result.toString());
        System.out.println(result2.toString());
    }
}


