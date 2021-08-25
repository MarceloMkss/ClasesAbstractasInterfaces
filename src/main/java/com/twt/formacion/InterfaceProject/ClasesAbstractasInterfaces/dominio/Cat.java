package com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio;

import com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio.Mascota.Pet;

public class Cat extends Animal implements Pet {
	
	private String name;

	public Cat(String n) {
		super(4);
		name = n;
		
	}

	public Cat() {
		this("");
		}
	
	

	public String getName() {
		return name;
	}

	@Override
	public void setName(String n) {
		
		name = n;
		
	}

	@Override
	public void play() {

		// likes to play whit string.
		System.out.println( "El gato " + name + " le gusta jugar con cuerdas. ");
		
	}

	@Override
	public void eat() {
		
		// Cats like to eat spiders	and mice.
		System.out.println("a "+ name +  " le gusta comer ratones. ");
	}

}
