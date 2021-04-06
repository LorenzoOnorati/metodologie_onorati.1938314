package helloword;

public class BarraDiCompletamento {
private double x;

/*il metodo incrementa il valore in input sommandogli
 il valore di partenza*/
public double incrementa(double y) {return x+y;}
public  BarraDiCompletamento(double initialvalue) {
	x=initialvalue;}
public static   String toString(double s) {
	return Long.toString( Math.round(s));}
	
public static void main(String[] args) {
	BarraDiCompletamento barradicompletamento1= new BarraDiCompletamento(5);
	double s=  35.4;
	System.out.println(barradicompletamento1.incrementa(10));
	System.out.println(toString(s));
}
}
