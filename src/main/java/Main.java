import processing.core.PApplet;

public class Main extends PApplet{

    public static void main(String[] args) {
        PApplet.main("Main");
    }
    Button buttonTerning6 = new Button(this,10, 10, 150, 50, "Slå med 6s terning!");
    Button buttonTerning10 = new Button(this,340, 10, 150, 50, "Slå med 10s terning!");

    int sum;
    int terningeKast;

    public void settings(){
        size(500, 300);

    }
    public void setup() {

//Dette er en "Anonym klasse". Den er ret smart, da gør så man kan inddele kode til at virke på nogle knapper og ikke andre.
        buttonTerning6.addAction(new Action() {
                                     public void execute() {
                                         terningeKast = (int)random(1, 7);
                                         sum += terningeKast;
                                     }
                                 }
        );

        buttonTerning10.addAction(new Action() {
                                      public void execute() {
                                          terningeKast = (int)random(1, 11);
                                          sum += terningeKast;
                                      }
                                  }
        );
    }

   public void draw() {
        clear();
        buttonTerning6.display();
        buttonTerning10.display();
        fill(255);
        textAlign(CENTER);
        text("Du har kastet " + terningeKast, width/2, 200);
        text("Samlet sum    " + sum, width/2, 250);
    }

   public void mousePressed() {
        buttonTerning6.click(mouseX,mouseY);
        buttonTerning10.click(mouseX,mouseY);
    }


}
