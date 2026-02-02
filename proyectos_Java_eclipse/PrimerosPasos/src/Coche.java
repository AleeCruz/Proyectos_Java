
/*
 * Se vio los conceptos de programacion Orientado a objetos sobre CLases y Objetos
 * podemosdecir que la programacion orientada a objetos  tiene pilares fundamentales
 * 
 * Los principales 
 * 
 * 		->Clases
 * 		-<Objetos
 * 
 * */


public class Coche {
	
	/*Vamos a crear el metodo constructor 
	 * para inicializar los objetos */
	public Coche (){
		ruedas =4;
		color = "gris";
		
	}
	
	//Atributos de la clase coche 
	
	private double ancho;
	private double alto;
	private double peso;
	private String color;
	private int ruedas;
	
	
	
	
	/*
	//Se creara un seter para el atributo de ruedas.
	
	//Este es un metodo para setear/ingresar una cantidad de ruedas
	public void setRuedas(int ruedas) {
		
		if (ruedas <2 || ruedas >4) {
			System.out.println("LA CANTIDAD DE RUEDAS QUE ESTAS ESPECIFICANDO ES INCORRETA");
		}else {
			this.ruedas = ruedas;
		}
		
	}
	
	//Este es un metodo que nos permite obtener el valor actual de un atributo
	public int getRuedas() {
		return this.ruedas;
	}
	
	*/
	
	
	
	//Se crearon los getters and setters de la clase coche pero en esta ocacion 
	//Se uso la herramienta de desarrollo eclipse 
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int r) {
		if (r>3 || r>4) {
			System.out.println("La cantidad de ruedas que ingresaste es incorecta");
		}else {
			ruedas = r;
		}
	}

	
	
	//AHora vamos a crear metodos de la clase coche 
	void arrancar() {
		
	}
	
	void frenar() {
		
	}
	
	
	void girar() {
		
	}
	
	
	

}
