package edu.claseb;

public class ObjetoB {
	
	static final int formA = 2;
	static final int formP = 3;
	private int base;
	private int altura;
	private int perimetro;
	private double area;
	
	public ObjetoB(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	public final double getArea(){
		area = base*altura/formA;
		return area;
	}
	public final int getPerimetro(){
		perimetro = perimetro*formP;
		return perimetro;
	}
}
abstract class Metodos{
	private String color;
	public void colorT(){
		System.out.println("Color"+color);
	}
}
