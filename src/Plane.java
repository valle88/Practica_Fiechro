import java.io.Serializable;
import java.util.Scanner;

public class Plane implements Serializable {

    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;

    private boolean flaps ;/*alas*/
    private boolean landingGear;
    private boolean ejectionSystem;

    private boolean seatOccupation;

    public Plane() {
    }

    public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
        this.fuelLevel = fuelLevel;
        this.pilotCallSign = pilotCallSign;
        this.squadNumber = squadNumber;

        // Completa el código para cumplir con los requisitos.
    }

    public void inizializar(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el número de litros de combustible cargados:\n");
        fuelLevel = sc.nextFloat();
        System.out.println("Introduzca apodo del piloto:\n");
        pilotCallSign = sc.next();
        System.out.println("Introduzca número de escuadrón");
        squadNumber = sc.next();






    }

    public void toggleFlaps() {/*alternar aletas*/
        flaps = !flaps;
        if (flaps== true ){
            System.out.println("Arriba");
        }
        System.out.println("Abajo");

    }

    public void toggleLandingGear() {/*alternar tren de aterrizaje*/
        landingGear = !landingGear;
<<<<<<< HEAD

||||||| 877c651
=======
        if (flaps== true ){
            System.out.println("Arriba");
        }
        System.out.println("Abajo");
>>>>>>> punto3
    }

    public void ejectionSystem() {/*sistema de  expulsion*/
        ejectionSystem = !ejectionSystem;
    }

    public void setSeatOccupation(boolean pilotSeated) {
        if(ejectionSystem== true){
            seatOccupation=true;
        }

    }

    @Override
    public String toString() {
        return "Plane{" +
                "fuelLevel=" + fuelLevel +
                ", pilotCallSign='" + pilotCallSign + '\'' +
                ", squadNumber='" + squadNumber + '\'' +
                ", flaps=" + flaps +
                ", landingGear=" + landingGear +
                ", ejectionSystem=" + ejectionSystem +
                ", seatOccupation=" + seatOccupation +
                '}';
    }

}
