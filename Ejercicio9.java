public class Ejercicio9 {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        miCliente.setEdad(20);
        miCliente.setTelefono("7777777");
        miCliente.setNombre("Paco");
        miCliente.setCredito(100000.00);
        System.out.println(
            "Edad: " + miCliente.getEdad() +
            " Teléfono: " + miCliente.getTelefono() +
            " Nombre: " + miCliente.getNombre() +
            " Crédito: " + miCliente.getCredito()
            );

        Trabajador miTrabajador = new Trabajador();
        miTrabajador.setEdad(20);
        miTrabajador.setTelefono("7777777");
        miTrabajador.setNombre("Paco");
        miTrabajador.setSalario(100000.00);
        System.out.println(
            "Edad: " + miTrabajador.getEdad() +
            " Teléfono: " + miTrabajador.getTelefono() +
            " Nombre: " + miTrabajador.getNombre() +
            " Salario: " + miTrabajador.getSalario()
            );
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;
    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}