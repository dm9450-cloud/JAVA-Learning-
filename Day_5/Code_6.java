package Day_5;

public class Code_6 {
    public static void main(String[] args) {
        int a,b,c;
        a = b = c = 2;
        a += b;      //a = 4
        b -= c;     // b = 0
        c *= a+b;   // c = 8 
        System.out.println(a + " " + b + " " + c);    // 
    }
}
