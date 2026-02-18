/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagi.semangatpagi1;

/**
 *
 * @author WINDOWS 11
 */
public class Lingkaran extends BidangDuaDimensi{
    String nama = "lingkaran";
    float radius;
    final float phi = 3.14f;
    //constructor
    public Lingkaran(float radius){this.radius = radius;}
    //method
    public void luas(){
        float luas = phi * radius * radius;
        System.out.println("Luas lingkaran ini adalah = "+ luas + "m2");
    }
}
