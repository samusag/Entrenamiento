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

        public static void operacionesAritmeticas(int num1, int num2) {
            int resultado = num1 + num2;
            System.out.println("Suma: " + resultado);

            resultado = num2 - num1;
            System.out.println("Resta: " + resultado);
            System.out.println("Division: " + num1 / num2);
            System.out.println("Multiplicacion: " + num1 * num2);
        }

        public void operadoresAritmeticos(){
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

            operacionesAritmeticas(30,15);

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
        public void operadoresRelacionales (){
            //-->regresa un valor verdadero o falso
            // == -> es el valor de la izquierda igual al de la derecha, es decir, es cuando se compara dos valores

            boolean resultado;
            int num1 = 10;
            int num2 = 15;
            resultado = num1 == num2;
            System.out.println(resultado); //caso1

            String caracter1 = "a";
            // char caracter2 = "a";
            System.out.println(caracter1 == Integer.toString(num2)); //caso2

            System.out.println(true==true); //caso3
            System.out.println("-------------DIFERENTE-----------------"); //caso3

            // != --> el valor de la izquierda es diferente al de la derecha
            resultado = num1 != num2;
            System.out.println(resultado); //caso 1
            System.out.println(caracter1 != Integer.toString(num2));//caso2
            System.out.println(true != true); //caso3

            // > y < // > el valor de la izquierda es mayor al de la derechac--> regresan un true o false
            // < evalua si el valor de la ezquierda es menor al de la derecha
            System.out.println("-------------Mayor y Menor-----------------"); //caso3
            resultado = 20 > 10;
            System.out.println("es mayor: "+ resultado);

            resultado = 20 < 18;
            System.out.println("es menor: "+ resultado);

            //<= el valor de izquierda es menor o igual
            resultado = 20 <= 10;
            System.out.println("es mayor;" + resultado);

            // >= el valor de la izquierda es mayor o igual
            resultado = 20 >= 20;
            System.out.println("es mayor o igual >: " + resultado);

        }
     public static void main (String[] args){
            //operadores logicos
            // && --> and los 2 valores deben ser iguales tanto al de la izquierda como el de la derecha
            // 0 = false
            // 1 = true
            // 0 && 0 --> true
            // 0 && 1 --> False
            // 1 && 0 --> False
            // 1 && 1 --> True


            boolean boolval1 = true;
            boolean boolval2=false;

            boolean resultado = boolval1 && boolval2; // 1 && 0
            System.out.println(resultado);

            resultado = (5 == 5) && true; //true && true --> 1 && 1

            // || -->(0) si hay un valor verdadero, regresa true
            // 0 = false
            // 1 = true
            // 0 || 0 --> false --> false || true;
            // 0 || 1 --> true --> false || true;
            // 1 || 0 --> true --> true || false;
            // 1 || 1 --> True --> true || true;
            System.out.println(false || false);
            System.out.println(false || true);
            System.out.println(true || false);
            System.out.println(true || true);

        }
    }







