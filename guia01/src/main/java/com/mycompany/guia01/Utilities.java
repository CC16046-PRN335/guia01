
package com.mycompany.guia01;


public class Utilities {
  String texto;
  /**
   * El método getResume se encarga de extraer los primeros 30 caracteres de un texto.
   * @param texto
   * @return texto
   */
    public String getResume(String texto){
        String cadena="";
        for(int i=0;i<30;i++){
            cadena=cadena+texto.charAt(i);
        }
        texto=cadena;
        return texto;   
    }
    /**
     * El método capitalizar se encarga de cambiar la primer letra de una palabra por esa misma letra en mayúscula.
     * @param texto
     * @return texto
     */
    public String capitalizar(String texto){
        String cadena="";
        texto.replaceAll("  ", " ");
        cadena += String.valueOf(texto.charAt(0)).toUpperCase();
        for(int i=1; i<texto.length();i++){
            if(texto.charAt(i-1)==' ' || texto.charAt(i)==' ' ){
                cadena += String.valueOf(texto.charAt(i)).toUpperCase();
                
            }else{
                cadena += texto.charAt(i);
            }
        }
        return cadena;
    }
    
    public int contarCoincidencias(String frase, String texto){
        
        
        return 0;
    }
}
