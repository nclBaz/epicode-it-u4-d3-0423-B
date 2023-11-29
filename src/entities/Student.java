package entities;

import java.util.Objects;
import java.util.Random;

public class Student {
	// Attributi statici
	public static String school = "Epicode";
	String surname;
	// se non metto niente non è nè private nè public, è PACKAGE-FRIENDLY
	// tutti quelle classi che stanno nello stesso package potranno accedervi
	private int id;
	// LISTA ATTRIBUTI
	private String name;
	private TipoStudente tipo = TipoStudente.FULLSTACK;

	// LISTA COSTRUTTORI

	// Costruttore I
	public Student() {
		Random rndm = new Random();
		this.name = "NOME DI DEFAULT";
		this.surname = "COGNOME DI DEFAULT";
		this.id = rndm.nextInt(1, 10000);
	}

	// Costruttore II
	public Student(String name) {
		Random rndm = new Random();
		this.name = name;
		this.surname = "COGNOME DI DEFAULT";
		this.id = rndm.nextInt(1, 10000);
	}

	// Costruttore III
	public Student(String name, String surname) {
		Random rndm = new Random();
		this.name = name;
		this.surname = surname;
		this.id = rndm.nextInt(1, 10000);
	}


	// LISTA METODI

	// METODI STATICI

	public static void staticExample() {
		System.out.println("Ciao sono un metodo statico");
	}

	// Se non definisco nessun costruttore, Java comunque inserirà automaticamente
	// il costruttore vuoto


	// GETTER
	public String getName() {
		return name;
	}

	// SETTER
	public void setName(String name) {
		if (name.length() <= 3) {
			System.err.println("Il nome deve essere più lungo di 3 caratteri");
		} else {
			this.name = name;
		}
	}

	// GETTER
	public String getSurname() {
		return surname;
	}

	// GETTER
	public int getId() {
		return id;
	}

	// GETTER
	public TipoStudente getTipo() {
		return tipo;
	}

	// SETTER
	public void setTipo(TipoStudente tipo) {
		this.tipo = tipo;
	}


	// METODI NON STATICI

	public void sayHello() {
		System.out.println("Ciao sono " + this.name + " " + this.surname + ", ID:" + this.id + ", tipo studente = " + tipo);
	}


	// METODI DI DEFAULT CHE VOGLIO PERSONALIZZARE
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o; // cast da Object (oggetto generico) a Student (oggetto specifico)
		return id == student.id && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
	}

	@Override
	public String toString() {
		return "Oggetto ------------------------> {" +
				"surname='" + surname + '\'' +
				", id=" + id +
				", name='" + name + '\'' +
				", tipo=" + tipo +
				'}';
	}
}
