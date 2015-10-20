class StaticOnly {
    private static  int val = 5;
    
    public void printVal(){
        System.out.println(this.val);
    }
    
    public static void main(String args[]){
        StaticOnly s1   = new StaticOnly();
        s1.val = 10;
        s1.printVal();
        StaticOnly s2   = new StaticOnly();
        //s2.val = 10;
        s2.printVal();
        StaticOnly s3   = new StaticOnly();
        //s3.val = 10;
        s3.printVal();
        
        
    }
}