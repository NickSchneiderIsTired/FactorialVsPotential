/**
 * Created by Nick on 18.10.2018.
 */
public class Main {

    int x;

    public Main(int x) {
        this.x = x;
        loop();
    }

    private long fakultaet(long n) {
        long a = 1;
        for(long i = n; i > 0; i--) {
            a *= i;
        }
        System.out.println(a);
        return a;
    }

    private void loop() {
        double a = 1, b = 1;
        long n = 0;
        double m = 0;
        while(a <= b) {
            n+=1;
            m += 1;
            a = fakultaet(n);
            b = Math.pow(x, m);
        }
        System.out.println(n);
    }


    public static void main(String[] args) {
        Main m = new Main(9);
    }
}
