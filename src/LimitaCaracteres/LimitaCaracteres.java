/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LimitaCaracteres;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author mazzan
 */
public class LimitaCaracteres extends PlainDocument{
    
    public enum TipoEntrada{
        NUMEROINTEIRO, NUMERODECIMAL, NOME, EMAIL, DATA;
        
    };
    
    private int qtdCaracteres;
    private TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        
        if (str == null || getLength() == qtdCaracteres){
            return;
        }
        
        int totalCarac = getLength() + str.length();
        
        String regex = "";
        
        switch(tpEntrada){
            case NUMEROINTEIRO: regex = "[^0-9]"; break;
            case NUMERODECIMAL: regex = "[^0-9,.]"; break;
            case NOME:          regex = "[^\\p{IsLatin} ]"; break;
            case EMAIL:         regex = "[^\\p{IsLatin}@.\\-_][^0-9]"; break;
            case DATA:          regex = "[^0-9/]"; break;
        }
        
        str = str.replaceAll(regex, "");
        
        if (totalCarac <= qtdCaracteres){
            super.insertString(offs, str, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        } else {
            String nova = str.substring(0, qtdCaracteres);
            super.insertString(offs, nova, a);
        }
    }  
}
