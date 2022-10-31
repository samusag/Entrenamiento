package Operadores;

public class Condicionales {

    public static void main(String[] args) {
        //if - Else Evalua varias condiciones
        // if (condicion){
        // statements...
        // instrucciones...
        // }
        // else {
        // varias instrucciones...
        // }
        int edad = 20;
        // mayor a 18 años
        // mayor de 15
        if(edad >= 18) {
            System.out.println("Licencia aceptada");
        } else if (edad >= 15)
        {
            System.out.println("Licencia provisional");
        } else {
            System.out.println("Licencia rechazada");
        }
        if (edad >= 15){
            if(edad >= 18)
                System.out.println("Licencia aceptada");
            else
                System.out.println("Licencia provisional");


            //ternarios
            // ? -->significa entonces
            // : --> significa sino
            String resultados = edad >= 15 ? "Licencia provisional" : "Licencia rechazada";
            System.out.println(resultados);

            boolean resultadobooleano = edad >= 18 ? true : false;
            //01:23:02
        }
        }

    }

