package helloword;
//seme che possono assumere le carte nel mazzo
public enum SemeCarta {
		Cuori("Cuori"),
		Picche("Picche"),
		Quadri("Quadri"),
		Fiori("Fiori");
	private String seme;
	SemeCarta(String seme){this.seme=seme;}
	//ritorna il seme
	public String toString(){return seme;}
	
}

 