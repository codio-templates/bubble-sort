{Check It!|assessment}(test-2914594016)


|||guidance
The example solution is:

```
public class Bubble {  
  public static void main(String[] args) {
    
    final int[] data = new int[args.length];
    for (int i=0; i < args.length; i++) {
        data[i] = Integer.parseInt(args[i]);
    }
    
    // read into `data` from args and sort
    sort(data);
    
    for(int i=0; i < data.length; i++) {
      System.out.print(data[i] + " ");          
    }    
  }
  
  private static void sort(int[] data) {               
    int n = data.length;

    for(int i=0; i < n; i++) {
      for(int j=1; j < (n-i); j++) {
        if(data[j-1] > data[j]) {
          int temp = data[j-1];
          data[j-1] = data[j];
          data[j] = temp;
        }
      }
    }
  }
}

```

|||