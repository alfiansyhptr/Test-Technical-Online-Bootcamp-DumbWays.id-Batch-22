import java.util.Scanner;

public class satu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama_barang;
        int jumlah_barang, harga, totalharga;
        int  diskon ;
        int  totalbayar;
        int count = 10000;


        System.out.println("Program Kasir Sederhana");
        System.out.println("_____________________________");
        System.out.println("Masukan Data berikut :");
        System.out.print("Nama Barang =");
        nama_barang = input.nextLine();
        
        System.out.print("Jumlah Barang = ");
        jumlah_barang = input.nextInt();
        harga = jumlah_barang * count;
        System.out.println("Harga = Rp. " +harga);
        System.out.println("Total Bayar = ");
            totalbayar = input.nextInt();

        if(harga <= 50000) {
        
            totalharga = harga;
            System.out.println("Total harga = Rp " +totalharga);
            totalbayar = totalbayar-totalharga;

            System.out.println("_____________________________");
            System.out.println("Nota Belanja :");
            System.out.println("Nama Barang =" +nama_barang);  
            System.out.println("Jumlah Barang =" +harga);
            System.out.println("Total Harga = Rp" +totalharga);
            System.out.println("Total Bayar =Rp" +totalbayar);
            System.out.println("_____________________________");
            
            
        }else if(harga > 50000 && harga <= 80000) {
            diskon = harga * 21 / 100;
                if(diskon <= 20000){

                    System.out.println("Voucher DumWayAsik digunakan");

                    System.out.println("Anda Mendapatkan diskon 21,1%");

                    harga = harga - diskon;
                    totalharga = harga;
                    System.out.println("Total harga = Rp " +totalharga);
                    System.out.println("Discount = Rp " +diskon);
                    totalbayar = totalbayar-totalharga;
                
                    System.out.println("_____________________________");
                    System.out.println("Nota Belanja :");
                    System.out.println("Nama Barang =" +nama_barang);  
                    System.out.println("Jumlah Barang =" +harga);
                    System.out.println("Total Harga = Rp" +totalharga);
                    System.out.println("Discount = Rp " +diskon);
                    System.out.println("Total Bayar =Rp" +totalbayar);
                    System.out.println("_____________________________");
                }
        }else if(harga >= 80000) {
            diskon = harga * 30 / 100;
                if(diskon <= 40000){

                    System.out.println("Voucher DumWayAsik digunakan");

                    System.out.println("Anda Mendapatkan diskon 30%");

                    harga = harga - diskon;
                    totalharga = harga;
                    System.out.println("Total harga = Rp " +totalharga);
                    System.out.println("Discount = Rp " +diskon);
                    totalbayar = totalbayar-totalharga;
                
                    System.out.println("_____________________________");
                    System.out.println("Nota Belanja :");
                    System.out.println("Nama Barang =" +nama_barang);  
                    System.out.println("Jumlah Barang =" +harga);
                    System.out.println("Total Harga = Rp" +totalharga);
                    System.out.println("Discount = Rp " +diskon);
                    System.out.println("Total Bayar =Rp" +totalbayar);
                    System.out.println("_____________________________");
                }
        }
    }
}
