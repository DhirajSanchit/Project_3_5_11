public class Muur extends SpelObject  {

    private boolean muur;
    private int code;

    public Muur(boolean muur) {
        this.muur = muur;
    }

    public boolean isMuur() {

        return muur;
    }

    public void setMuur(boolean muur) {
        this.muur = muur;
    }
}
