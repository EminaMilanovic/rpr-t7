public class Drzava {
    String naziv;
    int br_stan;
    double povr;
    String jedinica;
    Grad glavni_grad;

    public Drzava() {
    }

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

    public double getPovr() {
        return povr;
    }

    public void setPovr(double povr) {
        this.povr = povr;
    }

    public String getJedinica() {
        return jedinica;
    }

    public void setJedinica(String jedinica) {
        this.jedinica = jedinica;
    }

    public Grad getGlavni_grad() {
        return glavni_grad;
    }

    public void setGlavni_grad(Grad glavni_grad) {
        this.glavni_grad = glavni_grad;
    }
}
