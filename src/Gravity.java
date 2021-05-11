import java.util.Scanner;

public class Gravity {
    public double falling(double time, double v) {
        return v*time + 0.5*9.8*time*time;
        //return 1.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Time: ");
        double t = sc.nextDouble();
        System.out.print("Initial velocity: ");
        double v0 = sc.nextDouble();
        System.out.println("Meters dropped = " + new Gravity().falling(t, v0));
    }
}
