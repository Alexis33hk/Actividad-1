import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Personaje e1 = new Personaje("Alexis",20,60,100,10);
        e1.mostrarInformacion();

        System.out.println(("Ingrese la cantidad de monstruos que mato"));
        int cantidadM = teclado.nextInt();
        System.out.println("Tu exp"+e1.ganarexp(cantidadM));

        System.out.println(("Ingrese su nombre"));
        double name = teclado.nextInt();
        System.out.println("Tu nombre de usuario es"+e1.name(name));

        System.out.println(("Ingrese su nivel"));
        int n1 = teclado.nextInt();
        System.out.println("Tu exp"+e1.nivel(n1));

        System.out.println(("Ingrese la cantidad que desea curarse"));
        double Curarse = teclado.nextInt();
        System.out.println("Tu exp"+e1.curarse(Curarse));




























    }
}