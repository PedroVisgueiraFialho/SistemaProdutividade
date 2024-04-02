/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
/**
 *
 * @author rafae
 */
public class LimitaCaracteres extends PlainDocument {
    public enum tipoEntrada{
        NOME, DATA, CPF, NUMEROINTEIRO, NUMERODECIMAL, ORDEMSERVICO;
    }
    private int qtdCaracteres;
    private tipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdCaracteres, tipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if(string == null || getLength() == qtdCaracteres){
            return;
        }
        int totalCarac = getLength() + string.length();
        //Filtro caracteres
        String regex = "";
        switch(tpEntrada){
            case NOME: regex = "[^\\p{IsLatin} ]"; break;
            case DATA: regex = "[^0-9]"; break;
            case CPF: regex = "[^0-9]"; break;
            case NUMEROINTEIRO: regex = "[^0-9]"; break;
            case NUMERODECIMAL: regex = "[^0-9.,]"; break;
            case ORDEMSERVICO: regex = "[^0-9\\-]"; break;
        }
        //Fazendo substituição
        string = string.replaceAll(regex, "");
        
        if(totalCarac <= qtdCaracteres){
        super.insertString(i, string, as); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }else{
            String nova = string.substring(0, qtdCaracteres);
            super.insertString(i, nova, as);
        }
    }
        
    
    
}
