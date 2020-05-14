
public class FirstMissingPositive {

    public int firstMissingPositive(int[] inArray) {

        java.util.Arrays.sort(inArray);
        int largestNumber = 0;
        int missingNumber = 0;

        for (int i = 0; i < inArray.length; i++) {

            if (inArray[i] > 0 && inArray[i] == largestNumber +1) {
                largestNumber = inArray[i];
            } else if (inArray[i] > 0) {
                missingNumber = largestNumber + 1;
                break;
            }
        }
        return missingNumber;
    }
}
