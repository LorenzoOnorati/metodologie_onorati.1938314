package helloword;

public class SommaNumeriPrecedenti {
private int n1;
private int n2;
private int N;
private int n3;
private String S;
private int k;
public SommaNumeriPrecedenti(int inseriscinumero1,int inseriscinumero2,int numseq ) {
	n1=inseriscinumero1;
	n2=inseriscinumero2;
	N=numseq;
    S=" ";
    k=2;}

/* il metodo prende due numeri(n1 e n2) e li trasforma in una stringa(S)
 * fino a che S non conterrà N numeri il metodo somma l'ultimo numero della stringa 
  con il precedente, infine il metodo fa ritornare S */
public String getSequenza(){
	S+=Integer.toString(n1)+","+Integer.toString(n2);
	while(k!=N) {
		n3=n1+n2;
		S+=","+Integer.toString(n3);
		n1=n2;
		n2=n3;
		k+=1;}
	 return S;}
public static void main(String[] args) {
	SommaNumeriPrecedenti numeri=new SommaNumeriPrecedenti(1,1,8);
	System.out.print(numeri.getSequenza());
}
}