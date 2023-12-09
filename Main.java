public class Main {

    public static void main(String[] args) {
        System.out.println(Calculator.sum(15, 3.2));
        System.out.println(Calculator.divide(10, 3.1));
        System.out.println(Calculator.multiply(2.5, 3.0));
        System.out.println(Calculator.subtract(8.2f, 3));


        Integer[] array1 = new Integer[] {1, 2, 3, 4, 5};
        Integer[] array2 = new Integer[] {1, 2, 3, 4};
        String[] array3 = new String[] {"1", "2", "3", "2", "5"};
        Integer[] array4 = new Integer[] {1, 2, 3, 4, 6};
        Float[] array5 = new Float[] {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};

        System.out.println(CompareArrays.compareArrays(array1, array2));


        Pair<String, Integer> pair = new Pair<>("two", 2);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
