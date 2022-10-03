import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vänligen ange namnet på filen som skall analyseras?");
        String filnamn = scan.nextLine();
        int antalTecken = FileAnalyzer.analyzeFile(filnamn);
        System.out.println("Denna fil innehåller " + antalTecken + " tecken.");
    }
}

class FileAnalyzer {
    static int analyzeFile(String a) throws IOException {
        BufferedReader fil = new BufferedReader(new FileReader(a));
        int antalTecken = 0;
        while (true) {
            String text = fil.readLine();
            if (text == null)
                break;
            antalTecken = antalTecken + text.length();
        }
        return antalTecken;
    }
} 