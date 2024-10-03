package Ejecutar;

import java.util.Scanner;

public class Ejecutar {
    public Listas objLista = new Listas();
    Scanner sc = new Scanner(System.in);
    
    public Ejecutar(){
        String op = "";
        final String NO = "N";
        do{
            op = "";
            Nodo n = new Nodo();
            n.valor = sc.nextInt();
            objLista.anadir(n);
            System.out.println("Desea agregar nuevo nodo?"
                    + "\n[Y] Agregar\n[N] Terminar");
            op = sc.next();
        }while(!op.equalsIgnoreCase(NO));
        System.out.println("Lista:");
        objLista.imprimir();
    }
    
    public static void main(String[] args) {
        new Ejecutar();
    }
}
