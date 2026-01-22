import javax.swing.*;

public class Condicionales_If_Else_Video_19 {
    public static void main(String[] args) {

        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null,"Ingrese tu nombre..");
        String edad2 = JOptionPane.showInputDialog(null,"Ingrese su edad..");
        edad = Integer.parseInt(edad2);


        System.out.println(nombre);
        System.out.println(edad);


        //Analizando los datos de entrada

        if (edad >= 18){
            JOptionPane.showMessageDialog(null,"Eres mayo de edad");
        }else if (edad >= 12 && edad <18){
            JOptionPane.showMessageDialog(null,"Eres un adolecente");
        }else {
            JOptionPane.showMessageDialog(null,"Eres un/a niño/a");
        }




    }
}
