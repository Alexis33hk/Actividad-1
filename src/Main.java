import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Personaje> lstlista = new ArrayList<>();


        //MENU DE INTERACCION
        int op;


        do {
            System.out.println("1. Crear un nuevo personaje");
            System.out.println("2. Mostrar la lista de personajes creados");
            System.out.println("4.Ingrese el nombre del Personaje que quiere modificar");
            System.out.println("Seleccionar una opcion");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1. crear un nuevo personaje");

                    System.out.println("Ingrese el nombre de su personaje");
                    String nombre = teclado.next();

                    System.out.println("Ingrese el nivel de su personaje");
                    int nivel = teclado.nextInt();

                    System.out.println("Ingrese la experiencia adquirida");
                    int experiencia = teclado.nextInt();

                    System.out.println("Ingrese la vida del personaje");
                    int vida = teclado.nextInt();

                    System.out.println("Ingrese el estado del personaje (vivo/muerto)");
                    String estado = teclado.next();
                    boolean vivo = estado.equalsIgnoreCase("vivo");

                    Personaje pz1 = new Personaje(nombre, nivel, experiencia, vida, vivo);
                    lstlista.add(pz1);
                    break;
                case 2:
                    for (Personaje p : lstlista) {
                        System.out.println(p);
                    }
                case 3:
                    String nombre1;
                    System.out.println("INGRESE EL NOMBRE DEL PJ QUE DESEA BUSCAR");
                    nombre1 = teclado.next();
                    if(lstlista.isEmpty()){
                        System.out.println("LA LISTA NO TIENE ELEMENTOS");
                    }else {
                        Personaje pj1 = null;
                        for (Personaje p : lstlista) {
                            if (p.getNombre().equalsIgnoreCase(nombre1)) {
                                pj1 = p;
                                break;
                            }
                        }
                        if (pj1 != null){
                            System.out.println("Usuario encontrado:"+ pj1);
                        }else{
                            System.out.println("No se encontro el personaje");
                        }
                    }
                case 4:
                    String nombre2;
                    System.out.println("Ingrese el nombre del PJ que desea modificar");
                    nombre2 = teclado.next();
                    if(lstlista.isEmpty()){
                        System.out.println();
                        break;
                    }
            }

        }while (op != 2);
        teclado.close();
























    }
}