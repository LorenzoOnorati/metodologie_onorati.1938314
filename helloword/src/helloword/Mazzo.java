package helloword;

import java.util.ArrayList;
import java.util.Arrays;

public class Mazzo {
private  static ValoreCarta[] v= ValoreCarta.values();
private  static SemeCarta[] s= SemeCarta.values();
private   String[] Mazzo;
private final int dimensione;
private int j=0;
private static int contatore=0;
public Mazzo() {
	dimensione=52;
	Mazzo=new String[dimensione];
	 for(int k=0;k<13;k++) {
			for(int y=0;y<4;y++) {
				Mazzo[contatore]=(v[k]+" "+"di"+" "+s[y]);
				contatore++;
}
	 }
}
/*mescola il mazzo andandone a ricrearne un altro
 * senza che ci siano duplicazio*/
public void mescola() {
	int c=0;
	ArrayList<String>Mazzo2=new ArrayList<String>(Arrays.asList(Mazzo));
	for(int i=0;i<Mazzo.length;i++) {
		c=(int) (Mazzo2.size()*Math.random());
		Mazzo[i]=Mazzo2.get(c);
		Mazzo2.remove(c);
		}
	}
//distribuisce una carta del mazzo
public  String distribuisci() {	
	if(j==52) {return null;}
	String c=Mazzo[j];
	j++;
	System.out.println(j);
	return c;
}
public static void main(String[] args) {
	Mazzo m= new Mazzo();
	m.mescola();
	ArrayList<String>l=new ArrayList<String>();
	int c=0;
	for(int i=0;i<52;i++) {
		String d=m.distribuisci();
		if(l.contains(d)) {
			c+=1;
		}
		l.add(d);
	System.out.println(d);}
	System.out.println(c);
}
}