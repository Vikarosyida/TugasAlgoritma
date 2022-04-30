package Model;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);

        //Tampilkan hasil perhitungan dengan memanggil method yang ada pada Perhitungan.java. Method yang dibuat, menerima parameter dan mengembalikan nilai (Method with return).
        //Dikumpulkan hari Sabtu, 30 April 2022
        //Hasil di email ke aherijanto@mimoapps.xyz berupa github repo masing2 siswa
        //Subject email : TM_NIM_NAMALENGKAP_KELAS

        int hasilTambah = s.HitungTambah(4, 6);
        System.out.println(hasilTambah);

        int hasilKali = s.HitungKali(4, 6);
        System.out.println(hasilKali);

        s.PrintJudul();
    }
}
