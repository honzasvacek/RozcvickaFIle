public class JedenSoubor implements Comparable <JedenSoubor>{
    String jmeno;

    public JedenSoubor(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return jmeno;
    }

    @Override
    public int compareTo(JedenSoubor o) {
        char mojetretiPismeno;
        if(jmeno.length() < 3){
            mojetretiPismeno = ' ';
        } else {
            mojetretiPismeno = jmeno.charAt(2);
        }

        char jehoTretiPismeno = o.jmeno.length() < 3 ? ' ' : o.jmeno.charAt(2); //podmínka ? hodnota A : hodnota B -- kdyz true vrat A opak B

        if (mojetretiPismeno == jehoTretiPismeno) {
            return 0;
        } else if (mojetretiPismeno > jehoTretiPismeno){
            return 1;
        } else {
            return -1;
        }
    }
}
