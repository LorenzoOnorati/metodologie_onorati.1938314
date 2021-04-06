package helloword;

import java.util.Arrays;

public class Mazzo {
private  static ValoreCarta[] v= ValoreCarta.values();
private  static SemeCarta[] s= SemeCarta.values();
private   String[] Mazzo;
private final int dimensione;
private int[] AntiDupli;
private int j=0;
private static int contatore=0;
public Mazzo() {
	dimensione=52;
	AntiDupli=new int[dimensione];
	Mazzo=new String[dimensione];
	 for(int k=0;k<13;k++) {
			for(int y=0;y<4;y++) {
				Mazzo[contatore]=(v[k]+" "+"di"+" "+s[y]);
				contatore++;
}
	 }
}
public void mescola() {
	boolean B=false;
	for(int i=0;i<Mazzo.length;i++) {
		while(Mazzo[i]!=Mazzo[AntiDupli[i]]) {
		AntiDupli[i]=(int)(Mazzo.length*Math.random());
		for(int z=0;z<i;z++) {
			if(AntiDupli[z]!=AntiDupli[i]) {
			 B=true;}
			else{B=false;}
			}
		if(B==true) {Mazzo[i]=Mazzo[AntiDupli[i]];}
		}
	}
	}
public  String distribuisci() {	
	if(j==52) {return null;}
	String c=Mazzo[j];
	j++;
	return c;
}
	
}
