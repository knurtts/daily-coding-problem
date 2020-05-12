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

        int shortLength = inArray.length - 1;
        int[] shortArray = new int[shortLength];
        int[] newArray = new int[inArray.length];

        for (int x = 0; x < inArray.length; x++) {

            // Set short Array to remove unwanted integer
            for (int y = 0; y < inArray.length; y++) {

                if (inArray[y] != inArray[x]) {
                    shortArray[x] = inArray[y];
                }
            }

            //Set integer[x] for new array
            int product = shortArray[x];

            for (int i = 0; i < shortLength; i++) {

                for (int j = 0; j < shortLength; j++) {

                    if (shortArray[i] != shortArray[j]) {
                        product *= shortArray[j];
                    }
                }

            }

        }



        return newArray;
    }
}
