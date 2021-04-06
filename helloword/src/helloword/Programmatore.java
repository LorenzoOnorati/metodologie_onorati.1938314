package helloword;

public class Programmatore {
private String nome;
private  String cognome;
private String nomeAzienda;
private String nomelinguaggio;
public   Programmatore(String inseriscinome, String inseriscicognome) {
	nome=inseriscinome;
	cognome=inseriscicognome;
	nomelinguaggio="";}

/*il metodo imposta come nome dell'azienda associata al Programmatore
il nome dell'azienda dato in input*/
public  String setAzienda(String inseriscinomeazienda)
{nomeAzienda=inseriscinomeazienda;
	return nomeAzienda;}

//il metodo associa al Programmatore uno o più linguaggi di programmazione
public String addLinguaggi(String inseriscilinguaggio) {
	nomelinguaggio+=" "+inseriscilinguaggio;
	return nomelinguaggio;}

//restituisce il nome del Programmatore
public  String getNome() {return nome;}

//restituisce il cognome del programmatore
public String getCognome() {return cognome;}

//restituisce il nome dell'azienda del programmatore
public String getAzienda() {return nomeAzienda;}

//restitusce i linguaggi associati al Programmatore
public String getLinguaggi() {return nomelinguaggio;}
public static void main(String[]args) {
	Programmatore p1= new Programmatore("Bjarne","Stoustrup");
	Programmatore p2= new Programmatore("Brian","Kernighan");
	Programmatore p3=new Programmatore("James","Grosling");
	
	p1.addLinguaggi("C");
	p1.addLinguaggi("C++");
	p1.setAzienda("Morgan Stanley");

	p2.addLinguaggi("C");
	p2.addLinguaggi("AWK");
	
	p3.setAzienda("Oracle");
	p3.addLinguaggi("Java");
	
	System.out.println(p1.getAzienda());
	System.out.println(p2.getLinguaggi());
}
}