package lmbdaexpression;

interface Printable{
    public void print(String str);
}

interface Calculation{
    public int calculate(int a, int b);
}



public class LambdaExpressionDemo {

    public static void main(String[] args) {

        Printable obj = str -> System.out.println("Hello world : "+str);
        obj.print("How are you doing?");

        Calculation calc = (a,b)-> a>b?a:b;
        System.out.println(calc.calculate(7,8));

    }

}
