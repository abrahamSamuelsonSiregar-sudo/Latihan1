/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagi.semangatpagi1;

/**
 *
 * @author WINDOWS 11
 */
public class BujurSangkar extends BidangDuaDimensi {
    String nama = "bujur sangkar";
    float sisi;
    //constructor
    public BujurSangkar(float sisi){this.sisi = sisi;}
    //method
    public void luas(){
        float luas = sisi * sisi;
        System.out.println("Luas bujur sangkar ini adalah = "+ luas + "m2");
    }
}
