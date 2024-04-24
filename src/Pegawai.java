public class Pegawai {
    private String nama;
    private double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    protected double getBonus() {
        return 0.04 * gajiPokok;
    }

    public double getTotalGaji() {
        return 0.0;
    }


    @Override
    public String toString() {
        return "Nama: " + nama + "\nGaji Pokok: $" + gajiPokok;
    }
}