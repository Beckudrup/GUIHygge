import processing.core.PApplet;

public class Reciever {
    int sum;
    int terningeKast;
    PApplet p;

    Reciever(PApplet p) {
this.p = p;
    }
    public void throwDice(int low, int high) {
        terningeKast = (int)p.random(low, high);
        sum += terningeKast;
    }
}

