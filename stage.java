public class stage {
	static void main(String[] args) {
		
		System.out.println(h1.presentation());
		System.out.println(h2.presentation());
		System.out.println(f2.presentation());

		System.out.println(m1.conduite());
		System.out.println(m2.conduite());
	
	}
}

class Homme {
	String Homme;
	
	public Homme(String Homme) {
		this.Homme h1 = new Homme("Jean", "Dujardin");
		this.Homme h2 = new Homme("Leonardo", "Dicaprio", h1);
	}

class Femme	{
	String Femme;
	
	public Femme(String Femme) {
		this.Femme f1 = new Femme("Marion", "Cotillard");
		this.Femme f2 = new Femme("Roxanne", "Bret", h2, f1);
	}
}

class Moto	{
	String Moto;
	
	Moto m1 = new Moto(h1);
	Moto m2 = new Moto(f1);
	}
}