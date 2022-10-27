package classes;
import java.util.Scanner;

public class Experience {
	//конструктор класса со всеми параметрами
	public Experience(byte studyyears, byte akadem) {
	    if(studyyears >= 0)			
		this.studyyears = studyyears;
	    else{
		System.out.println("Указано недопустимое значение studyyears.");
		this.studyyears = 0;
	    }
	    if(akadem >= 0)
		this.akadem = akadem;
	    else{
		System.out.println("Указано недопустимое значение akadem.");
		this.akadem = 0;
	    }
	}
	
	//конструктор класса с одним параметром
	public Experience(byte allfields) {
	    
		studyyears = allfields;
		akadem = allfields;	
	}
	
	//конструктор класса без параметров
	public Experience(){
		studyyears = 0;
		akadem = 0;
		
	}
	
	//метод вывода
	public void output(){
		System.out.println("Количество лет обучения: " + studyyears);
		System.out.println("Количество лет в академическом отпуске: " + akadem);
		System.out.println("Количество лет проведённых в вузе всего: " + allexperience());
	}
	
	/** Метод установки значений **/
    	public void set(Experience e){
        	this.studyyears = e.studyyears;
        	this.akadem = e.akadem;
    	}
	
	//метод ввода
	public void input(){
		byte studyyears, akadem;
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите кол-во полных лет обучения: ");
		studyyears = inp.nextByte();
		System.out.println("Введите кол-во лет, проведенных в академическом отпуске: ");
		akadem = inp.nextByte();
		Experience e = new Experience(studyyears, akadem);
		this.set(e);
		
	}
	
	//метод возвращающий общее время, проведённое в вузе
	public byte allexperience(){
		byte all;
		all = studyyears;
		all += akadem;
		return all;
	}
	
	//поля класса
	private byte studyyears; //кол-во реальных лет обучения
	private byte akadem; //кол-во лет в академе
}