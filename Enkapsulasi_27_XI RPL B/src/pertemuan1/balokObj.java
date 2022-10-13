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
public class balokObj {
    public static void main(String [] args){
    Balok b1 = new Balok();
    b1.setpanjang(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang balok")));
    b1.setLebar(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar balok")));
    b1.setTinggi(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi balok")));
    b1.hitungvolume();
    }
}
