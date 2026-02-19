
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
		
		//Todos los autos deberian de tener su precio base por el simple hecho de tener ruedas y color
		pesoBase = 1350.25;
		
		//Tambien deberia de tener un precio base que nos permita tener como referencia por el simple hecho de 
		//tener las 4 ruedas y el color
		
		precioBase = 15650.25;
		
		
		peso = pesoBase;
		
		precio = precioBase;
		
	}
	
	//Atributos de la clase coche 
	
	private double ancho;
	private double alto;
	private double peso;
	private double pesoBase;
	private String color;
	private int ruedas;
	
	private boolean climatizador;
	private boolean asientosDeCuero;
	private double precioBase;
	private double precio;
	
	/*Vamos a crear los getter and setter de las nuevasx variable con las herramientas de eclipse*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	public double getPesoBase() {
		return pesoBase;
	}

	public void setPesoBase(double pesoBase) {
		this.pesoBase = pesoBase;
	}

	public String isClimatizador() {
		
		if (this.climatizador == true ) return "EL coche incorpora zlimatizador";
		
		else return "EL coche No incorpora climatizador";
		 
	}

	public void setClimatizador(String climatizador) {
		
		if (climatizador.equalsIgnoreCase("si")) this.climatizador=true;
		else this.climatizador = false;
		
		setPeso();
		
		setPrecio();
	}

	public String  isAsientosDeCuero() {
		if (this.asientosDeCuero == true ) return "Tiene los asientos de cuero";
		else return "No tiene los asientos de cuero";
	}

	public void setAsientosDeCuero(String asientosDeCuero) {
		if (asientosDeCuero.equalsIgnoreCase("si")) this.asientosDeCuero = true;
		else this.asientosDeCuero = false;
		
		
		setPrecio();
		setPeso();
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecio() {
		return precio;
	}

	private void setPrecio() {
		
		if (climatizador) precioBase += 3250.25;
		if (asientosDeCuero) precioBase += 3500;
		
		precio = precioBase;
	}

	
	
	
	
	
	
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
		return this.peso;
	}

	private void setPeso() {
		
		if (this.climatizador) pesoBase += 50;
		if (this.asientosDeCuero) pesoBase +=70;
		
		peso = pesoBase;
		
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

	public void setRuedas(int ruedas) {
		if (ruedas>3 || ruedas>4) {
			System.out.println("La cantidad de ruedas que ingresaste es incorecta");
		}else {
			this.ruedas =ruedas;
		}
	}

	
	
	
	
	
	
	
	
	//AHora vamos a crear metodos de la clase coche 
	void arrancar() {
		
	}
	
	void frenar() {
		
	}
	
	
	void girar() {
		
	}
	
	
	//Resumentendo la palabra reservada this hace r
	//Referencia al atributo de la clase con la cual 
	//estamos trabajando 

}
