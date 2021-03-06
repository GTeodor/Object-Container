import javax.print.attribute.standard.MediaSize;

public class Persoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

    public String getNume(){
        return nume;
    }

    public int getVarsta(){
        return varsta;
    }

    @Override
    public String toString(){
        return "Nume: "  + this.nume + " -- Varsta: " + this.varsta;
    }
}
