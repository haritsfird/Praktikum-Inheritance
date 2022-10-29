//Praktikum Inheritance Nomor 8
package inheritanceno8;

public class Baby extends Parent{
    String babyName;
    
    Baby(String babyName){
     super();
     this.babyName = babyName;
        System.out.println("Konstruktor baby");
        System.out.println(babyName);
    }
    public void cry(){
        System.out.println("owek owek");
    }
}