public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(42);
        cliente.setNombre("Pepito");
        cliente.setTelefono(666000777);
        cliente.setCredito(10937.75);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito() + "€");

        System.out.println("------------------------");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(42);
        trabajador.setNombre("Jose");
        trabajador.setTelefono(666000777);
        trabajador.setSalario(25937.75);
        System.out.println("Trabajador: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario() + "€");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}