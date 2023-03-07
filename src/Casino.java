import java.util.Calendar;

public class Casino {
    public static void main(String[] args) throws Exception {
    }

    public class User{
        String name;
        String lastName;
        String lastNameII;
        String Nickname;
        String bird;
        String email;
        String photo;
        char gender;
        int id;
    }

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
    public class Card{
        String number;
        String expire;
        String name;
        int type;
        int id;

        public Card(String number, String expire, String name, int type, int id ){
            this.number = number;
            this.expire = expire;
            this.name = name;
            this.type = type;
            this.id = id;
        }
    }

    public class Passworc{} 
}
