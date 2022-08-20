public class Coche {
    private int numPuertas;

    public Coche() {
        this.numPuertas = 0;
    }
    public int getnumPuertas() {
        return numPuertas;
    }
    public void incrementarPuertas(int num) {
        this.numPuertas = numPuertas + num;
    }
    
}
