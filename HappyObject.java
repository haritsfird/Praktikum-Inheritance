//Praktikum Inheritance Nomor 5
package inheritanceno5;

public class HappyObject extends MoodyObject {
    @Override
    protected String getMood(){
        return "Happy";
    }
    @Override
    public void laugh(){
        System.out.println("Hahaha");
    }
    
}
