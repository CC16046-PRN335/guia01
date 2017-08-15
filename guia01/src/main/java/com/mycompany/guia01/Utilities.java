
package com.mycompany.guia01;


public class Utilities {
  String resume;
  /* Este metodo se encarga de extraer los primeros 30 caracteres de una cadena de texto a traves de la variable llamada "cadena"
  que se encarga de ir guardando cada caracter para despues pasarlo a la variable "resume" e imprimir los caracteres*/
    public String getResume(String resume){
        String cadena="";
        for(int i=0;i<30;i++){
            cadena=cadena+resume.charAt(i);
        }
        resume=cadena;
        return resume;   
    }
    
    public String capitalizar(String resume){
        String cadena="";
        resume.replaceAll("  ", " ");
        for(int i=1; i<resume.length();i++){
            if(resume.charAt(i-1)==' ' || resume.charAt(i)==' ' ){
                cadena += String.valueOf(resume.charAt(i)).toUpperCase();
                
            }else{
                cadena += resume.charAt(i);
            }
        }
        return cadena;
    }
}
