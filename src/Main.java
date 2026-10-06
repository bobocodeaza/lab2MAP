import org.example.abgerundeteNoten;
import org.example.durschnitt;
import org.example.nichtAusreichend;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    int[] note={29, 37, 40, 41, 85, 67};
    nichtAusreichend nichtAusreichend = new nichtAusreichend(note);

    System.out.println("Die ausreichende Noten sind: " + Arrays.toString (nichtAusreichend.picat()));
    durschnitt  durschnitt= new durschnitt(note);
    System.out.println("Die Durschnitt der Noten ist: "+ durschnitt.medie());
    abgerundeteNoten abgerundeteNoten = new abgerundeteNoten(note);
    System.out.println("Die Liste der abgerundete Noten ist: " + Arrays.toString(abgerundeteNoten.rotunjit()));
    }
}
