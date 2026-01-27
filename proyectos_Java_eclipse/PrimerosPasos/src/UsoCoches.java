
public class UsoCoches {

	public static void main(String[] args) {
		
		
		/*Acabamos de ejercitar los conceptos del video  27 y 28 
		 * Se crearon 2 archivos para la ejercitacion del uso de las clases 
		 * una clase de tipo Coche y otra clase donde se crearan y usaran todos las instancias de la clase 
		 * cohce*/
		
		
		
		Coche renault = new Coche();
		
		
		renault.andho = 1523.3;
		
		renault.arrancar();
		
		
		
		Coche mazda = new Coche();

		
		mazda.color = "Azul";
		mazda.girar();
		//Se vera un ejemplo de el ingreso de ruedas de un objeto coche
		
		mazda.setRuedas(4);
		
		//Y oara observar la cantidad de ruedas que tiene dicho objeto lo obtenemos
		//Con el metodo getRuedas
		
		mazda.getRuedas();
		
		System.out.println("La cantidad de ruedas que tiene el coche es: "+mazda.getRuedas());
				
	}

}
