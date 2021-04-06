package helloword;

public enum SemeCarta {
		Cuori("Cuori"),
		Picche("Picche"),
		Quadri("Quadri"),
		Fiori("Fiori");
	private String seme;
	SemeCarta(String seme){this.seme=seme;}
	public String toString(){return seme;}
}

 