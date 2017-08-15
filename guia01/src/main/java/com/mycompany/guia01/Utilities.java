
package com.mycompany.guia01;


public class Utilities {
  String texto;
  /* Este metodo se encarga de extraer los primeros 30 caracteres de una cadena de texto a traves de la variable llamada "cadena"
  que se encarga de ir guardando cada caracter para despues pasarlo a la variable "resume" e imprimir los caracteres*/
    public String getResume(String texto){
        String cadena="";
        for(int i=0;i<30;i++){
            cadena=cadena+texto.charAt(i);
        }
        texto=cadena;
        return texto;   
    }
    
    public String capitalizar(String texto){
        String cadena="";
        texto.replaceAll("  ", " ");
        for(int i=1; i<texto.length();i++){
            if(texto.charAt(i-1)==' ' || texto.charAt(i)==' ' ){
                cadena += String.valueOf(texto.charAt(i)).toUpperCase();
                
            }else{
                cadena += texto.charAt(i);
            }
        }
        return cadena;
    }
}
