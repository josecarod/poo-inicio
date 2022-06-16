package com.generation;

public class Tacos {

	String tipoDeTortilla;
	String tipoDeGuisado;
	int numeroDeTortilla;
	String tamanoDeTortilla;
	float precio = 0.0f;
	
	/*
	 * //El constructor nos ayuda a inicializar objetos public Tacos(String
	 * tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla, String
	 * tamanoDeTortilla, float precio) { this.tipoDeTortilla = tipoDeTortilla;
	 * this.tipoDeGuisado = tipoDeGuisado; this.numeroDeTortilla = numeroDeTortilla;
	 * this.tamanoDeTortilla = tamanoDeTortilla; this.precio = precio; }
	 * 
	 * 
	 * 
	 * void preparar() { System.out.println("Preparando tu rico taco"); }
	 * 
	 * void vender() { System.out.println("Taco vendido"); }
	 * 
	 * void ponerSalsa() { System.out.println("Agregando salsa de la que no pica");
	 * }
	 * 
	 * void subirPrecio(float aumento) { precio = precio + aumento; }
	 * 
	 * @Override public String toString() { return "Tacos [tipoDeTortilla=" +
	 * tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla=" +
	 * numeroDeTortilla + ", tamanoDeTortilla=" + tamanoDeTortilla + ", precio=" +
	 * precio + "]"; }
	 */
	
	
	
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla; 
	}
	
	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}
	
	public void setNumeroDeTortilla(int NumeroDeTortilla) {
		if(NumeroDeTortilla >= 3) {
			throw new IllegalArgumentException("Son demasiadas tortillas para un taco :S");
		} else {
			this.numeroDeTortilla = NumeroDeTortilla;
		}
	}
	
	public void setTamanoDeTortilla(String tamanoDeTortilla) {
		this.tamanoDeTortilla = tamanoDeTortilla;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanoDeTortilla=" + tamanoDeTortilla + ", precio=" + precio + "]";
	}


	
	
	
}
