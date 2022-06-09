public class Cards {
    private int value;
    private String cardo;

    public Cards(int value, String cardo){
        this.value = value;
        this.cardo = cardo;
    }

    public int getValue(){
        return value;
    }
    public String getName(){
        return cardo;
    }
    public void setValue(int val){
        value = val;
    }

    @Override
    public String toString() {
        return cardo;
    }
}
