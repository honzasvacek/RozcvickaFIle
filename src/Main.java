import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {    //doma doucit
        File f = new File("z:/");
        ArrayList<JedenSoubor> arr = new ArrayList<>();       //pridava jen soubory typu jeden soubor

        for (String jmeno : f.list()) {
            arr.add(new JedenSoubor(jmeno));
        }

        Collections.sort(arr);

        for (JedenSoubor j : arr) {
            System.out.println(j.jmeno);

        }



    }
}