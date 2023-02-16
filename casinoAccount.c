#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct user{
	char *name;
	char *email;
	char *password;
	char genere;	
	float balance;	
};

//paso 1: Crear la estructura. nombre, email, saldo, password, genero.

struct user* makeUser(char *name, char *email, char *password, char genere, float balance){
	struct user *new = (struct user*)malloc(sizeof(struct user));
	new->name = (char*)malloc(sizeof(char)*50);
   	new->email= (char*)malloc(sizeof(char)*30);
    	new->password= (char*)malloc(sizeof(char)*19);
	new->genere=(char)malloc(sizeof(char)*1);
	new->balance=(int)malloc(sizeof(int)*29);

    	strcpy(new->name, name);
    	strcpy(new->email, email);
    	strcpy(new->password, password);
    	new->genere = genere;
    	new->balance = balance;

	return new;
}


void showDataUser(struct user *member){
    printf("User: %s\tEmail: %s\tPassword: %s\t Genere: %c\t\t Balance: \$%.2f\n",member->name, member->email, member->password, member->genere, member->balance);
}
int main(){
    //paso 2: Imprimir los valores en main
    /*paso 3: Realizar una función con las siguientes características
        - Se deben llenar los campos con la información adecuada
        - Se genera una función que recibe un apuntador a la estructura
        - Se imprimen todos los miembros de la estructura
    */    
   struct user *u1 = makeUser("Geovani", "geo@email.com", "grc15797", 'M', 2000);
   
   showDataUser(u1); /*Paso 2 y 3*/
}
