/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum.uts_no3_c_3069;

/**
 *
 * @author Acer
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UTS_NO3_C_3069 {

    public static void main(String[] args) {
       

        AsisPrak[] ap = new AsisPrak[1];
        StuStaff[] ss = new StuStaff[1];
        
        ap[0] = new AsisPrak();
        ss[0] = new StuStaff();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            for(int i = 0; i < 1; i++){
                System.out.println("Jumlah Asisten Praktikum : 1 ");
                System.out.println("===Input Asisten Praktikum===");
                System.out.print("NIM              : ");
                ap[i].nim = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan =br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk =Integer.parseInt(br.readLine());
                System.out.print("MK Asistensi     : ");
                ap[i].mkAsistensi = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jmlPertemuan = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("=== DATA ASISTEN PRAKTIKUM ===");
            for(AsisPrak AP : ap){
                AP.tampilDataAsisPrak();
                System.out.println("");
            }

            for(int i = 0; i < 1; i++){
                System.out.println("Jumlah Student staff : 1 ");
                System.out.println("===Input Student Staff===");
                System.out.print("NIM         : ");
                ss[i].nim = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan =br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja = Integer.parseInt(br.readLine());
                System.out.println();
            }
            

            System.out.println("=== DATA STUDENT STAFF ===");
            for(StuStaff SS : ss){
                SS.tampilDataStuStaff();
                System.out.println("");
            }
        } 
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}

   
                
       
   