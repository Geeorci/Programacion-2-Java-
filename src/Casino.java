public class Casino{

   
    public static void main(String argumentos[]){
        Card card1 = new Card();
        Card card2 = new Card( "1234 1234 1234 1234", "Damar", 10000f );
        System.out.println(card2.creditLimit);
    }
    public void printDataCard( Card c){
        float creditLimit = c.creditLimit;
        System.out.println(c.creditLimit);
        String name = c.getName();
        System.out.println(c.name);
    }


    
}
//git init 
//git commit
//git status
