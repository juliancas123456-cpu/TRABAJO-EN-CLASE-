import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n1, n2, suma;

        System.out.println("Digite 1er valor");
        n1 = teclado.nextInt();

        System.out.println("Digite 2do valor");
        n2= teclado.nextInt();

        suma=n1+n2;
        System.out.println("La suma es" + suma );


        }
    }

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random ale = new Random();
        int n1, n2, suma;
        n1 = ale.nextInt(51);
        System.out.println(n1);
        n2 = ale.nextInt((10-5)+1) +5;
        System.out.println(n2);
    }
}


import java.util.*;
        import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random ale = new Random();
        int x=0, par=0, impar=0;
        for (int i = 1; i <=100; i++){
            x= ale.nextInt((200-1)+1)+1;
            System.out.println(x);
            if (x%2==0){
                par=x+par;
            } else {
                impar=x+impar;
            }
        }
        System.out.println("La  suma de los numeros aleatorios cuando son pares es:"+par);
        System.out.println("La suma de los numeros aleatorios cuando son impares es"+impar);
    }
}
