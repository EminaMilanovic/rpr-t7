import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {
    public static void main(String[] args){

    }
    ArrayList<Grad> ucitajGradove(){
        Scanner ulaz;
        try {
            ulaz = new Scanner(new FileReader("mjerenja.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka ulaz.txt ne postoji ili se ne može otvoriti");
        }
    }
}
