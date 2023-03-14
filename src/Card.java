
public class Card {
    String number;
    String name;
    float creditLimit;

    public Card (){
        number = "";
        name = "";
        creditLimit = (float)0.0;
    }
    public Card( String number, String name, float creditLimit){
        this.number = number;
        this.name = name;
        this.creditLimit = creditLimit;
    }
    public String getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public float getLimitCredit(){
        return creditLimit;
    }
}