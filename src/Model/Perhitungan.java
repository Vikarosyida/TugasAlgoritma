package Model;

public class Perhitungan implements ContohInterface  {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a, int _b, int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.setHasil(_hasil);
        printJudulClass("Print judul dalam Class Perhitungan ");
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        System.out.println("Judul Dalam Interface");
    }

    @Override
    public void HitungTambah() {
        this.setHasil(this.a + this.b);
    }

    @Override
    public void HitungKali() {
        this.setHasil(this.a * this.b);
    }

    //Method Return Hasil Tambah dengan Parameter
    public int HitungTambah(int angka1,int angka2){
        this.a = angka1;
        this.b = angka2;
        HitungTambah();
        return this.hasil;
    }

    //Method Return Hasil Kali dengan Parameter
    public int HitungKali(int angka3, int angka4){
        this.a = angka3;
        this.b = angka4;
        HitungKali();
        return this.hasil;
    }
}

