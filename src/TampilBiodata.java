import java.util. Scanner;
public class TampilBiodata{

    /** menjalankan kodingan
     * @param args
     */
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String nama,ttl, alamat;
        int tahunlahir,tahunsekarang;

        System.out.println("===========================");
        System.out.println("Created By TechTutors.my.id");
        System.out.println("===========================");
        System.out.print("Nama        : ");
        nama = input.nextLine();
        System.out.print("TTL         : ");
        ttl = input.nextLine();
        System.out.print("Alamat      : ");
        alamat = input.nextLine();
        System.out.print("Tahun Lahir : ");
        tahunlahir = input.nextInt();
        System.out.print("Tahun Sekarang : ");
        tahunsekarang = input.nextInt();
        System.out.println("=============================");
        System.out.println("========== BIODATA ==========");
        System.out.println("=============================");
        System.out.println("Nama       : " + nama);
        System.out.println("TTL        : " + ttl);
        System.out.println("Alamat     : " + alamat);
        System.out.println("Umur       : " + (tahunsekarang-tahunlahir));
    }
}
