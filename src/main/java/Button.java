import processing.core.PApplet;

public class Button {

Action a;

    PApplet p;

    float xPos, yPos,w,h;
    String tekst;

    Button(PApplet p, float x, float y, float w, float h, String t){

        this.w = w;
        this.h = h;
        this.xPos = x;
        this.yPos = y;
        this.p = p;
        this.tekst = t;
    }
    //Display metoden laver tegningen til knappen og dens tekst
    public void display() {
        p.fill(255);
        p.rect(this.xPos, this.yPos, this.w, this.h);
        p.fill(255);
        p.text(this.tekst, xPos + 50, yPos + 75);
    }
    //Metode, der checker om man klikker på en af knapperne
    void click(float xin, float yin) {

        if (xin > xPos && xin < xPos + w && yin < yPos + h && yin > yPos) {
            a.execute();


        }
    }

void addAction(Action a){
this.a = a;

}
}










