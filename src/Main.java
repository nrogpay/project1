import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int[] mass = add(20);
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) max = mass[i];
        }
        System.out.println(max);
    }

    public int[] add( int a) {
        a = scanner.nextInt();
        int[] mass = new int[a];
        int n = random.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(n);

        }
        return n;
        return mass;
    }
}
