import entities.Student;
import entities.TipoStudente;

public class Main {
	public static void main(String[] args) {

		/*Student aldo = new Student(); // Sto utilizzando il primo costruttore
		Student giovanni = new Student("Giovanni"); // Sto utilizzando il secondo costruttore
		Student giacomo = new Student("Giacomo", "Poretti"); // Sto utilizzando il terzo costruttore

		aldo.sayHello();
		*//*giovanni.sayHello();
		giacomo.sayHello();*//*

		aldo.name = "Aldo";
		aldo.surname = "Baglio";
		aldo.sayHello();
*/

		// ********************************** ESEMPI DI METODI E ATTRIBUTI STATICI *******************
		/*
		A differenza dei metodi "normali" (non statici), i quali sono legati ad oggetti (istanze) specifici,
		i metodi statici sono metodi DI CLASSE, ovvero non sono legati ad oggetti specifici. Il che significa
		che per invocarli non necessito di avere a disposizione un oggetto già creato, come si vede nei seguenti esempi
		(stesso discorso per gli attributi statici)
		 */
/*		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		System.out.println("Hello world!");

		Student.staticExample();

		System.out.println(Math.sqrt(4));
		System.out.println(Math.PI);
		System.out.println(Student.school);
		isAnnoBisestile(2000);*/

		// ************************************** UGUAGLIANZA TRA OGGETTI ***************************
		Student aldo = new Student("Aldo", "Baglio");
		Student giovanni = new Student("Giovanni", "Storti");
		Student giacomo = new Student("Giacomo", "Poretti");

		// Student aldo2 = aldo; // qua sto creando un riferimento (aldo2) alla stessa cella di memoria di aldo
		Student aldo2 = new Student("Aldo", "Baglio");

		if (aldo.equals(aldo2)) {
			// Il comportamento di default di .equals è quello di comparare le 2 locazioni di memoria
			// Se voglio adottare un criterio di comparazione tra oggetti che vada a comparare ad es: nome, cognome
			// allora devo sovrascrivere il metodo .equals
			System.out.println("Gli oggetti sono identici");
		} else {
			System.out.println("Gli oggetti sono diversi");
		}

		aldo.tipo = TipoStudente.BACKEND;
		aldo.sayHello();
		giovanni.sayHello();
	}

	public static boolean isAnnoBisestile(int year) {
		return true;
	}
}