import java.util.Scanner;

import java.util.Scanner;

public class MavenProgram
{
    public static final int COST_WEIGHT   = 35;
    public static final int COST_DISTANCE = 10;
    public static void main(String... args)
    {
        Scanner scanner = new Scanner(System.in);

        double weight   = scanner.nextDouble();
        int    distance = scanner.nextInt();

        double cost = COST_WEIGHT * weight + COST_DISTANCE *distance;

        System.out.println(cost);

    }
}
