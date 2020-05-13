import java.lang.reflect.Array;

public class ProductOfAllButOne {

    public int[] allButOne(int[] inArray) {

        int[] newArray = new int[inArray.length];
        for (int i = 0; i < inArray.length; i++) {


            int product = inArray[i];
            for (int j = 0; j < inArray.length; j++) {

                if (inArray[j] != inArray[i]) {
                    product *= inArray[j];
                }
            }
            newArray[i] = product / inArray[i];
        }

        return newArray;
    }

    public int[] noDivisionAllButOne(int[] inArray) {

        int[] newArray = new int[inArray.length];
        //make new array
        for (int i = 0; i < inArray.length; i++) {

            int product = 0;
            int shortLength = inArray.length - 1;
            int[] shortArray = new int[shortLength];

            System.out.println(inArray.length);
            for (int j = 0; j < inArray.length; j++) {
                System.out.println("Getting started now...");
                if (inArray[i] != inArray[j] && j != inArray.length) {
                    System.out.println("if...");
                    shortArray[j] = inArray[i];
                } else {
                    shortArray[shortLength] = inArray[i];
                }
            }


            for (int j = 0; j < shortArray.length; j++) {
                product = shortArray[j];
                for (int k = 0; k < shortArray.length; k++) {
                    if (shortArray[k] != shortArray[j]) {
                        product *= shortArray[k];
                    }
                    System.out.println(product);
                }
            }

            newArray[i] = product;
        }
        return newArray;
    }
}
