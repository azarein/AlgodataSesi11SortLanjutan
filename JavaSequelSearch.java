/*
 * Nama M.Yamin
 * Teknik Informatika 20E
 * NIM 20200040077
 */
package javasequelsearch;
import java.util.Scanner;
/**
 *
 * @author Muhamad Yamin
 */
public class JavaSequelSearch {
 int Nim;
 String Nama;
 String Alamat;
 public JavaSequelSearch(int Nim, String Nama, String Alamat){
  this.Nim = Nim;
  this.Nama = Nama;
  this.Alamat = Alamat;
 } 
 public int getNIM(){
  return Nim;   
 }
 public String getName(){
  return Nama;   
 }
 public String getAddress(){
  return Alamat;
 }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String cari;
        JavaSequelSearch[] Data = new JavaSequelSearch[6];
        System.out.println("NIM\tNAMA\t\t ALAMAT");
        Data[0]=new JavaSequelSearch(1102021, "Andri Hariadi", "  Bandung");
        Data[1]=new JavaSequelSearch(1102022, "Dewi Lestari",  "   Surabaya");
        Data[2]=new JavaSequelSearch(1102023, "Dewi Agustin",  "   Malang");
        Data[3]=new JavaSequelSearch(1102024, "Reni Indrayanti", "Malang");
        Data[4]=new JavaSequelSearch(1102025, "Toni Sukmawan", "  Surabaya");
        Data[5]=new JavaSequelSearch(1102026, "Toni Gunawan",  "   Bandung");
        boolean ketemu=false;           
        //Tampildata
        int i,j;
        for (i=0; i<Data.length; i++){
            System.out.println(Data[i].getNIM()+" "+Data[i].getName()+" "+Data[i].getAddress());
        }
        System.out.println("");
        //Pencarian berdasarkan Nama
        System.out.println("Cari Berdasarkan Nama :");
        cari=scan.next();
        for(i=0; i<Data.length; i++){
            String splitnama[]=Data[i].getName().split(" ");
            for (j=0; j<splitnama.length; j++){

            if(cari.equalsIgnoreCase(splitnama[j])){
               System.out.println("\nDATA DITEMUKAN !");
               for (int c=5; c<Data.length; c++){//perulangan untuk menampilkan data duplikat
               System.out.println("NIM : "+Data[i].getNIM()+"\nNama : "+Data[i].getName()+"\nAlamat :"+Data[i].getAddress());
               ketemu=true;
               System.out.println("\nNama '"+cari+"' Ditemukan di Indeks Ke: "+(i)+"\nPosisi Nomor Ke: "+(i+1)); 
               System.out.println("==========================================================================");
               }
               
               
            }
            
        }
        }
        
        if(!ketemu){
            System.out.println("NAMA '"+cari+"' TIDAK DITEMUKAN!");
        }
    }
}