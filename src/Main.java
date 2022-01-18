import java.util.Random;
import java.util.Scanner;

public class Main {
    Random random = new Random();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int[] mass = add(20);
        int max = mass[0];
        int i = 1;
        while (i < mass.length) {
            if (mass[i] > max) max = mass[i];
            i++;
        }
        System.out.println(max);
    }

    public int[] add( int n) {
        int[] mass = new int[n];
         for (int i = 0; i < n; i++) {
           mass[i] = random.nextInt(100);

        }
        return mass;
    }
}
