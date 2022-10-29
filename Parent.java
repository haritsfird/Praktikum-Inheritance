//Praktikum Inheritance Nomor 8
package inheritanceno8;

public class Parent {

    public static void main(String[] args) {

    }
    String parentName;
    public Parent(){}
    
    public String getParentName(){
        return parentName;
    }
    public Parent(String parentName){
        this.parentName = parentName;
        System.out.println("Konstruktor Parent");
    }
    
}
