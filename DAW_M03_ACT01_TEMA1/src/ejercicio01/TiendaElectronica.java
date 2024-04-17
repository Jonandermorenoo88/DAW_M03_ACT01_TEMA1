/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;

/**
 *
 * @author Jon Ander Incera Moreno
 */
public class TiendaElectronica {

    public static void main(String[] args) {
        
        int cTelefonosMoviles = 50;
        int cOrdenadoresPortatiles = 30;
        int cAuricularesBluetooth = 40;
        
        int ptelefonomovil = 300;
        int pOrdenadoPortatil = 800;
        int pAuricularesBluetooh = 50;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos Telefonos Moviles quieres comprar?");
        int cantidadTelefonos = sc.nextInt();
        int TotalTelefono = ptelefonomovil * cantidadTelefonos;
        int StockTelefono = cTelefonosMoviles - cantidadTelefonos;
        System.out.println("El precio total de los telefonos moviles: " + TotalTelefono);
        
        System.out.println("Cuantos Ordenadores Portatiles quieres comprar?");
        int cantidadOrdenadores = sc.nextInt();
        int TotalOrdenadorPortatil = pOrdenadoPortatil * cantidadOrdenadores;
        int StockOrdenaPortatiles = cOrdenadoresPortatiles - cantidadOrdenadores;
        System.out.println("El precio total de los ordenadores portatiles: " + TotalOrdenadorPortatil);
        
        System.out.println("Cuantos Auriculares Bluetooth quieres comprar?");
        int cantidadAuriculares = sc.nextInt();
        int TotalAuricularesBluetooh = pAuricularesBluetooh * cantidadAuriculares;
        int StockAuricularesBluetooh = cAuricularesBluetooth - cantidadAuriculares;
        System.out.println("El precio total de los auriculares Bluetooth: " + TotalAuricularesBluetooh);
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Quedan " + StockTelefono + " Telefonos Moviles");
        System.out.println("Quedan " + StockOrdenaPortatiles + " Ordenadores Portatiles");
        System.out.println("Quedan " + StockAuricularesBluetooh + " Auriculares Bluetooth");
    }    
}
