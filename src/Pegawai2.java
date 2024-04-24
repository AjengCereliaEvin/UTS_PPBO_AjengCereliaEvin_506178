public class Pegawai2 extends Pegawai {
    private double asuransiKesehatan;

    public Pegawai2(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.asuransiKesehatan = Math.min(0.1 * getTotalGaji(), 30.0); // Asuransi Kesehatan Maksimal 30 Dollar
    }

    @Override
    public double getTotalGaji() {
        return getGajiPokok() + getBonus() - asuransiKesehatan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAsuransi Kesehatan: $" + asuransiKesehatan + "\nTotal Gaji: $" + getTotalGaji();
    }
}