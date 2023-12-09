public class Calculator {
    public static <F extends Number, S extends Number> double sum(F first, S second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static <F extends Number, S extends Number> double multiply(F first, S second) {
        return first.doubleValue() * second.doubleValue();
    }

    public static <F extends Number, S extends Number> double divide(F first, S second) {
        return first.doubleValue() / second.doubleValue();
    }

    public static <F extends Number, S extends Number> double subtract(F first, S second) {
        return first.doubleValue() - second.doubleValue();
    }
}
