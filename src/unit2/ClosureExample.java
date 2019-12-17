package unit2;

public class ClosureExample {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        
        doProcess(a,new Process() {
            
            @Override
            public void process(int i) {
                final int b=40;
                System.out.println(i+b);
                // TODO Auto-generated method stub
                
            }
        });
    }// end of main
    
    public static void doProcess(int  i, Process p) {
        p.process(i);
    }
}//end of class 



interface Process{
void process(int i);    
}