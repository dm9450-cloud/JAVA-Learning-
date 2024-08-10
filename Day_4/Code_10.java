package Day_4;

public class Code_10 {
    public static void main(String[] args) {
        // int + long + char == long
        // int + long + char + float == float
        //int + long + float + char + double == double

        int a = 10;
        long b = 20L;
        float c = 30.56f;
        double d = 40.48;
        System.out.println(a+b+c+d);
        

        // long ans = a+b+c+d;
        double ans = a+b+c+d;
        System.out.println(ans);
    }
}
