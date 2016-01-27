package programlist3;

import static java.lang.Math.*;

/**
 * Created by Dix on 2015/12/10.
 *保存的内容不知道
 */
public class Constants2 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters : " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        int m = 7;
        int n = 7;
        int i = 2 * m++;
        int j = 2 * ++n;
        System.out.println("m;" + m);
        System.out.println("n;" + n);
        System.out.println("j;" + j);
        System.out.println("i;" + i);

        double x = 4;
        double y = sqrt(x);
        System.out.println("y: " + y);

        double y2 = pow(x, 3);
        System.out.println("y2: " + y2);

        double y3 = PI;
        System.out.println("y3: " + y3);

        double y4 = E;
        System.out.println("y4: " + y4);

        int n1=123456789;
        float f1=n1;
        System.out.println("f1: "+f1);




    }
}
