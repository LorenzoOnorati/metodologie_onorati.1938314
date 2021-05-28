package helloword;

//valore che può assumere una carta nel mazzo
public enum ValoreCarta{
	Asso("Asso"),
	Due("Due"),
	Tre("Tre"),
	Quattro("Quattro"),
	Cinque("Cinque"),
	Sei("Sei"),
	Sette("Sette"),
	Otto("Otto"),
	Nove("Nove"),
	Dieci("Dieci"),
	Jack("Jack"),
	Donna("Donna"),
	Re("Re");
	private String valore;
	ValoreCarta(String valore){this.valore=valore;}
	//ritorna il valore
	public String toString() {return valore;}
	
}


