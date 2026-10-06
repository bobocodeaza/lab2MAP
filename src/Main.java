import org.example.nichtAusrecihend;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    int[] note={20, 30, 50, 60, 70, 20};
    nichtAusrecihend nichtAusrecihend = new nichtAusrecihend(note);

    System.out.println("Die ausreichende Noten sind: " + Arrays.toString (nichtAusrecihend.picat()));
    }
}
