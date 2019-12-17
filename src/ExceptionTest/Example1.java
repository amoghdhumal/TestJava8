package ExceptionTest;

public class Example1 {

    public static void main(String[] args) {
        System.out.println("Test");
        int a = 10;
        int b= 0;
        int c =b/a;
        System.out.println(c);
        String str = "Test.xlsx";
        System.out.println(str.lastIndexOf  ("."));
        
        String ext = str.substring(str.indexOf("."));
        System.out.println(ext);
                
    }
}
