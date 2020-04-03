import java.util.ArrayList;

public class Vehicle implements Comparable<Vehicle> {

    String fahrzeugtyp;     //auto, helikoper, motorrad
    String marke;           //Peugot, Yamaha, BMW
    int gewicht;
    double laenge;


    public Vehicle(String fahrzeugtyp, String marke, int gewicht, double laenge) {


        this.marke = marke;
        this.fahrzeugtyp = fahrzeugtyp;
        this.gewicht = gewicht;
        this.laenge = laenge;


    }

        public Vehicle(String landVehicle, String mercedes, int i) {
        }


        public String getMarke() {
        return this.marke;
    }

    public String getFahrzeugtyp() {
        return this.fahrzeugtyp;
    }

    public int getGewicht() {
            return this.gewicht;
    }

    public double getLaenge() {
            return this.laenge;
    }

    public String toString() {
        return this.marke + " (" + this.fahrzeugtyp + ")" + "\n Gewicht: " + this.gewicht + " KG";
    }


    public int compareTo(Vehicle ve) {
        return this.marke.compareTo(ve.getMarke() + ve.getFahrzeugtyp());
    }
}

