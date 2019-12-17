package study.ListToMap;

public class StaticNon {

    static int  i =0;
    
    public void print() {
        System.out.println(i);
        printStatic();
    }
    
    public static void printStatic() {
        System.out.println("Non static");
    }
    
    public static void main(String[] args) {
        StaticNon t = new StaticNon();
        t.print();
    }
}
