package helloword;


import java.util.Arrays;
public class Sequenza {
	
	/* il metodo prende in input un array di interi,
	 * crea una copia dell' array, ordina la copia,
	   e calcolo la mediana */
public static int getMediana(int[] array) {
	int L=array.length;
	Arrays.copyOf(array, L);
	Arrays.sort(array);
	if (array.length%2==1) {
		return array[(array.length+1)/2];}
	else {
		return (array[array.length/2] + array[(array.length/2)+1]);}
}

//calcola la media dei valori dell'array datogli in input
public static double getMedia(int[] array) {
	double k=array[0];
	for(int i=1;i<array.length;i++) {
		k+=array[i];
	}
	return k/array.length;}

//calcola il valore più frequente nell'array
public static int getModa(int[] array) {
     int ContatoreFrequenza=0;
     int ValorePiùFrequente=0;
  for(int k2=0;k2<array.length;k2++){	
	  int c=0;
	for(int i2=0;i2<array.length;i2++) {
		if (array[k2]==array[i2]) {
			c+=1;
		}
		if (c>ContatoreFrequenza) {
			ContatoreFrequenza=c;
			ValorePiùFrequente=array[i2];
		}
	}
  }
	return ValorePiùFrequente;
}
public static void main(String[] args) {
	 int[] array=new int[]{1,3,8,3,5,8,7,3};
	System.out.println(getMedia(array));
	System.out.println(getMediana(array));
	System.out.println(getModa(array));
}
}
