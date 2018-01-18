package ht1_27_12_17;

public class Main {
    public static void main(String[] args) {
        /////////////// 1
        System.out.println("1.");
        int n = 6;
        float f = n % 2;
        if (f == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        //////////// 2
        System.out.println("2.");
        double n2 = 13.3d;
        double m2 = 8.7d;
        if (Math.abs(10 - n2) < Math.abs(10 - m2))
            System.out.println(n2);
        else
            System.out.println(m2);
        //////////// 3
        System.out.println("3.");
        for (int i = -10; i<=25; i ++)
        {
            System.out.print(i+ " ");
        }
        System.out.println();
        int i = -10;
        while (i <= 25)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = -10;
        do {
            System.out.print(i + " ");
            i ++;
        }while (i <= 25);
        //////////////// 4
        System.out.println("4.");
        for (int j = 1; j<=100; j ++)
        {
            if (j % 5 == 0) System.out.print(j + " ");
        }
        System.out.println();
        ////////////// 5
        System.out.println("5.");
        int arr[] = {5,4,3,2,1,4,7,8,5,9,5,2,3};
        int min = arr[0];
        int max = arr[0];
        for (int i1 : arr) {
            if (i1 < min)
            {
                min = i1;
            }
            if (i1 > max)
            {
                max = i1;
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        int sum = 0;
        for (int i1 : arr) {
            if (i1 != max || i1 != min) sum = sum + i1;
        }
        System.out.println("Sum = " + sum);
        ///////////// 6
        System.out.println("6.");
        String arr6 = "asdfghjkl";
        String mStr [] = new String [arr6.length()];

        for (int i6 = 0; i6 < mStr.length; i6 ++) {
            mStr[i6] = arr6.substring(i6,i6+1);
        }
        for (String s : mStr) {
            System.out.println(s);
        }
        ///////////////
        short sh [] = new short[100];
        int in = 0;
        for (short ii = 100; ii>0; ii--)
        {
            sh[in] = ii;
            System.out.print(sh[in] + " ");
            in ++;
        }

    }
}
