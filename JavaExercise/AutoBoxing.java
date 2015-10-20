
/****************** Exercise 9 ****************** 

 * Write a program to demonstrate that 

 * autoboxing works for all the primitive types 

 * and their wrappers. 

 ************************************************/
public class AutoBoxing{
    public static void main(String[] args){
        int a = 10;
        Integer aa = a;
        
        char c = 'x';
        Character ac = c;
        
        System.out.println("a:"+a+" aa:"+aa);
        System.out.println("c:"+c+" ac:"+ac);
    }
}