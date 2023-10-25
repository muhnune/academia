import java.util.Scanner;

//ini test commit dari vscodes
// Kelas Parents (Superclass)
class ProdukElektronik {
    String merek;
    int tahunProduksi;

    public ProdukElektronik(String merek, int tahunProduksi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    public void info() {
        System.out.println("Merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}

// Kelas Child (Subclass)
class Laptop extends ProdukElektronik {
    String tipe;

    public Laptop(String merek, int tahunProduksi, String tipe) {
        super(merek, tahunProduksi);
        this.tipe = tipe;
    }

    public void info() {
        super.info(); // Memanggil metode info() dari kelas induk
        System.out.println("Tipe: " + tipe);
    }
}

// Kelas Main (Kelas Utama)
public class tipelaptop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Merek Produk Elektronik: ");
        String merek = input.nextLine();

        System.out.print("Masukkan Tahun Produksi Produk Elektronik: ");
        int tahunProduksi = input.nextInt();

        input.nextLine(); // Membersihkan newline

        System.out.print("Masukkan Tipe Laptop: ");
        String tipe = input.nextLine();

        // Membuat objek Laptop berdasarkan input pengguna
        Laptop laptop = new Laptop(merek, tahunProduksi, tipe);

        // Memanggil metode info() dari kelas Laptop
        laptop.info();

        input.close();

        // gusbram suka warnet
    }
}
