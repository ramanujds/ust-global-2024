package stackandqueue;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("The History of India"); //First
        books.push("Java Programming");
        books.push("Origin of Species");
        books.push("DS and Algorithm");     //Last

        while(!books.isEmpty()){
            System.out.println(books.pop());
        }



    }

}
