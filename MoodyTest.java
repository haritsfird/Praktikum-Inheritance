//Praktikum Inheritance Nomor 5
package inheritanceno5;

public class MoodyTest {
    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        m.speak();
        
        m = new HappyObject();
        m.speak();
        m.laugh();
        
        m = new SadObject();
        m.speak();
        m.cry();
    }
    
}
