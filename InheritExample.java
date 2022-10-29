//Praktikum Inheritance Nomor 7
package PraktikumInheritance;

class Bapak {
    int a = 1;
    int b = 1;
    
    void show_variabel(){
        System.out.println("Nilai a="+ a);
        System.out.println("Nilai b="+ b);
    }
}
class Anak extends Bapak{
    int c;
    void show_variabel(){
        System.out.println("Nilai a="+ super.a);
        System.out.println("Nilai b="+ super.b);
        System.out.println("Nilai c="+ c);
    }
}
public class InheritExample {
    public static void main(String[] args) {
        Bapak objectBapak = new Bapak();
        Anak objectAnak = new Anak();
        
        objectBapak.a=1;
        objectBapak.b=1;
        System.out.println("Object Bapak (Superclass) :");
        
        objectBapak.show_variabel();
        objectAnak.c=5;
        System.out.println("Object Anak (Superclass dari Bapak):");
        objectAnak.show_variabel();
    }
}