public class Calculator {
    
    public static void main(String[] args) {
    int number1 = 10;
    int number2 = 5;
        //Ejecuta aquí todos los métodos creados e imprime en la terminal.
        System.out.println("La suma de " + number1 + " y " + number2 + " es: " + add(number1, number2));
        System.out.println("La resta de " + number1 + " y " + number2 + " es: " + subtract(number1, number2));
        System.out.println("La multiplicación de " + number1 + " y " + number2 + " es: " + multiply(number1, number2));
        System.out.println("La división de " + number1 + " y " + number2 + " es: " + divide(number1, number2));

        
    }

    //Define los métodos basándote en su doc comment.

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */
    public static double add(double number1, double number2){
        return number1 + number2;
    }

    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */
    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }

    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */
    public static double divide(double number1, double number2){
        return number1 / number2;
    }

}
