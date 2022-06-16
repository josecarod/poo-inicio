package com.generation;

public class Main {
	
	public static void main (String [] args) {
		// TODO Auto-generated method stub
		/* Tacos taco1 = new Tacos("Maza Azul", "Suadero", 4, "Mediana", 32); */
		
		/*
		 * taco1.tipoDeTortilla = "Maza Azul"; taco1.tipoDeGuisado = "Suadero";
		 * taco1.numeroDeTortilla = 2; taco1.tamanoDeTortilla = "Mediana"; taco1.precio
		 * = 30; taco1.subirPrecio(5.5f);
		 */
		
		/*
		 * System.out.println(taco1.toString());
		 */
		/*
		 * Tacos taco2 = new Tacos();
		 * 
		 * taco2.tipoDeTortilla = "Harina"; taco2.tipoDeGuisado = "Cecina";
		 * taco2.numeroDeTortilla = 1; taco2.tamanoDeTortilla = "Grande"; taco2.precio =
		 * 42.6f;
		 * 
		 * System.out.println(taco2.toString());
		 */
		
		Tacos taco1 = new Tacos();
		
		taco1.setTipoDeTortilla("Maiz");
		taco1.setTipoDeGuisado("Chicharron en salsa verde");
		taco1.setTamanoDeTortilla("Mediana");
		taco1.setNumeroDeTortilla(2);
		taco1.setPrecio(90f);
	
		
		System.out.println(taco1);
	}

}
