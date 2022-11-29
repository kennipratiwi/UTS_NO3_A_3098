/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo.uts_no3;

/**
 *
 * @author Asus
 */
public class StudentStaff_3098 extends Mahasiswa_3098 {
        int unitKerja, jamKerja;
    
    public double totalPendapatan(){
        return (jamKerja * 30000);
    }
    public void tampilDataStudentStaff(){
        super.tampilDataMhs();
        System.out.println(" Unit Kerja : " + unitKerja);
        System.out.println(" Jam Kerja : " +jamKerja);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan());
    }
}

