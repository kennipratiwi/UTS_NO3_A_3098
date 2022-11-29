/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo.uts_no3;

/**
 *
 * @author Asus
 */
public class AsistenPraktikum_3098 extends Mahasiswa_3098 {
    String mkAsisten;
    int jmlPertemuan;
    String nim;
    
    public double totalPendapatan(){
        return(jmlPertemuan * 50000);
    }
    public void tampilDataAsistenPraktikum() {
        super.tampilDataMhs();
        System.out.println(" Mata Kuliah    : " + mkAsisten);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan);
        System.out.println(" Total Pendapatan : " + totalPendapatan());
        
        
    }
    
}
