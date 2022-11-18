public class MAIN {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 18;
        cliente.nombre = "diego";
        cliente.telefono = 123456;
        cliente.credito = 234.234;
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 234.234;
        System.out.println(trabajador.salario);
    }
}
class Persona{
    int edad;
    String nombre;
    long telefono;

}
class Cliente extends Persona{
    double credito;

}
class Trabajador extends Persona{
    double salario;
}