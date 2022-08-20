public class Main {
    public static void main(String[] args) {
        System.out.println("Resultado de la suma: " + Suma.suma(1, 2, 3));

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas(1);
        System.out.println("El coche tiene " + miCoche.getnumPuertas() + " puertas");
    }
}
