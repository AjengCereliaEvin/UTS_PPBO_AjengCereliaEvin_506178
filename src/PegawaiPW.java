public class PegawaiPW extends Pegawai {
    private int jamKerja;
    private double tarifPerJam;

    public PegawaiPW(String nama, double gajiPokok, int jamKerja, double tarifPerJam) {
        super(nama, gajiPokok);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    @Override
    public double getTotalGaji() {
        return jamKerja * tarifPerJam;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJam Kerja: " + jamKerja + " jam" + "\nTarif Per Jam: $" + tarifPerJam + "\nTotal Gaji: $" + getTotalGaji();
    }
}