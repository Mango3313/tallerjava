package edu.clasea;

public class ObjetoA {
	
	private String tipo;
	private String nombre;
	private String caract;
	private int id;
	
	public ObjetoA(){
		System.out.println("Tipo: "+tipo);
	}
	ObjetoA(String tipo){
		this.tipo = tipo;
		System.out.println("Tipo: "+tipo);
	}
	private ObjetoA(String tipo, String nombre, int id){
		this.tipo=tipo;
		this.nombre=nombre;
		this.id = id;
		ObjetoA oa = new ObjetoA();
		oa.setTipo(""+id);
	}
	protected ObjetoA(String tipo, String nombre, String caract){
		this.tipo=tipo;
		this.nombre=nombre;
		this.caract = caract;
		System.out.println("Tipo: "+tipo+", "+nombre+", "+caract);
	}
	public void setObA(){
		ObjetoA a = new ObjetoA("Privado",":v",0);
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

}

