package programlist3;

/**
 * Created by Dix on 2015/12/2.
 */
public class ArgsDemo {
    public static void main(String[] args) {
        if (args[0].equals("-h")) {
            System.out.print("hello");
        }
        else if (args[0].equals("-g")) {
            System.out.print("Goodbye");
        }
        for (int i=1;i<args.length;i++) {
            System.out.print("" + args[i]);
        }
        System.out.println("!");
    }
}
