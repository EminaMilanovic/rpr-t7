/*Klasa Grad sadrži atribute: naziv (string), broj stanovnika (int) i temperature (običan niz od 1000 elemenata tipa double).
Klasa Drzava sadrži atribute: naziv (string), broj stanovnika (int), površina (double), jedinica za površinu (string) i glavni grad (referenca na Grad).
Klasa UN sadrži samo ArrayList<Drzava>.
Klasa Tutorijal treba sadržavati main funkciju koja za sada ne radi ništa.
Sve klase se trebaju nalaziti u paketu ba.unsa.rpr.tutorijal7 i trebaju slijediti JavaBean specifikaciju (zbog zadatka 3).
*/
public class Grad {
    String naziv;
    int br_stan;
    double niz[];

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBr_stan() {
        return br_stan;
    }

    public void setBr_stan(int br_stan) {
        this.br_stan = br_stan;
    }

    public double[] getNiz() {
        return niz;
    }

    public void setNiz(double[] niz) {
        this.niz = niz;
    }

    public Grad() {
        niz=new double[1000];
    }
}
