import java.util.Scanner;
public class Pemilihan2Percobaan322 {

    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan Kategori");
        kategori = input22.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan");
        penghasilan = input22.nextInt();


        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;  
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;   
            } else 
                pajak = 0.2;
                gajiBersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.println("Penghasilan Bersih :" + gajiBersih);  
        } else if (kategori.equals("PEBISNIS")) {
            if (penghasilan == 2000000 ) {
                pajak = 0.15;
            } else if (penghasilan == 2000000) {
                pajak = 0.2;
            } else 
                pajak = 0.25;
                gajiBersih = (int) (penghasilan- (pajak * penghasilan));
                System.out.println("Penghasilan Bersih :" + gajiBersih);    
        } else 
            System.out.println("Masukkan Kategori Salah ");  
    }
    
}
