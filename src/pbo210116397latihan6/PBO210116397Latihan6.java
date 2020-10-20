/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Kambing Static & konstanta
 */
package pbo210116397latihan6;

import static pbo210116397latihan6.PBO210116397Latihan6.KambingStatic.NAMA_KAMBING;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan6 {

   public static int jumlahKambing;
   
public class KambingStatic {
    
     public static final String NAMA_KAMBING = "MIDUN";
}
    public static void main(String[] args) {
         PBO210116397Latihan6.jumlahKambing = 485000;
       System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " +
               PBO210116397Latihan6.jumlahKambing);
    }
    
}
