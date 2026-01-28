import javax.swing.*;

public class While_Ejercicio_video_32 {
    public static void main(String[] args) {

        final String u_correcto = "Alexander99";
        final String p_correcto = "password";

        String username = "",password ="";
        int intentos =0;
        final int max_intentos = 3;



        while (intentos < max_intentos){

            username = JOptionPane.showInputDialog(null,"Ingrese nombre de usuario..");
            password = JOptionPane.showInputDialog(null,"Ingrese su contraseña..");

            if (username.equals(u_correcto) && password.equals(p_correcto)){

                JOptionPane.showMessageDialog(null,"Acceso Correcto!"+"\n"
                                                                    +"Bienvenido "+u_correcto);
                break;
            }else {
                intentos++;
                JOptionPane.showMessageDialog(null,"Usuario o clave incorrecto\n"+
                                                                    "Intente de nuevo...");

            }

            if (intentos>2){

                JOptionPane.showMessageDialog(null,"Intentos de acceso excedido\n"+
                                                                    "Contactate al Soporte ");
            }
        }


    }

}
