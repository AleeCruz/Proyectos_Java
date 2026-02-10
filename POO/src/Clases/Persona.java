package Clases;

 class Persona {
     String nombre = "Jose";
     int edad = 30;
     double peso = 86.30;
     boolean soltero = true;


     //Creando metodos
     String DImeNombre(){
         return "Hola a todos";
     }


     static void main() {
         Persona persona_1 = new Persona();
         System.out.println("Nombre: "+persona_1.nombre);

         System.out.println(persona_1.DImeNombre());
     }
}
