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
}
