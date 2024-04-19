/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author Jon Ander Incera Moreno
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        
        //Tipo de dato entero de 32 bits de longitud
        int byteInt = Integer.SIZE;
        int variableEntera = 10;
        System.out.println("Variable tipo int muestra datos enteros de " + byteInt + " bits. Ejemplo: " + variableEntera + "\n");
        
        //  Boolean: 1 byte (8 bits) almacenar valores true false.
        boolean esVerdadero = true;
        System.out.println("Boolean: 1 byte (8 bits) almacenar valores true false. Ejemplo: " + esVerdadero + "\n");
        
        // Short: 2 bytes para almacenar un valor entero entre -32768  y 32767
        short byteShort = Short.BYTES;
        short sminValue = Short.MIN_VALUE;
        short smaxValue = Short.MAX_VALUE;
        short corto = 32767;
        System.out.println("Short: " + byteShort + " bytes para almacenar un valor entero entre " + sminValue + " y " + smaxValue + " Ejemplo: " + corto + "\n");
        
        // Int: 4 bytes para almacenar un valor entero entre 2.147.483.648 y 2.147.483.647
        int num_ent = 1;
        System.out.println("Int: 4 bytes para almacenar un valor entero entre 2.147.483.648 y 2.147.483.647. Ejemplo: " + num_ent);
        
        // Long: 8 bytes. Valor entre -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807
        long byteLong = Long.BYTES;
        long lminValue = Long.MIN_VALUE;
        long lmaxValue = Long.MAX_VALUE;
        long num_ent_largo = 12345678901L;
        System.out.println("Long: " + byteLong + " bytes. Valor entre " + lminValue + " y " + lmaxValue + " Ejemplo: " + num_ent_largo + "\n");
        
        // Float: 4 bytes  Valor entre  (3.4e-038 a 3.4e+038).
        float byteFloat = Float.BYTES;
        float fminValue = Float.MIN_VALUE;
        float fmaxValue = Float.MAX_VALUE;
        float num_real = 625.25f;
        System.out.println("Float: 4 bytes  Valor entre  (3.4e-038 a 3.4e+038). Ejemplo: " + num_real + "\n");
        // Double: 8 bytes . Valor entre  (1.7e-308 a 1.7e+308)
        double num_doble_prec = 625.253333d;
        System.out.println("Double: 8 bytes . Valor entre  (1.7e-308 a 1.7e+308). Ejemplo: " + num_doble_prec);
        // Char: 2bytes para almacenar un caracteres.
        char letra = 'A';
        System.out.println("Char: 2bytes para almacenar un caracteres.ej: " + letra);
        System.out.println("---------------------------------------------------------\n");

       
        // Delaracion de variables para las operaciones
        int num_1 = 1, num_2 = 2, num_3 = 3, num_4 = 4, num_5 = 5, num_6 = 6;

        // USO DE OPERADORES ARITMETICOS
        System.out.println(num_1 + " + " + num_2 + "? " + (num_1 + num_2));
        System.out.println(num_1 + " - " + num_2 + "? " + (num_1 - num_2));
        System.out.println(num_1 + " x " + num_2 + "? " + (num_1 * num_2));
        System.out.println(num_1 + " / " + num_2 + "? " + (num_1 / num_2));
        System.out.println(num_1 + " resto_division " + num_2 + "? " + (num_1 % num_2));
        System.out.println("---------------------------------------------------------\n");
        //USO DE OPERADORES RELACIONALES
        System.out.println(num_1 + " == " + num_2 + "? " + (num_1 == num_2));
        System.out.println(num_1 + " != " + num_2 + "? " + (num_1 != num_2));
        System.out.println(num_1 + " < " + num_2 + "? " + (num_1 < num_2));
        System.out.println(num_1 + " > " + num_2 + "? " + (num_1 > num_2));
        System.out.println(num_1 + " <= " + num_2 + "? " + (num_1 <= num_2));
        System.out.println(num_1 + " >= " + num_2 + "? " + (num_1 >= num_2));
        System.out.println("---------------------------------------------------------\n");

        // USO DE OPERADORES LOGICOS
        System.out.println("esVerdadero && esVerdadero ? " + (true && true));
        System.out.println("esVerdadero && esFalso ? " + (true && false));
        System.out.println("esFalso && esFalso ? " + (false && false));
        System.out.println("esFalso && esVerdadero ? " + (false && true));
        System.out.println("---------------------------------------------------------\n");

        System.out.println("esVerdadero || esVerdadero ? " + (true || true));
        System.out.println("esVerdadero || esFalso ? " + (true || false));
        System.out.println("esFalso || esFalso ? " + (false || false));
        System.out.println("esFalso || esVerdadero ? " + (false || true));
        System.out.println("---------------------------------------------------------\n");

        System.out.println("! esVerdadero ? " + (!true));
        System.out.println("! esFalso ? " + (!false));
        System.out.println("---------------------------------------------------------\n");

        // USO DE OPERADORES UNARIOS
        num_3 = num_1;
        num_4 = num_2;

        System.out.println(" pre-incremento ++" + num_1 + " ? " + (++num_1));
        System.out.println(" post-incremento " + num_3 + "++ ? " + (num_3++));
        System.out.println(" pre-decremento --" + num_2 + " ? " + (--num_2));
        System.out.println(" post-decremento " + num_4 + "-- ? " + (num_4--));
        System.out.println("---------------------------------------------------------\n");

        // USO DE OPERADORESDE ASIGNACION
        num_5 = num_2;
        num_6 = num_2;
        num_6 += 5;
        System.out.println("num_5=" + num_5 + " y num_5+=5 hace que num_5=" + num_6);
        num_5 = num_6;
        num_6 *= 5;
        System.out.println("num_5=" + num_5 + " y num_5*=5 hace que num_5=" + num_6);
        System.out.println("---------------------------------------------------------\n");
    }
}
