# Button/Dice library

I mappen src/main/java kan du finde koden, og i mappen out/artifacts/GUIHygge_jar finder du biblioteket.<br>

I mappen out/artifacts/GUIHygge_jar er jar-filen, hvis du importerer dette bibliotek til dit projekt, kan du lave knapper, der fungerer som terninger.<br>
For at bruge biblioteket skal du gøre følgende<br>

Hvis i intellij (som den originalt er lavet i) <br>
Den måde du laver en knap skal du gøre følgene<br>
Button buttonTerning6 = ny knap (this, 10, 10, 150, 50, "Kast en D6");<br>
Hvis du dog arbejder i intellij bliver du nødt til at importere Processings PApplet for at biblioteket virker<br><p>
 <\p>
For at tilføje en action, her er der taget fra samme eksempel som før med "buttonTerning6" <br>
 buttonTerning6.addAction(new Action() { <br>
     kode <br>
        kode kode <br>
 }<br>
 ); <br>
