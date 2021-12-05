import java.util.Arrays;
public class TestBasicJava {
    public static void main(String[] args) {
        BasicJava tester = new BasicJava();
            System.out.println(Arrays.toString(tester.arrayOfAll(0)));
            System.out.println(Arrays.toString(tester.arrayOfOdd(0)));
            System.out.println(tester.sumFinder(0));

            int[] x = {1, 3, 5, 7, 9, 13};
            System.out.println(tester.iteratingThrough(x));
            tester.theMax();
            tester.arraySix();
    }
}

