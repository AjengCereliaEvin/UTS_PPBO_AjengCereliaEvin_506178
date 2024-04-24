//// Superclass Pegawai
//class Pegawai {
//    private String nama;
//    private double gajiPokok;
//
//    public Pegawai(String nama, double gajiPokok) {
//        this.nama = nama;
//        this.gajiPokok = gajiPokok;
//    }
//
//    public String getNama() {
//        return nama;
//    }
//
//    public double getGajiPokok() {
//        return gajiPokok;
//    }
//
//    // Method untuk menghitung bonus (hanya untuk Pegawai1 dan Pegawai2)
//    protected double getBonus() {
//        return 0.04 * gajiPokok;
//    }
//
//    // Method untuk menghitung total gaji (diimplementasikan di subclass)
//    public double getTotalGaji() {
//        return 0.0;
//    }
//
//    // Method toString untuk mencetak informasi pegawai
//    @Override
//    public String toString() {
//        return "Nama: " + nama + "\nGaji Pokok: $" + gajiPokok;
//    }
//}
//
//// Subclass Pegawai1 (Pegawai Tetap)
//class Pegawai1 extends Pegawai {
//    private double tunjangan;
//    private double asuransiKesehatan;
//
//    public Pegawai1(String nama, double gajiPokok, double tunjangan) {
//        super(nama, gajiPokok);
//        this.tunjangan = tunjangan;
//        this.asuransiKesehatan = 30.0; // Asuransi Kesehatan Full
//    }
//
//    @Override
//    protected double getBonus() {
//        return super.getBonus() + (0.04 * tunjangan);
//    }
//
//    @Override
//    public double getTotalGaji() {
//        return gajiPokok + tunjangan + getBonus() - asuransiKesehatan;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "\nTunjangan: $" + tunjangan + "\nAsuransi Kesehatan: $" + asuransiKesehatan + "\nTotal Gaji: $" + getTotalGaji();
//    }
//}
//
//// Subclass Pegawai2 (Pegawai Tidak Tetap)
//class Pegawai2 extends Pegawai {
//    private double asuransiKesehatan;
//
//    public Pegawai2(String nama, double gajiPokok) {
//        super(nama, gajiPokok);
//        this.asuransiKesehatan = Math.min(0.1 * getTotalGaji(), 30.0); // Asuransi Kesehatan Maksimal 30 Dollar
//    }
//
//    @Override
//    public double getTotalGaji() {
//        return gajiPokok + getBonus() - asuransiKesehatan;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "\nAsuransi Kesehatan: $" + asuransiKesehatan + "\nTotal Gaji: $" + getTotalGaji();
//    }
//}
//
//// Subclass PegawaiPW (Pegawai Paruh Waktu)
//class PegawaiPW extends Pegawai {
//    private int jamKerja;
//    private double tarifPerJam;
//
//    public PegawaiPW(String nama, double gajiPokok, int jamKerja, double tarifPerJam) {
//        super(nama, gajiPokok);
//        this.jamKerja = jamKerja;
//        this.tarifPerJam = tarifPerJam;
//    }
//
//    @Override
//    public double getTotalGaji() {
//        return jamKerja * tarifPerJam;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "\nJam Kerja: " + jamKerja + " jam" + "\nTarif Per Jam: $" + tarifPerJam + "\nTotal Gaji: $" + getTotalGaji();
//    }
//}
//
//// Contoh Penggunaan
//public class Main {
//    public static void main(String[] args) {
//        Pegawai1 pegawai1 = new Pegawai1("Budi", 550.0, 100.0);
//        Pegawai2 pegawai2 = new Pegawai2("Ani", 550.0);
//        PegawaiPW pegawaiPW = new PegawaiPW("Cici", 550.0, 20, 25.0);
//
//        System.out.println(pegawai1);
//        System.out.println("\n" + pegawai2);
//        System.out.println("\n" + pegawaiPW);
//    }
//}
//// Main Class
//public class Main {
//    public static void main(String[] args) {
//        // Buat objek Pegawai
//        Pegawai1 manager = new Pegawai1("Budi", 550.0, 20.0); // Pegawai Tetap - Manager
//        Pegawai2 staffIT = new Pegawai2("Ani", 550.0); // Pegawai Tidak Tetap - Staff IT
//        PegawaiPW sekretaris = new PegawaiPW("Cici", 550.0, 60, 10.0); // Pegawai Paruh Waktu - Sekretaris
//
//        // Cetak informasi setiap pegawai
//        System.out.println("**Data Pegawai:**");
//        System.out.println(manager);
//        System.out.println("\n" + staffIT);
//        System.out.println("\n" + sekretaris);
//
//        // Bandingkan take home pay
//        double takeHomePayManager = manager.getTotalGaji();
//        double takeHomePayStaffIT = staffIT.getTotalGaji();
//        double takeHomePaySekretaris = sekretaris.getTotalGaji();
//
//        double takeHomePayTertinggi = Math.max(Math.max(takeHomePayManager, takeHomePayStaffIT), takeHomePaySekretaris);
//
//        // Temukan pegawai dengan take home pay tertinggi
//        String namaPegawaiTertinggi = "";
//        if (takeHomePayTertinggi == takeHomePayManager) {
//            namaPegawaiTertinggi = manager.getNama();
//        } else if (takeHomePayTertinggi == takeHomePayStaffIT) {
//            namaPegawaiTertinggi = staffIT.getNama();
//        } else {
//            namaPegawaiTertinggi = sekretaris.getNama();
//        }
//
//        // Tampilkan informasi pegawai dengan take home pay tertinggi
//        System.out.println("\n**Pegawai dengan Take Home Pay Tertinggi:**");
//        System.out.println(namaPegawaiTertinggi + " dengan take home pay: $" + takeHomePayTertinggi);
//    }
//}
