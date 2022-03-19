import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.util.Random;

public class Password {
    int longitud = 8;
    String contraseña = "";

    public Password(){}

    public Password(int l){
        longitud = l;
    }

    public boolean esFuerte(){
        return this.esFuerte(contraseña);
    }

    //como el enunciado no dice nada asumo que la contraseña generada no tiene porque ser fuerte
    public void generarPassword(){
        //genero númerso aleatorios entre 0 y 61 y los utilizo para determinar los caracteres de la contraseña
        //0-9 = 0-9
        //10-35 = A-Z
        //36-61 = a-z
        char c = '#';
        Random random = new Random();
        int upperBound = 62;
        int nextChar = 0;
        for (int i = 0; i < longitud; i++) {
            nextChar = random.nextInt(upperBound);
            if (nextChar<10){
                c = (char)(nextChar + 48);
            }
            if (nextChar>=10 && nextChar<=35){
                c = (char)(nextChar+55);
            }
            if (nextChar>35){
                c = (char)(nextChar+61);
            }
            contraseña = contraseña + String.valueOf(c);
            System.out.println(contraseña);
        }
    }

    public void setLongitud(int l){
        longitud = l;
    }

    public int getLongitud(){
        return longitud;
    }

    public String getContraseña(){
        return contraseña;
    }

    //el enunciado no aclara como chequear una contraseña dada por el usuario por lo que decidi agregar un metodo estatico esFuerte()
    // con un argumento de entrada  para poder utilizarlo en la aplicación
    public static boolean esFuerte(String s){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        boolean fuerte = false;
        for (int i = 0; i < s.length() && !fuerte; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)){
                mayusculas++;
            }
            if(Character.isLowerCase(c)){
                minusculas++;
            }
            if(Character.isDigit(c)){
                numeros++;
            }
            if(mayusculas>2 && minusculas>1 && numeros>3){
                fuerte = true;
            }

        }
        return fuerte;
    }
}
