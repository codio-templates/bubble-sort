public class Bubble {  
    public static void main(String[] args) {
      final int[] ints = new int[args.length];
      for (int i=0; i < args.length; i++) {
        ints[i] = Integer.parseInt(args[i]);
      }
      // read into `intArray` from args and sort
      
      bubble_srt(ints);

    }
  
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
        }
        printNumbers(array);
    }
 
    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}