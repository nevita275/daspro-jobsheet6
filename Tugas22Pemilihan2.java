import java.util.Scanner;
public class Tugas22Pemilihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;
        int harga = 20000;
        double hargaAkhir;
        double hargaTotalAkhir;
        double totalDiskon;

        System.out.println("Masukkan jenis buku :");
        jenisBuku = sc.nextLine();
        System.out.println("Masukkan jumlah buku");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12; 
            } else {
                diskon = 0.10;
            }     
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = harga * 0.09; 
            } else {
                diskon = harga * 0.08;  
            }  
        } else {
            if (jenisBuku.equalsIgnoreCase("buku lain")) {   
            } else if (jumlahBuku > 3) {
                diskon = harga * 0.10;
            } else {
                diskon = harga * 0;
            }
        }

        totalDiskon = (diskon * jumlahBuku);
        System.out.println("diskon yang didapat : " + totalDiskon);
        hargaTotalAkhir = ((harga - diskon) * jumlahBuku);
        System.out.println("total harga yang harus dibayar :" + hargaTotalAkhir);

    }
    
}
