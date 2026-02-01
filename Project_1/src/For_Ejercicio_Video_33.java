import javax.swing.*;

public class For_Ejercicio_Video_33 {
    public static void main(String[] args) {

        boolean validar = false;


        for (int i =0; validar == false;i++){
            String email = JOptionPane.showInputDialog(null,"Ingresa tu email...");

            if (email.contains("@") && email.endsWith(".com")){
                JOptionPane.showMessageDialog(null,"Email Ingresado Correctamente");
                validar = true;
                break;
            } else if (!email.contains("@")){
                JOptionPane.showMessageDialog(null,"Email no valido\n"+
                                                                "Debes de ingresar un @");
            }else{
                JOptionPane.showMessageDialog(null,"Email no valido"+"\n"+
                                                                    "Debes de ingresar el .com");
            }


        }




    }
}
