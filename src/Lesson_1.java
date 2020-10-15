import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Lesson_1 {
    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;
        char f;
        float e;
        double g;
        boolean bol;
        System.out.println("ByteMax = "+ Byte.MAX_VALUE);
        System.out.println("ByteMin = "+ Byte.MIN_VALUE);
        System.out.println("ShortMax = "+Short.MAX_VALUE);
        System.out.println("ShortMin = "+Short.MIN_VALUE);
        System.out.println("IntegerMax = "+Integer.MAX_VALUE);
        System.out.println("IntegerMin = "+Integer.MIN_VALUE);
        System.out.println("LongMax = "+Long.MAX_VALUE);
        System.out.println("LongMin = "+Long.MIN_VALUE);
        System.out.println("CharacterMax = "+Character.MAX_VALUE);
        System.out.println("CharacterMin = "+Character.MIN_VALUE);
        System.out.println("FloatMax = "+Float.MAX_VALUE);
        System.out.println("FloatMin = "+Float.MIN_VALUE);
        System.out.println("DoubleMax = "+Double.MAX_VALUE);
        System.out.println("DoubleMin = "+Double.MIN_VALUE);
        int [] h = new int[]{14,2,9,4,12,33,55,77,12,9};
        int max=0;
        int min=h[0];
        for (int i=0; i<h.length; i++){
            if (h[i]>max) {
                max = h[i];
            }
        }

        System.out.println("Max elem= "+max);
        for (int i=0; i<h.length; i++){
            if (h[i]<min) {
                min = h[i];
            }
        }

        System.out.println("Min elem= "+min);
    }
}
