public class Wallet{
    private float balance;
    Card card;
    int id;

    public void Wallet( int id ){
        balance = 0;
        this.id = id;
    }
    public void addBalance( Card card){
        this.card = card;
    }
    public float getBalance(){
        return balance;
    }
}