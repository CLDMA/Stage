public class MainApp {
	
	static void main(String[] args) {

		Homme h1 = new Homme("Jean", "Dujardin");
		Homme h2 = new Homme("Leonardo", "Dicaprio", h1);
		Femme f1 = new Femme("Marion", "Cotillard");
		Femme f2 = new Femme("Roxanne", "Bret", h2, f1);

		Moto m1 = new Moto(h1);
		Moto m2 = new Moto(f1);
		
		System.out.println(h1.presentation());
		System.out.println(h2.presentation());
		System.out.println(f2.presentation());

		System.out.println(m1.conduite());
		System.out.println(m2.conduite());
		

	}
}