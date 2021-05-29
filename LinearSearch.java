/* Tugas Algotada Sesi 10 bagian A 
 * M. Yamin
 * Teknik Informatika
 * NIM 20200040077
 */

/**
 *
 * @author Muhamad Yamin
 */
public class LinearSearch {
    
    public static void main(String[] args) {
        int[] angka ={8, 5, 9, 16, 18, 5, 2};
        boolean ditemukan = false;
        int key = 16;
        
        for(int i=0;i<angka.length;i++){
            if(key == angka[i]){
                System.out.println("Data diperoleh pada index ke-" + i);
                ditemukan = true;
                break;
                
            }
        }
        if(ditemukan == false){
            System.out.println("Data tidak ketemu");
        }
    }
    
}
