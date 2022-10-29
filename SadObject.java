//Praktikum Inheritance Nomor 5
package inheritanceno5;

public class SadObject extends MoodyObject{
    @Override
    protected String getMood(){
        return "sad";
    }
    @Override
    public void cry(){
        System.out.println("Hoo Hoo");
    }
    
}
