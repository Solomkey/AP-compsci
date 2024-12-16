package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	int age;
	String name;
	String breed;
	
	public Dog() {
		age = 3;
		name = "Clifford";
		breed = "big red dog";
	}
	public Dog(String n){
		age = 1;
		breed = "dog dog";
		name = n;
	}
	public Dog(String b, String n){
		breed = b;
		name = n;
		age = 1;
	}
	public Dog(String n, int a){
		name = n;
		age = a;
		breed = "dog dog";
	}
	
	public void setName(String q){
		name = q;
	}
	
	public void setAge(int x){
		age = x;
	}
	
	public void setBreed(String m){
		breed = m;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		int x = (int)(Math.random()*2);
		return x==0; //0=asleep, 1=awake
	}
	
	public void bark(){
		System.out.println(name+" barks!");
	}
}
