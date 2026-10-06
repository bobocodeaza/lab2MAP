import org.example.durschnitt;
import org.example.nichtAusreichend;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    int[] note={20, 30, 50, 60, 70, 20};
    nichtAusreichend nichtAusreichend = new nichtAusreichend(note);

    System.out.println("Die ausreichende Noten sind: " + Arrays.toString (nichtAusreichend.picat()));
    durschnitt  durschnitt= new durschnitt(note);
    System.out.println("Die Durschnitt der Noten ist: "+ durschnitt.medie());

    }
}
