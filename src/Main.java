public class Main {
    public static void main(String[] args) {
        // Objek Pegawai
        Pegawai1 manager = new Pegawai1("Anton", 550.0, 20.0); // Pegawai Tetap - Manager
        Pegawai2 staffIT = new Pegawai2("Ali", 550.0); // Pegawai Tidak Tetap - Staff IT
        PegawaiPW sekretaris = new PegawaiPW("Sinta", 550.0, 60, 10.0); // Pegawai Paruh Waktu - Sekretaris

        // Informasi setiap pegawai
        System.out.println("**Data Pegawai:**");
        System.out.println(manager);
        System.out.println("\n" + staffIT);
        System.out.println("\n" + sekretaris);

        // Bandingkan take home pay
        double takeHomePayManager = manager.getTotalGaji();
        double takeHomePayStaffIT = staffIT.getTotalGaji();
        double takeHomePaySekretaris = sekretaris.getTotalGaji();

        double takeHomePayTertinggi = Math.max(Math.max(takeHomePayManager, takeHomePayStaffIT), takeHomePaySekretaris);

        // Pegawai dengan take home pay tertinggi
        String namaPegawaiTertinggi = "";
        if (takeHomePayTertinggi == takeHomePayManager) {
            namaPegawaiTertinggi = manager.getNama();
        } else if (takeHomePayTertinggi == takeHomePayStaffIT) {
            namaPegawaiTertinggi = staffIT.getNama();
        } else {
            namaPegawaiTertinggi = sekretaris.getNama();
        }

        // Pegawai dengan take home pay tertinggi
        System.out.println("\n**Pegawai dengan Take Home Pay Tertinggi:**");
        System.out.println(namaPegawaiTertinggi + " dengan take home pay: $" + takeHomePayTertinggi);
    }
}
