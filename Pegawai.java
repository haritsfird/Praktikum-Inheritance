//Praktikum Inheritance Nomor 2
package PraktikumInheritance;

public class Pegawai {
    public static void main(String[] args) {
        
    }
    public String nama;
    public double gaji;
}
class Manajer extends Pegawai{
    public String departemen;
    
    public void IsiData(String n, String d){
        nama=n;
        departemen=d;
    }
}