public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(30);
        ob.test(50,80);
        result = ob.test(123.442);
        System.out.println("Результат вызова ob.test: " + result);
    }
}
