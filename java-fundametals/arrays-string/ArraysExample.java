public class ArraysExample {
    

    public static void main(String[] args) {
        
        // data-type[] array-name = new data-type[size];

        // int[] numbers = new int[10];

        // String[] trainees = new String[5];

        // trainees[0]= "Clarke";
        // trainees[1]= "Usha";
        // trainees[2]= "Nikhil";
        // trainees[3]= "Keerthi";
        // trainees[4]= "Shankar";

        // String[] trainees = {"Clarke","Usha","Nikhil","Keerthi","Shankar"};

         String[] trainees = new String[]{"Clarke","Usha","Nikhil","Keerthi","Shankar"};

   //   Following is invalid
   //     String[] trainees = new String[5]{"Clarke","Usha","Nikhil","Keerthi","Shankar"};

        // for(int index=0; index < trainees.length; index++){
        //     System.out.println(trainees[index]);
        // }

        for(String name : trainees){
            System.out.println(name);
        }






    }

}
