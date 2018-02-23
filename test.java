import edu.princeton.cs.algs4.*;

public class test{
    public static void main(String[] args) {
      methodMan("A", (1 + 2.236)/2);
      methodMan("B", 1 + 2 + 3 + 4.0);
      methodMan("C", 4.1 >= 4);
      methodMan("D", 1 + 2 + "3");
    }

    public static void methodMan(String q, Object obj) {
      StdOut.println(q + ") Value is: " + obj + " and the type is " + obj.getClass().getName());
    }
}
