package classes;
import java.util.Scanner;
import java.util.ArrayList;

public class Student{
	//конструктор класса со всеми параметрами
	public Student(Experience e, Napravlenie n, Uspevaemost u){
		counter++;
		this.id = counter;
		this.exp = e;
		this.nap = n;
		this.usp = u;
	}
	
	//конструктор класса с одним параметром
	public Student(int allfields){
		counter++;
		id = counter;
		exp = new Experience((byte)allfields);
		nap = new Napravlenie((short)allfields);
		usp = new Uspevaemost((short)allfields);
	}
	
	//конструктор класса без параметров
	public Student(){
		counter++;
		id = counter;
		exp = new Experience();
		nap = new Napravlenie();
		usp = new Uspevaemost();
	}
	
	//метод вывода
	public void output(){
		System.out.println("ID: " + id);
		exp.output();
		nap.output();
		usp.output();
		usp.bonuss();
		System.out.println("Стипендия: " + usp.getstip());
	}
	
	//метод ввода
	public void input(){
		exp.input();
		nap.input();
		usp.input();
	}
	
	//метод обращения к методу внутреннего класса
    	public void editnazvanie(String nazvanie, String add){
        	nap.editnazvanie(nazvanie, add);
    	}
	
	

	
	
	//поля класса
	private static int counter = 0;
	private int  id; //индивидуальный номер
	private Experience exp; //кол-во лет обучения в вузе
	private Napravlenie nap; //название направления
	private Uspevaemost usp; //успеваемость студента
}