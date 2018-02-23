import java.util.Scanner;
import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Simple{
    public static void main(String[] args) {
	     Scanner S= new Scanner(System.in);
	     int N = StdIn.readInt();
	     long[] vals = new long[N];

	     for(int i= 0; i < N; i+= 1) vals[i] = StdIn.readLong();
       /*for (int i = 0; i < 10; i++)
        FoursumSearch(vals);*/
       Stopwatch stopwatch = new Stopwatch();
       StdOut.println(FoursumSearch(vals) ? "True": "False");
       StdOut.println("Elapsed time: " + (stopwatch.elapsedTime()));
    }

    public static boolean FoursumSearch(long[] input) {
      for (int i = 0; i < input.length; i++)
        for (int j = i + 1; j < input.length; j++)
          for (int o = j + 1; o < input.length; o++)
            for (int k = o + 1; k < input.length; k++)
              if (input[i] + input[j] + input[o] + input[k] == 0)
                return true;

      //If there are no foursums.
      return false;
    }
}
