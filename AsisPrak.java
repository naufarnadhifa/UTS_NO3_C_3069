/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.uts_no3_c_3069;

/**
 *
 * @author NAUFA ARNADHIFA
 */
public class AsisPrak extends Mahasiswa {
    String mkAsistensi;
    int jmlPertemuan;
    double totalPendapatan;
    
    public double totalPendapatan(){
        totalPendapatan = jmlPertemuan * 50000;
        return totalPendapatan;
    }
    public void tampilDataAsisPrak(){
        tampilDataMahasiswa();
        System.out.println("Mk Asistensi        : "+mkAsistensi);
        System.out.println("Jumlah Pertemuan    : "+jmlPertemuan);
    }
}
    

