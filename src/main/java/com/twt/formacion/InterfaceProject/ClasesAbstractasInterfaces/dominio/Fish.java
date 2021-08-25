package com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio;

import com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio.Mascota.Pet;

public class Fish extends Animal implements Pet {
	
	public Fish( ) {
		super(0);
		
	}

	// Atributos
	private String name;
	
	
	public Fish(int patas, String name) {
		super(patas);
		this.name = name;
	}

	// Geterrs y Seterrs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		
		// Fish swim in their tanks all
		System.out.println("El pez " + name + " nada en su tanque todos los ”\r\n" + "+ “ day.");
	
		
	}

	@Override
	public void eat() {
		
		System.out.println(name + " come escoria del estanque..");
		
	}


	
	

}
