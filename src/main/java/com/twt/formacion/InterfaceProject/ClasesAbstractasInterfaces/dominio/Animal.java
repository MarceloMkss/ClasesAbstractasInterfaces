package com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio;

public abstract class Animal {

	protected int patas;

	
	// Constructor
	protected Animal(int patas) {
		super();
		this.patas = patas;
	}

	// Metodo abstracto (eat = come)
	public abstract void eat ();
	
	
	 // walk = anda
		public void walk() {
			System.out.println("Este animal tiene " + patas + " patas.");			
		}
		
		public void nada() {
			System.out.println("Este animal nada ");			
		}
	

}
