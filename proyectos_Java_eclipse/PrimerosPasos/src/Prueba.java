
public class Prueba {
	public static  void main(String[] args) {
		Clase_1 obj = new Clase_1();
		
		int numero = 5;
		
		obj.duplicar(numero);
		
		
		System.out.println("Valor de num = "+numero);
		
	}

}


class Clase_1{
	
	void duplicar(int x) {
		x=x*2;
		System.out.println("Valor de x= "+x);
	}
	
}