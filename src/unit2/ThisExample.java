package unit2;

public class ThisExample {

    public static void main(String[] args) {
        ThisExample thisExample = new ThisExample();
        
        thisExample.doProcess(10, i->{
            System.out.println("Your value is"+i);
        //    System.out.println(this);
            
        });
       /*     
            @Override
            public void process(int i) {
                // TODO Auto-generated method stub
                System.out.println("value of i"+i);
                System.out.println(this);
                
            }
            
            
            public String toString() {
                return "This is a reference vriable";
            }*/
        }

    
    public static void doProcess(int  i, Process p) {
        p.process(i);
    }
}//end of class 



