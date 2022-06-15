public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(30);
        cliente.setNombre("Pepito");
        cliente.setTelefono(666999666);
        cliente.setCredito(6000);
        System.out.println(cliente.getEdad() + "   " + cliente.getNombre() + "   "+ cliente.getTelefono() + "   "+ cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(31);
        trabajador.setNombre("Juanito");
        trabajador.setTelefono(666777666);
        trabajador.setSalario(3000);
        System.out.println(trabajador.getEdad() + "   " + trabajador.getNombre() + "   "+ trabajador.getTelefono() + "   "+ trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    private int credito;
    
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
    }
}