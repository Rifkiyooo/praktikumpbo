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
public class Balok {
    private int panjang,lebar,tinggi;
    private int luas;
    
    public int getpanjang(){
          return panjang;
    }
    
    public void setpanjang(int panjang){
          this.panjang = panjang;
    }
    
    public int getlebar(){
          return lebar;
    }
    
    public void setLebar (int lebar){
          this.lebar = lebar;
    }
    
    public int getTinggi(){
          return tinggi;
    }
    
    public void setTinggi (int tinggi){
          this.tinggi = tinggi;
    }
    
    public void hitungvolume(){
        luas = panjang*lebar*tinggi;
        JOptionPane.showMessageDialog(null,"Volume balok tersebut adalah" + luas + " cm3 ");
    }
}
