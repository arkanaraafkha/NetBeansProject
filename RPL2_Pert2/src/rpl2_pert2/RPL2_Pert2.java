package rpl2_pert2;

public class RPL2_Pert2 {

    public static void main(String[] args) {
       Mahasiswa mahasiswa = new Mahasiswa();
       
       mahasiswa.setName("Toyoy Kanahh");
       mahasiswa.setNpm("FB Service");
       mahasiswa.setClassNumber("Cityloog");
       mahasiswa.setBirthYear(2004);
       mahasiswa.setAlamat("Jl. Pengadegan");
       
       System.out.println(mahasiswa.toString());
    }
    
}
