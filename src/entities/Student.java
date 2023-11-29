package entities;

import java.util.Objects;
import java.util.Random;

public class Student {
	// Attributi statici
	public static String school = "Epicode";
	// LISTA ATTRIBUTI
	public String name;
	public String surname;
	public TipoStudente tipo = TipoStudente.FULLSTACK;
	int id;


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

	// Se non definisco nessun costruttore, Java comunque inserirà automaticamente
	// il costruttore vuoto

	public static void staticExample() {
		System.out.println("Ciao sono un metodo statico");
	}

	// LISTA METODI
	public void sayHello() {
		System.out.println("Ciao sono " + this.name + " " + this.surname + ", ID:" + this.id + ", tipo studente = " + tipo);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o; // cast da Object (oggetto generico) a Student (oggetto specifico)
		return id == student.id && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
	}


}
