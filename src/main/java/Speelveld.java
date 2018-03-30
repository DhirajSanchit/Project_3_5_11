import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;


public class Speelveld extends JFrame {
    private int speeldveldID;
    private int aantalX;
    private int aantalY;

    public Speelveld(int id, int x, int y){
        this.speeldveldID = id;
        this.aantalX = x;
        this.aantalY = y;
    }

    public int[][] veldBlokken = 
    {   {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,1,0,1,1,1,0,1},
        {1,0,0,0,1,1,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };

    Speelveld(){

    }

    public final void creeerVeld() {        
        
        JFrame keyBarricade = new JFrame("Sleutel Barricade");
        JPanel observatieVeld = new JPanel();
        observatieVeld.setOpaque(true);
       
        JPanel panel = new JPanel();
        
        keyBarricade.setSize(750,750);
        GridLayout experimentLayout = new GridLayout(10,10);
        panel.setSize(750, 100);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        panel.add(new Button("Stop"));
        panel.add(new Button("Restart"));
        
        
        for (int ii = 0; ii < veldBlokken.length; ii++) {
            for (int jj = 0; jj < veldBlokken[ii].length; jj++) {
                Vak vak = new Vak();
                vak.setSize(300, 300);
                vak.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                observatieVeld.add(vak);
                observatieVeld.setLayout(experimentLayout);

                //Checker if code runs.
                //System.out.println();
            }

        }
        
        keyBarricade.add(panel, BorderLayout.PAGE_START);
        keyBarricade.add(observatieVeld, BorderLayout.CENTER);
        keyBarricade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyBarricade.setVisible(true);
    }


    public int getSpeeldveldID() {
        return speeldveldID;
    }

    public void setSpeeldveldID(int speeldveldID) {
        this.speeldveldID = speeldveldID;
    }

    public int getAantalX() {
        return aantalX;
    }

    public void setAantalX(int aantalX) {
        this.aantalX = aantalX;
    }

    public int getAantalY() {
        return aantalY;
    }

    public void setAantalY(int aantalY) {
        this.aantalY = aantalY;
    }
}
