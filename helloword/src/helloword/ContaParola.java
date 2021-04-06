package helloword;

public class ContaParola {
String s;
String w;
int c;
private ContaParola(String inseriretesto,String inserireparola) {
	s=inseriretesto;
	w=inserireparola;}

/*  il metodo prende un testo(s) e lo spezza in parole,
   ogni  parola  viene messa nella lista "S",
      infine fa un ciclo in cui ogni volta che una parola corrisponde
     a una parola data da noi in input(w) il contatore(c) aumenta il suo valore di 1,
      terminate le parole il ciclo si interrompe e ritorna in output il contatore */
public int contaOccorrenze(){
	String[] S= s.split(" ");
	for(int i=0;i<S.length; i++) {
		if ( S[i].equals(w)) {
		c+=1;}
	} return c;
	
}
public static void main(String[] args) {
	ContaParola stringa1=new ContaParola("chi trova un amico trova un tesoro","trova");
	System.out.print(stringa1.contaOccorrenze());
}
}
