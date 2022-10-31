package Operadores;

    //public significa que es accesible desde cualquier lado del proyecto
    public class OperadoresBasicos {
        //declarar metodos public, private, abstract
        //void palabra reservada
        //nombre mestodo
        public static void sumar() {
            //+-->sumar 2 o mas numeros
            int num1 = 10;
            int num2 = 15;
            int resultado = num1 + num2;

            System.out.println(resultado);
        }
        //un argumento es un valor que se manda en el metodo
        public static void sumar(int num1, int num2) {
            int resultado = num1 + num2;
            System.out.println(resultado);
        }

        public static void operaciones_aritmeticas(int num1, int num2) {
            int resultado = num1 + num2;
            System.out.println("Suma: " + resultado);

            resultado = num2 - num1;
            System.out.println("Resta: " + resultado);
            System.out.println("Division: " + num1/num2);
            System.out.println("Multiplicacion: " + num1 * num2);

        }

        public static void main(String[] args) {
            //para llamar una funcion dentro de una misma clase, simplmente poner el nombre
            sumar();
            sumar(20,20);

            // sumar +
            // restar -
            // dividir /
            //multiplicar *
            //residuo % --5/2 -->2
            //incremento ++
            //disminuir --

            operaciones_aritmeticas(30,15);

            //incrementar ++  -->incrementar 1
            int valor = 5;
            valor++;  //--> valor = valor + 1;
            System.out.println(valor);

            //disminuir

            valor--; //--> valor = valor - 1;
            System.out.println(valor);

            //incrementar por ejemplo de 3 en 3
            valor+=3;
            System.out.println(valor);
            valor-=5;
            System.out.println(valor);

        }
    }





