import entities.Student;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		System.out.println("Hello world!");

		Student.staticExample();

		System.out.println(Math.sqrt(4));
		System.out.println(Math.PI);
		System.out.println(Student.school);

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

		isAnnoBisestile(2000);
	}

	public static boolean isAnnoBisestile(int year) {
		return true;
	}
}