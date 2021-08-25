package com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.main;

import com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio.Animal;
import com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio.Cat;
import com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio.Fish;
import com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio.Mascota.Pet;
import com.twt.formacion.InterfaceProject.ClasesAbstractasInterfaces.dominio.Spider;

public  class PruebaClasesAbstracta {

	public static void main(String[] args) {

		Fish f = new Fish(4,"Dorado");
		Cat c = new Cat("Nevado");		
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		
		// Demostrar distintas implementaciones de una
		// interfaz
		
		
		// Fish
		
		f.play();	
		System.out.println("********************************************");
		f.eat();
		System.out.println("********************************************");
		f.nada();
		System.out.println("********************************************");
	
		// Cat
		c.play();
		System.out.println("********************************************");
		// llamada a métodos virtuales
		c.walk();
		System.out.println("********************************************");
		c.eat();		
		System.out.println("********************************************");
		
		// Spider utilizando métodos super Animal
		e.eat();
		System.out.println("********************************************");
		e.walk();
		
		
    
		

	}

}
