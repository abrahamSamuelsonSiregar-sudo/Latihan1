/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagi.semangatpagi1;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 11
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program menghitung luas bidang 2 dimensi");
        System.out.println("========================================");
        System.out.println("Masukkan nilai sisi untuk menghitung luas bujur sangkar: ");
        float sisi = in.nextFloat();
        
        //menghitung bujur sangkar
        BujurSangkar obj1 = new BujurSangkar(sisi);
        
        obj1.info(obj1.nama);
        obj1.luas();
        
        System.out.println("Masukkan nilai radius untuk menghitung luas lingkaran: ");
        float radius = in.nextFloat();
        
        //menghitung lingkaran
        Lingkaran obj2 = new Lingkaran(radius);
        obj2.info(obj2.nama);
        obj2.luas();
        
        
    }
}     