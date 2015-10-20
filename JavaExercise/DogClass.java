/****************** Exercise 5 ***************** 

 * Create a class called Dog with two Strings: 

 * name and says. In main(), create two dogs, 

 * "spot" who says, "Ruff!", and "scruffy" who 

 * says, "Wurf!". Then display their names and 

 * what they say. 

 ***********************************************/

public class DogClass{
    String name;
    String says;
    public DogClass(String name, String says){
        this.name = name;
        this.says = says;
    }
    
    public static void main(String[] args){
        DogClass d1 = new DogClass("spot","Ruff!");
        DogClass d2 = new DogClass("scruffy","Wurf!");
        
        System.out.println(d1.name+" says "+d1.says);
        System.out.println(d2.name+" says "+d2.says);
        
        //object aliasing produces identical object(property and reference)
        DogClass d3 = d1;
        String val1 = (d1==d3) ? "== is true" : "== is false";
        String val2 = (d1.equals(d3)) ? "equals is true" : "equals is false";
        System.out.println(val1);
        System.out.println(val2);
        
        //object properties produces non identical object(property but not reference)
        DogClass d4 =  new DogClass("spot","Ruff!");
        String val3 = (d1.name==d4.name) ? "== is true" : "== is false";
        String val4 = (d1.name.equals(d4.name)) ? "equals is true" : "equals is false";
        System.out.println(val3);
        System.out.println(val4);
    }
    
}