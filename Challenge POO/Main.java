import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("ingrese una contraseña: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(Password.esFuerte(s)){
            System.out.println("La contraseña dada es fuerte.");
        }
        else{
            System.out.println("La contraseña dada no es fuerte.");
        }
    }
}
