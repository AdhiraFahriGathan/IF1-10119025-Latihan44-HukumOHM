/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan44.hukumohm;

/**
 *
 * @author User
   * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang HukumOHM
 */
public class IF110119025Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3f, 12f);

        System.out.println("Kuat Arus : " + baterai1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : "+ baterai1.hitungTegangan() + " volt");
    }
}
