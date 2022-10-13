/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;
import javax.swing.JOptionPane;
/**
 *
 * @author RIDS
 */
public class Luasbangun {
    private int sisi;
    private int p;
    private int l;
    private int luaspersegi;
    private int luaspersegipanjang;
    
    private void luaspersegi(int sisi){
        this.sisi = sisi;
        this.luaspersegi = luaspersegi;
    }
    private void cetakdata (){
        luaspersegi = sisi*sisi;
        JOptionPane.showMessageDialog(null,"Luas Persegi adalah :"+luaspersegi);
    }
    public void luaspersegipanjang(){
        String inputp=JOptionPane.showInputDialog("Masukan nilai Panjang:");
         p=Integer.parseInt(inputp);
         String inputl=JOptionPane.showInputDialog("Masukan nilai Lebar:");
         l=Integer.parseInt(inputl);
         luaspersegipanjang = p*l;
         JOptionPane.showMessageDialog(null,"Luas Balok adalah "+luaspersegipanjang,"Luas Persegi Panjang",JOptionPane.INFORMATION_MESSAGE);
    }
    public void tampilmenu(){
        while(true){
        int pilihmenu =Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan menu yang anda pilih :\n1.Luas Persegi \n2.Luas Persegi Panjang"));
        switch (pilihmenu){
            case 1:
            int inputsisi =Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai sisi :"));
            luaspersegi(inputsisi);
            cetakdata();
            break;
            case 2:
            luaspersegipanjang();
            break;
            default :
            JOptionPane.showMessageDialog(null,"Terima Kasih");
        }
    }
    }
}