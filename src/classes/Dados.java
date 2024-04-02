package classes;

import classes.Usuario;

public class Dados {
    private Usuario msUsuarios[]= new Usuario[50];
    private int conUsu = 0;
    
    public Dados (){
        Usuario mUsuario = new Usuario("Paulo","Silva","010101","09876543210","1");
                msUsuarios[conUsu]=mUsuario;
                conUsu++;
    }
        
            
    public boolean validarUsuario (String Cpf, String Dn){
        boolean aux = false;
        for(int i = 0; i < conUsu; i++){
        if(msUsuarios[i].getCpf().equals(Cpf)&& msUsuarios[i].getDn().equals(Dn)){
            return true;
        }
        }
        return false;
    }
    public boolean validarUsuario1 (String Cpf, String Dn){
        if(Cpf.equals("12345678901")&& Dn.equals("010203")){
            return true;
        }else{
            return false;
        }
    }   
}

