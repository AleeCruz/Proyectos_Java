import java.util.Scanner;

public class Condicional_Switch_Case_Video_21 {
    public static void main(String[] args) {
        System.out.println("------Switch Case ----------");


        int DiaSemana;
        Scanner entrada = new Scanner(System.in);


        //Ingresando datos del usuario

        System.out.println("Ingrese dia a consultar...");
        DiaSemana = entrada.nextInt();

        switch (DiaSemana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("EL valor ingresado es el incorrecto");
                break;
        }




    }
}
