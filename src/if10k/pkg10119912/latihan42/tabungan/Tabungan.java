/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan42.tabungan;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class Tabungan {
    private final int saldo;
    
    public Tabungan (int saldo){
        this.saldo = saldo;
        
    }
    public int ambilUang(int jumlah){
        return saldo - jumlah;
    }
}
