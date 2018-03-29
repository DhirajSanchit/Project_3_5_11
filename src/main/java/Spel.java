import javax.swing.*;
import java.awt.*;

public class Spel {



    public static void main(String[] args) {
        Spel spel = new Spel();
        spel.start();

    }


    public void start(){
        Speelveld veldje = new Speelveld();
        veldje.creeerVeld();

    };

    public void pauze(){

    };

    public void restart(){

    };
}
