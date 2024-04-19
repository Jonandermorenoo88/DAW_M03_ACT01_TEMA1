# DAW_M03_ACT01_TEMA1
# 1.	Identificación de los elementos de un programa informático y utilización de las estructuras de control. Gestión de una tienda de alimentación.
  ## 1.	Configura tu entorno de desarrollo integrado (IDE) y crea un nuevo proyecto en Java.
        a.	Crea un programa que gestione el inventario de una tienda de electrónica. Para ello, definiremos la cantidad inicial de algunos productos electrónicos.
           i.	Teléfonos móviles: 50 unidades
          ii.	Ordenadores portátiles: 30 unidades
          iii.	Auriculares Bluetooth: 40 unidades
        b.	Además, necesitamos establecer los precios de cada artículo:
        c.	Precio de un teléfono móvil: 300
        d.	Precio de un ordenador portátil: 800
        e.	Precio de unos auriculares Bluetooth: 50
  ## 2.	El programa debe solicitar al usuario que indique la cantidad de cada producto que desea comprar. Utiliza la clase Scanner para capturar la entrada del usuario. Por ejemplo:
      Scanner scanner = new Scanner(System.in);
      System.out.println("¿Cuantos telefonos moviles quieres comprar?");
      int cantidadCompradaMoviles = scanner.nextInt();
 ## 3.	Utilizando System.out.println, muestra la cantidad de cada artículo que queda en el inventario después de la compra.

# 2.	Ejercicio02.java: Dentro del proyecto anterior, crea un nuevo archivo de nombre Ejercicio02.java.
    2.1.	Tienes que hacer uso de cada variable primitiva (encontrarás un listado en los apuntes). Para ello declara una variable de cada tipo y haz uso de ella, mostrando un mensaje con su definición, tal y como se ve en el ejemplo siguiente:
      Ej:
      //Tipo de dato entero (int)
      int variableEntera =10;
      System.out.println("Variable tipo int muestra datos enteros de 32 bits. Ejemplo:"+variableEntera);

    2.2.	Al igual que en el ejercicio anterior, haz uso de los operadores lógicos y relacionales.
      Ej:
      System.out.println("--Operadores lógicos--");
      System.out.println("El resultado de true && false es:"+ (true && false) );
