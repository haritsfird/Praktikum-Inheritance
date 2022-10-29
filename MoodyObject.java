//Praktikum Inheritance Nomor 5
package inheritanceno5;

public class MoodyObject {
    public static void main(String[] args) {
        
    }
    protected String getMood(){
        return "moody";
    }
    public void speak(){
        System.out.println("I am : "+getMood());
    }
    public void laugh(){
        System.out.println("Hahaha : "+getMood());
    }
    public void cry(){
        System.out.println("Hoo Hoo : "+getMood());
    }
}
