public class Concatenacion {
    static void main(String[] args) {
        String nombre = "Alexander";
        String apellido = "Cruz Apaza";
        int valor = 100;
        String palabra_1 = "Aprendiendo", palabra_2 = "Java";
        String saludo = palabra_1+ " " +palabra_2;

        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Nombre Completo: "+nombre+" "+apellido);
        System.out.println(saludo);
        System.out.println(palabra_1.concat(palabra_2));
    }
}
