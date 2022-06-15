import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Plane nave = new Plane();




        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("1- Inizializar F18");
            System.out.println("2-Alternar el estado de los flap");
            System.out.println("3- Alternar estado de tren de aterrizaje");
            System.out.println("4- Armar sistema de eyeccion");
            System.out.println("5- Eyectar piloto");
            System.out.println("Q. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    nave.inizializar();
                    System.out.println(nave);



                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    break;
                case 5:
                    salir=true;
                    break;


                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }



    }
}
