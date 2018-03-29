import java.util.ArrayList;

public class SpelObject {

    private int xAs;
    private int yAs;
    private ArrayList kleur;

     public SpelObject(){

     }

    public int getxAs() {
        return xAs;
    }

    public void setxAs(int xAs) {
        this.xAs = xAs;
    }

    public int getyAs() {
        return yAs;
    }

    public void setyAs(int yAs) {
        this.yAs = yAs;
    }

    public ArrayList getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur.add(kleur);
    }
}
