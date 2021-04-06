package helloword;

public class Persona {
private  String nome;
private String cognome;
public  Persona(String inseriscinome, String inseriscicognome) {
	nome=inseriscinome;
	cognome=inseriscicognome;}

//il metodo ritorna il nome della Persona
public String nome(String nome) {return nome;}

//il metodo ritorna il cognome della Persona
public String cognome(String cognome) {return cognome;}

public static void main(String args[]) {
	
Persona nomecognome=new Persona("Jack","White");
   System.out.print(nomecognome.cognome+" "+nomecognome.nome);
}
}