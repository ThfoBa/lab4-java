import classes.*;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		byte years = 10;
		byte akadem = 1;
		Experience exp1 = new Experience();
		Experience exp2 = new Experience(years);
		Experience exp3 = new Experience(years, akadem);
		exp1.input();
		System.out.println("\n" + "exp1:");
		exp1.output();
		System.out.println("\n" + "exp2:");
		exp2.output();
		System.out.println("\n" + "exp3:");
		exp3.output();
		String str = "Приборостроение";
		byte elit = 1;
		byte form = 2;
		Napravlenie nap1 = new Napravlenie();
		Napravlenie nap2 = new Napravlenie(elit);
		Napravlenie nap3 = new Napravlenie(str, elit, form);
		nap1.input();
		System.out.println("\n" + "nap1:");
		nap1.output();
		System.out.println("\n" + "nap2:");
		nap2.output();
		System.out.println("\n" + "nap3:");
		nap3.output();
		byte bal1 = 45, bal2 = 20;
		Uspevaemost us1 = new Uspevaemost();
		Uspevaemost us2 = new Uspevaemost(bal1);
		Uspevaemost us3 = new Uspevaemost(bal2, 30, 70, 100, nap1);
		us1.input();
		System.out.println("\n" + "us1:");
		us1.output();
		System.out.println("\n" + "us2:");
		us2.output();
		System.out.println("\n" + "us3:");
		us3.output();
		Student st1 = new Student();
		Student st2 = new Student(10);
		Student st3 = new Student(exp1, nap1, us1);
		Student[] arr = new Student[3];
		String napt1 = "Экономист";
        	String napt2 = "Экономист банка";
        	String napt3 = "Экономист экономики";
        	Napravlenie n1 = new Napravlenie(napt1, elit, form);
        	Napravlenie n2 = new Napravlenie(napt2, elit, form);
        	Napravlenie n3 = new Napravlenie(napt3, elit, form);
		arr[0] = new Student(exp1, n1, us1);
        	arr[1] = new Student(exp1, n2, us1);
        	arr[2] = new Student(exp1, n3, us1);
        	for(int i = 0; i < 3; i++){
            		arr[i].editnazvanie("Экономист", "Младший");
        	}

        	for(int i = 0; i < 3; i++){
            		arr[i].output();
            		System.out.println();
        	}
        	st1.input();
        	System.out.println("\n" + "st1:");
        	st1.output();
        	System.out.println("\n" + "st2:");
        	st2.output();
        	System.out.println("\n" + "st3:");
        	st3.output();
	}
}