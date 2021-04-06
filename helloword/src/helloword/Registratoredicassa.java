package helloword;

public class Registratoredicassa {
double r;
double q;
double p;
public Registratoredicassa( double inseriscidenaro ,double  inserisciprezzo) {
	q= inseriscidenaro;
	p=inserisciprezzo;}

/*il metodo svolge la differenza tra il denaro inserito in input(q) e 
 il prezzo inserito in input(p), ritorna il resto sotto forma di stringa! */ 
public String getResto() {
	 String r=Double.toString(q-p);
	return "il resto è"+" "+r;}
public static void main(String[] args) {
Registratoredicassa cliente1=new Registratoredicassa(5.1,4.2);
System.out.println(cliente1.getResto());
}
}
