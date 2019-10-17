/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */
public class PBOUlang10116435Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10116435";
        mhs.nama = "Luthfi Aziz Al Paqih";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);
        
        System.out.println();
        
        mhs.nim = "10116458";
        mhs.nama = "Rinanda Al Qorrie Akbar";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);
    }
    
}
