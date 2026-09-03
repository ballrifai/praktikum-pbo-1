/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.tugas;

/**
 *
 * @author NITRO
 */
public class main {
    public static void main(String[] args) {
        Mahasiswa Mahasiswa1 = new Mahasiswa ();
        Mahasiswa Mahasiswa2 = new Mahasiswa ("L0325000", "Rijal Ahmad Risky", "Informatika");
        Mahasiswa Mahasiswa3 = new Mahasiswa ("L0325004", "Iqbal Rifa'i", "Informatika", 3.8);
        
        Mahasiswa1.cetakKHS();
        Mahasiswa2.cetakKHS();
        Mahasiswa3.cetakKHS();
    }
}
