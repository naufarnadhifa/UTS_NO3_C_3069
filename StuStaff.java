/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.uts_no3_c_3069;

/**
 *
 * @author NAUFA ARNADHIFA
 */
public class StuStaff extends Mahasiswa{
    int unitKerja, jamKerja;
    double totalPendapatan;

    public double totalPendapatan(){
        totalPendapatan = jamKerja * 30000;
        return totalPendapatan;
    }
    public void tampilDataStuStaff(){
        tampilDataMahasiswa();
        System.out.println("Unit Kerja      : "+unitKerja);
        System.out.println("Jam Kerja       : "+jamKerja);
    }
}