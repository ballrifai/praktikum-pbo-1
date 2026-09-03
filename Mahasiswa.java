/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.tugas;

/**
 *
 * @author NITRO
 */
public class Mahasiswa {
    String nim;
    String nama;
    String programStudi;
    double ipk;
    
    public Mahasiswa () {
        this.nim = "Belum terdaftar";
        this.nama = "Belum terdaftar";
        this.programStudi = "Belum terdaftar";
        this.ipk = 0.0;
    }
    public Mahasiswa(String nim, String nama, String programStudi){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = 0.0;
    }
     public Mahasiswa(String nim, String nama, String programStudi, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = ipk;
    }
    public void cetakKHS(){
        System.out.println("Nim :" + nim);
        System.out.println("Nama :" + nama);
        System.out.println("Program Studi :" + programStudi);
        System.out.println("IPK : " + ipk);
        System.out.println("==================================");
    }
}


