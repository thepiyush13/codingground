/****************** Exercise 2 *****************

 * Create a class containing a float and use it to 

 * demonstrate aliasing. 

 ***********************************************/
 
 class MyInteger{
     int val=5;
}
public class Aliase{
    public static void main(String[] args){
        
        MyInteger my1 = new MyInteger();
        MyInteger my2 = new MyInteger();
        
        System.out.println("my1:"+my1.val+" my2:"+my2.val);
        
        my2 = my1;
        my1.val = 10;
        
        System.out.println("my1:"+my1.val+" my2:"+my2.val);
        
    }
}
