import java.io.File;

public class Main {
    public static void main(String[] args) {    //doma doucit
        File f = new File("z:/");
        String[] seznamSouboru = f.list();

        for (String jmeno : f.list()) {
            System.out.println(jmeno);
        }

    }
}