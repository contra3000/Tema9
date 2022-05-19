public class Main {
    public static void main(String[] args) {
        System.out.println("------+------");

        Cliente client001 = new Cliente("Juan", 31, "387-493074", 15000);
        System.out.println(client001.getClientData());

        System.out.println("------+------");

        Trabajador employee001 = new Trabajador("Mario", 27, "381-4363633", 1200);
        System.out.println(employee001.getEmployeeData());

        System.out.println("------+------");
        System.out.println("Ready sr!");
    }
}
class Persona{
    int edad;
    String nombre;
    String telefono;

    public Persona(String nombre, int edad, String telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
class Cliente extends Persona{

    private float credit;

    public Cliente(String nombre, int edad, String telefono, float credit) {
        super(nombre, edad, telefono);
        this.credit = credit;
        System.out.println("Cliente registrado");
    };

    public String getClientData(){
        return "Cliente:\nNombre: " + this.nombre + "\nEdad: " + this.edad + "\nTelefono: " + this.telefono +
                "\nCredito: " + this.credit;
    }
}
    class Trabajador extends Persona{

    private float salario;

    public Trabajador(String nombre, int edad, String telefono, float salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
        System.out.println("Trabajador registrado");
    }

    public String getEmployeeData(){
        return "Trabajador:\nNombre: " + this.nombre + "\nEdad: " + this.edad + "\nTelefono: " + this.telefono +
                "\nCredito: " + this.salario;
    }
}