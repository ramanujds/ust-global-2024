package demos;

@FunctionalInterface
interface Printer{
    public void print(String str);
}

interface Calculator{
    public int add(int a, int b);
}


public class LambdaExpressionDemo {
    public static void main(String[] args) {

        Printer printer = str -> System.out.println("Printing "+str);

        Calculator calc = (a,b)-> a+b;

        int sum = calc.add(10,20);

        printer.print(sum+"");

    }

}
