import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student extends Persoana {

    public Student(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public String toString() {
        return super.toString() + " -- Status: Student";
    }
}
