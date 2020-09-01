package my_solution;

public class Main {
    public static void main(String[] args) {
        SemiextendedArray test = new SemiextendedArray(12);

        System.out.println("Current size: " + test.size());
        test.setValue(-1, 40);
        test.add(809);
        test.add(-11);
        System.out.println("Current size: " + test.size());
        test.print();


    }
}
