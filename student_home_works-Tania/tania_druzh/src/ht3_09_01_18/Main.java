package ht3_09_01_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean fl = true;
        while (fl){
            System.out.println("Select task number:");
            System.out.println("1. Multiplication table");
            System.out.println("2. Plus 10 %");
            System.out.println("3. Triangle");
            System.out.println("4. Get some tank");
            System.out.println("5. Get some cat");
            System.out.println("0. Exit");
            Scanner in = new Scanner(System.in);
            int ans = in.nextInt();
            switch (ans){
                case 1:{
                    multTable();
                    break;
                }
                case 2:{
                    plus10pers();
                    break;
                }
                case 3: {
                    triangle();
                    break;
                }
                case 4:{
                    getSomeTank();
                    break;
                }
                case 5:{
                    getSomeCat();
                    break;
                }
                case 0:{
                    fl = false;
                    System.out.println("Goodbye :)");
                    break;
                }
            }
        }


    }

    public static void multTable()
    {
        System.out.println("multiplication table");
        for (int i = 1; i < 10; i ++)
        {
            for (int j = 1; j < 10; j ++)
            {
                System.out.print((i * j) + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("reverse multiplication table");

        for (int i = 9; i > 0; i--)
        {
            for (int j = 9; j > 0; j--)
            {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void plus10pers()
    {
        System.out.println("Enter your number:");
        Scanner in = new Scanner(System.in);
        float f = in.nextFloat();
        retPlus10Her(f);
    }

    public static void retPlus10Her(float f)
    {
        f = f + f / 100 * 10;
        System.out.print("Your result is ");
        System.out.println(f);
    }

    public static void triangle()
    {
        for (int i = 1; i < 10; i ++){
            for (int j = 1; j < i; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void getSomeTank(){
        Tank t34 = new Tank();
        t34.setModel("T34");
        t34.setWeight(30000);
        t34.setYearOfIssue(1945);
        System.out.println("We have some " + t34.getModel() + " tank.");
        System.out.println("It was produced in " + t34.getYearOfIssue() + " year.");
        System.out.println("Our tanks weight is " + t34.getWeight()  + " kg.");
    }

    public static void getSomeCat(){
        Cat cat1 = new Cat();
        cat1.setForse(cat1.getWeight(),cat1.getGrowth(),cat1.getLength());
        System.out.println("We have a cat. It's name is " + cat1.getName() + ".");
        System.out.println("It's " + cat1.getColor() + ".");
        System.out.println("It's weight is " + cat1.getWeight() + "m.");
        System.out.println("It's growth is " + cat1.getGrowth() + "m.");
        System.out.println("It's length is " + cat1.getLength() + "m.");
        System.out.print("It's forse is ");
        System.out.printf("%.2f", cat1.getForse());
        System.out.println(".");

    }
}
