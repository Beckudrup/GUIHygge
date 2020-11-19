import processing.core.PApplet;

public class Main extends PApplet{

    public static void main(String[] args) {
        PApplet.main("Main");
    }
    Button buttonTerning6 = new Button(this,10, 10, 150, 50, "Slå med 6s terning!");
    Button buttonTerning10 = new Button(this,300, 10, 150, 50, "Slå med 10s terning!");
    Button buttonTerning20 = new Button(this,600, 10, 150, 50, "Slå med 20s terning!");
    Button buttonTerning100 = new Button(this,900, 10, 150, 50, "Slå med 100s terning!");
    Reciever reciever = new Reciever(this);
    int sum;
    int terningeKast;

    public void settings(){
        size(1100, 300);

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
        buttonTerning100.addAction(new Action() {
                                     public void execute() {
                                         terningeKast = (int)random(1, 101);
                                         sum += terningeKast;
                                     }
                                 }
        );
        buttonTerning20.addAction(new Action() {
                                     public void execute() {
                                         terningeKast = (int)random(1, 21);
                                         sum += terningeKast;
                                     }
                                 }
        );
    }

   public void draw() {
        clear();
        buttonTerning6.display();
        buttonTerning10.display();
        buttonTerning20.display();
        buttonTerning100.display();
        fill(255);
        textAlign(CENTER);
        text("Du har kastet " + terningeKast, width/2, 200);
        text("Samlet sum    " + sum, width/2, 250);
    }

   public void mousePressed() {
        buttonTerning6.click(mouseX,mouseY);
        buttonTerning10.click(mouseX,mouseY);
        buttonTerning20.click(mouseX,mouseY);
        buttonTerning100.click(mouseX, mouseY);
    }


}
