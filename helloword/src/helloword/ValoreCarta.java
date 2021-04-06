package helloword;

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
	public String toString() {return valore;}
	
}


