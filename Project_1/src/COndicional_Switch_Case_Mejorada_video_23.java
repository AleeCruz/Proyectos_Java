import java.util.Scanner;

public class COndicional_Switch_Case_Mejorada_video_23 {
    public static void main(String[] args) {

        int DiaDeLaSemana;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana.... ");
        DiaDeLaSemana = entrada.nextInt();

        //Aplicando los conceptos de switchcase pero de la version mejorada

        switch (DiaDeLaSemana){
            case 1-> System.out.println("Lunes");
            case 2-> System.out.println("Martes");
            case 3-> System.out.println("Miercoles");
            case 4-> System.out.println("Jueves");
            case 5-> System.out.println("Viernes");
            case 6-> System.out.println("Sabado");
            case 7-> System.out.println("Domingo");
            default -> System.out.println("Valor incorrecto, cerrando Sistema");
        }

    }
}
