package classes;

import classes.Usuario;
import java.util.Arrays;

public class Dados {
    private int maxUsu = 50;
    private Usuario msUsuarios[]= new Usuario[maxUsu];
    private int conUsu = 0;
    
    public Dados (){
        Usuario mUsuario = new Usuario("Paulo Silva","010101","09876543210",1,"1");
                msUsuarios[conUsu]=mUsuario;
                conUsu++;
    }
    
    public Usuario[]getUsuarios(){
        return msUsuarios;
    }    
            
    public boolean validarUsuario (String Id){
        boolean aux = false;
        for(int i = 0; i < conUsu; i++){
        if(msUsuarios[i].getId().equals(Id)){
            return true;
        }
        }
        return false;
    }
    public boolean validarUsuario1 (String Id){
        if(Id.equals("2")){
            return true;
        }else{
            return false;
        }
    }   
    
    public int posicaoUsuario (String Cpf){
      
        for(int i = 0; i < conUsu; i++){
        if(msUsuarios[i].getCpf().equals(Cpf)){
            return i;
        }
        }
        return -1;
    }
    
    public String adicionarUsuario(Usuario msUsuario){
        if(conUsu == maxUsu){
            return"NÃO É POSSIVEL CADASTRAR MAIS USUÁRIOS";
        }
        msUsuarios[conUsu]=msUsuario;
        conUsu++;
        return"USUÁRIO CADASTRADO COM SUCESSO";
    }
}

