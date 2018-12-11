import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {
    public static void main(String[] args){
        ArrayList<Grad> gradovi=new ArrayList<Grad>();
        gradovi=ucitajGradove();
    }
    private static ArrayList<Grad> ucitajGradove(){
        ArrayList<Grad> gradovi=new ArrayList<Grad>();
        int brojac=0;
        Scanner ulaz = null;
        try {
            ulaz = new Scanner(new FileReader("mjerenja.txt")).useDelimiter("[\\r\\n,]");
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka mjerenja.txt ne postoji ili se ne može otvoriti");
        }
        try {

            while(ulaz.hasNext()) {
                if(brojac==1000) break;
                brojac++;
                String s = ulaz.next();
                System.out.print("ovo je "+s);
                int i=0;
                double [] niz=new double[1000];
                ulaz.next().charAt(0);
                while(ulaz.hasNextDouble()){
                    if(i==1000) break;
                    niz[i]=ulaz.nextDouble();
                    System.out.print(niz[i]);
                    i++;
                }

                gradovi.add(new Grad());


            }
        }catch(Exception e){
            System.out.print("problem");
        }
        return gradovi;
    }
}
