import java.util.Scanner;
import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class fast{
    public static void main(String[] args) {
	     Scanner S= new Scanner(System.in);
	     int N = StdIn.readInt();
	     long[] vals = new long[N];

	     for(int i= 0; i < N; i+= 1) vals[i] = StdIn.readLong();
       /*for (int i = 0; i < 10; i++)
        FoursumSearch(vals);*/
       Stopwatch stopwatch = new Stopwatch();
       StdOut.println(FoursumSearchFast(vals) ? "True": "False");
       StdOut.println("Elapsed time: " + (stopwatch.elapsedTime()));
    }

    public static boolean FoursumSearchFast(long[] input) {
      Arrays.sort(input);
      int n = input.length;
      int count = 0;
      for (int i = 0; i < n; i++)
        for (int j = i+1; j < n; j++)
          for (int k = j+1; k < n; k++)
            if (indexOf(input, -input[i] - input[j] - input[k]) > k)
              return true;
      return false;
    }

    // Modified version of the BinarySearch.indexOf from the algs library
    public static int indexOf(long[] a, long key) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
        // Key is in a[lo..hi] or not present.
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) hi = mid - 1;
        else if (key > a[mid]) lo = mid + 1;
        else return mid;
    }
    return -1;
}
}
