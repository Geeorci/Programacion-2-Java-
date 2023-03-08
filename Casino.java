public class Casino{
    public static void main(String argumentos[]){
        System.out.println("Casino");
        Card card1 = new Card();
        Card card2 = new Card( "1234 1234 1234 1234", "Damar", 10000 );

       
    }
    
    public void printDataCard( Card c){
        float creditLimit = c.creditLimit;
        System.out.println(creditLimit);
        String name = c.getName();
        System.out.println(name);
    }
}
//git init 
//git commit
//git status
