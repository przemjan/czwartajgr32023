package ZapisDoPliku;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("danie.txt");

        pw.println("Kuba lubi lody :0");

        //zapisanie kolejnej linii
        pw.println("Piotr lubi jeść parówki :)");

        pw.close();
    }
}
