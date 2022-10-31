// clase-> es una plantilla que contiene elementos, objetos, metodos, funciones, variables.
// public y class son palabras reservadas
// Nomenclatura nombre clases -->pascal case -> primer letra empiece con mayuscula

public class Main {

    //varibables camelCase
    // tipo dato nombre de la variable
    //this significa que vamos a hacer uso de algun elemento de la clase

    String miVariable;
    static String miNombre = "Samuel";
    Character miChar = 'g';
    Integer miEdad = 20; //de tipo entero --> a una clase
    int miEdad2=25;//es un objeto de la clase
    double miFloat = 10.10;  //valores con punto decimal //float
    Boolean miBoleano = true; // false -->1 o 0

    // dentro de una clase podemos tener metodos, funciones, variables y constructores
    public static void main(String[] args) {
        String miApellido = "Sanchez";
        // linea que nos indica una salida a pantalla
        // si queremos concatenar algo tenemos que poner el simbolo de +
        System.out.println("este es mi primer codigo! " + miApellido);

        //instanciar una clase
        Sesion1 miSesionObjeto; //sin inicializar
        miSesionObjeto = new Sesion1();

        Sesion1 miSesionObjeto2 = new Sesion1(miNombre);
    }

    //Constructor

}
