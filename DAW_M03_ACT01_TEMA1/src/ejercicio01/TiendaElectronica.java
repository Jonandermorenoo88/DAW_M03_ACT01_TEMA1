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
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cTelefonosMoviles = 50;
        int cOrdenadoresPortatiles = 30;
        int cAuricularesBluetooth = 40;
        
        int ptelefonomovil = 300;
        int pOrdenadoPortatil = 800;
        int pAuricularesBluetooh =50;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Cuantos Telefonos Moviles quieres comprar?");
        int StockTelefono = cTelefonosMoviles - sc.nextInt();
        int TotalTelefono = ptelefonomovil * sc.nextInt();
        System.out.println("El precio total de los telefonos moviles " + TotalTelefono);
        
        
        System.out.println("Cuantos Ordenadores Portatiles quieres comprar?");
        int StockOrdenaPortatiles = cOrdenadoresPortatiles - sc.nextInt();
        int TotalOrdenadorPortatil = pOrdenadoPortatil * sc.nextInt();
        System.out.println("El precio total de los ordenadores portatiles " + TotalOrdenadorPortatil);
        
        
        System.out.println("Cuantos Auriculares Bluetooth quieres comprar?");
        int StockAuricularesBluetooh = cAuricularesBluetooth - sc.nextInt();
        System.out.println(StockAuricularesBluetooh);
        int TotalAuricularesBluetooh = pAuricularesBluetooh * sc.nextInt();
        System.out.println("El precio total de los ordenadores portatiles " + TotalAuricularesBluetooh);
        
        
        System.out.println(StockTelefono);
        System.out.println(StockOrdenaPortatiles);
        System.out.println(StockAuricularesBluetooh);
        
    }
    
}
