import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeworkApp2 {
    public static void main(String[] args) {
            List<Hobby> hobbyList = new ArrayList<>();


            Hobby running = new Hobby("run", 3, "Via Dolorosa, nr. 86");
            Hobby reading = new Hobby("reading", 2, "home");
            Hobby fishing = new Hobby("fishing", 2, "rivers");

            hobbyList.add(running);
            hobbyList.add(reading);
            hobbyList.add(fishing);


            Persoana persona1 = new Persoana("Andrei", 20);
            Persoana persona2 = new Persoana("Ioan", 24);


            HashMap<Persoana, List<Hobby>> map = new HashMap<>();

           map.put(persona1, hobbyList);
           map.put(persona2, hobbyList);
           System.out.println(map);



    }

}
