    
package classes;

import formularios.frmLogin;
import javax.swing.JFrame;

public class JavaSistema {

    public static void main(String[] args) {
     Dados msDados = new Dados();
     frmLogin miLogin = new frmLogin();
     miLogin.setDados(msDados);
     miLogin.setLocationRelativeTo(null);
     miLogin.setVisible(true);
    }
    
}
