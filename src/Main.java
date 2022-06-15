import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Plane f18= new Plane();
        FileOutputStream outputFile = null;
        BufferedOutputStream bufferedOutput = null;
        ObjectOutputStream objectOutput = null;



        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        String opcion;

        while(!salir){

            System.out.println("1- Inizializar F18");
            System.out.println("2-Alternar el estado de los flap");
            System.out.println("3- Alternar estado de tren de aterrizaje");
            System.out.println("4- Armar sistema de eyeccion");
            System.out.println("5- Eyectar piloto");
            System.out.println("Q. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.next();
            switch(opcion){
                case "1":
                    System.out.println("Has seleccionado la opcion 1");
                    f18.inizializar();
                    System.out.println(f18);
                    break;
                case "2":
                    System.out.println("Has seleccionado la opcion 2");
                    f18.toggleFlaps();
                    System.out.println(f18);
                    break;
                case "3":
                    System.out.println("Has seleccionado la opcion 3");
                    f18.toggleLandingGear();
                    System.out.println(f18);

                    break;
                case "4":
                    f18.ejectionSystem();
                    System.out.println(f18);
                    break;
                case "5":
                    f18.setSeatOccupation(true);
                    System.out.println(f18);
                    break;
                case "Q":
                    salir=true;
                    try {
                        outputFile = new FileOutputStream(fileName);
                        bufferedOutput = new BufferedOutputStream(outputFile);

                        objectOutput = new ObjectOutputStream(bufferedOutput);
                        objectOutput.writeObject(new Plane());
                        objectOutput.writeObject(new Plane());
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (objectOutput != null) objectOutput.close();
                            if (bufferedOutput != null) bufferedOutput.close();
                            if (outputFile != null) outputFile.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;


                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }



    }
}
