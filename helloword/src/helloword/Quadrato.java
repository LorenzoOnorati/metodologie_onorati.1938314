package helloword;

public class Quadrato {
private double lato;
public Quadrato(double lato) {
	this.lato=lato;
}

// il metodo ritorna il perimetro del Quadrato(dato dalla formula lato*4)
public double getperimetro()  {return lato*4;}
public static  void main(String args[]) {
	Quadrato quadrato1= new Quadrato(4);
	System.out.print(quadrato1.getperimetro());
}
	
}
