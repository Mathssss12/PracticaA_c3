import Biblioteca.Biblioteca;
import Biblioteca.Bibliotecario;
import Biblioteca.Recurso;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ingrese el nombre de la biblioteca");
        var nombre=scanner.nextLine();
        System.out.println("INGRESE LA DIRECCION");
        var dir=scanner.nextLine();
        System.out.println("INGRESE EL TELEFONO");
        var tel=scanner.nextLine();
        System.out.println("INGRESE LA CAPACIDAD");
        var cap=scanner.nextInt();
        scanner.nextLine();
        var biblioteca=new Biblioteca(nombre,dir,tel,cap);

        System.out.println("INGRESE EL NOMBRE DEL BIBLIOTECARIO");
        var nom=scanner.nextLine();
        System.out.println("INGRESE EL ID");
        var id=scanner.nextLine();
        System.out.println("INGRESE EL TURNO");
        var turn=scanner.nextLine();
        System.out.println("INGRESE EL SALARIO");
        var salario=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("ASIGNANDO A BIBLIOTECA 1");
        var bibliotecario=new Bibliotecario(nom,id,turn,salario,biblioteca);

        boolean seguit=true;
        while (seguit){

            int opc=menu();
            switch (opc){
                case 1->{
                    System.out.println("TITULO?");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("¿Disponible? (si/no): ");
                    String disp = scanner.nextLine();
                    boolean disponible = disp.equalsIgnoreCase("si");

                    Recurso nuevo = new Recurso(titulo, autor, precio, disponible);
                    biblioteca.agregarRecurso(nuevo);
                }
                case 2->{
                    biblioteca.verRecurso();
                }
                case 3->{
                    System.out.println("Titulo a prestar?");
                    var t=scanner.nextLine();
                    bibliotecario.prestar(t);
                }
                case 4->{
                    System.out.println("Titulo a devolver?");
                    var t=scanner.nextLine();
                    bibliotecario.devolver(t);
                }
                case 5->{
                    seguit=false;
                    System.out.println("saliendo...");
                }
            }
        }
    }

    private static int menu(){
        System.out.println("1 registrarRecurso");
        System.out.println("2 VER RECURSOS");
        System.out.println("3 prestar re");
        System.out.println("4 DEVOLVER");
        System.out.println("5 SALIR");
        var opc=scanner.nextInt();
        scanner.nextLine();
        return opc;

    }

}
