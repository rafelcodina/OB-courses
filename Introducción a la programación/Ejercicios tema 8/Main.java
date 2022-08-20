public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(27);
        persona.setNombre("Rafel");
        persona.setTelefono(666000777);
        System.out.println("Hola, me llamo " + persona.getNombre() + ", tengo " + persona.getEdad() + " años y mi telefono es " + persona.getTelefono());
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