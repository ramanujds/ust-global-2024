
public class SimplePattern1 {

    public static void main(String[] args) {

         int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j<=i; j++){
                int value = i%2 == j%2 ? 1: 0;
                value = i%2 != j%2 ? 0:1;

                System.out.print(value+"  ");
              
        }
        System.out.println();
    }



    }

}



// if(i%2==0){
//     if(j%2 == 0)
//         System.out.print(1);
//     else 
//      System.out.print(0);
// }
// else{
//     if(j%2 == 0)
//         System.out.print(0);
//     else 
//      System.out.print(1);
// }
// System.out.print("  ");
// }
// System.out.println();