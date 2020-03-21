import java.util.TreeSet;

public class HomeworkApp1 {
    public static void main(String[] args) {

        System.out.println("\n\nLista ordonata alfabetic:\n");

        TreeSet<Persoana> setPersoane = new TreeSet<>(new ComparatorNume());
        setPersoane.add(new Angajat("Tudor", 35));
        setPersoane.add(new Somer("Andrei", 55));
        setPersoane.add(new Student("Radu", 21));
        setPersoane.add(new Student("Ioana", 23));

        for (Persoana p: setPersoane){
            System.out.println(p);
        }

        System.out.println("\n\nLista ordonata dupa criteriul varsta: \n");


        TreeSet<Persoana> setPersoane2 = new TreeSet<>(new ComparatorVarsta());
        setPersoane2.add(new Somer("Maria", 40));
        setPersoane2.add(new Angajat("Alin", 33));
        setPersoane2.add(new Somer("Radu", 23));
        setPersoane2.add(new Student("Cristina", 21));

        for (Persoana p2: setPersoane2) {
            System.out.println(p2);
        }

    }
}
