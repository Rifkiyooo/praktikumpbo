/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author RIFKI
 */
public class siswa {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    private int nisn = 0;
    private String alamat;
    
    public void isiData(){
        nama = "rifki";
        nilai = 100;
        kelas = "XI RPL B";
        nisn = 21789887;
        alamat = " Jl.nogosari,Ghana";
    }
    
    public void cetak(){
        System.out.println("nama   : " + nama);
        System.out.println("nilai   : " + nilai);
        System.out.println("kelas : " + kelas);
        System.out.println("NISN: " + nisn);
        System.out.println("Alamat : " + alamat);
        
    }
}
