package algorithms;

public class InsertionSort {
    // reminder that a Java array has a property of length but not the method for length() or size()
    // sorting from smallest to largest
    public int[] insertionSort(int[] chars) {
        for (int i = 1; i <= chars.length-1; i++) {
            int data = chars[i]; // second element
            int j = i;
            while (j > 0) { // while j is still in bounds
                if (chars[j - 1] > data) { // if first element > second element
                    chars[j] = chars[j - 1]; // first element now in second position
                    chars[j-1] = data; // second element now in first position
                } else {
                    // do nothing
                }
                j--;

            }

        }
        return chars;
    }

    public void printElements(int[] chars) {
        for (int i : chars) {
            System.out.println(i);
        }
    }

}
