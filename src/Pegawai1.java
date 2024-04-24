public class Pegawai1 extends Pegawai {
    private double tunjangan;
    private double asuransiKesehatan;

    public Pegawai1(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
        this.asuransiKesehatan = 30.0;
    }

    @Override
    protected double getBonus() {
        return super.getBonus() + (0.04 * tunjangan);
    }

    @Override
    public double getTotalGaji() {
        return getGajiPokok() + tunjangan + getBonus() - asuransiKesehatan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTunjangan: $" + tunjangan + "\nAsuransi Kesehatan: $" + asuransiKesehatan + "\nTotal Gaji: $" + getTotalGaji();
    }
}

