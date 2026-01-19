import javax.swing.*;

public class Input_Datos_2_video_11 {
    public static void main(String[] args) {

        System.out.println("-------Ingreso de datos 2---------");
        String nombre ;
        int edad ;

        //Ingreso de datos por JOptionsPane
        nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre..");
        String edad2 = JOptionPane.showInputDialog(null,"Ingrese su edad ...");
        edad = Integer.parseInt(edad2);


        //Mostrar Datos por pantalla
        JOptionPane.showMessageDialog(null,"Nombre: "+nombre +"\n"+
                                                                   "Edad: "+edad);


    }
}
