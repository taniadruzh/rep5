package ht2_29_12_17;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean flExit = true;
        while (flExit) {
            System.out.println("Let's play! (y/n)");
            Scanner in = new Scanner(System.in);
            String st = in.nextLine();
            if (st.equals("n")) {
                flExit = false;
                System.out.println("Goodbye!");
                continue;
            }
            System.out.println("1. Do you want to try your luck?");
            System.out.println("2. Do you want to know your fate?");
            System.out.println("3. Do you need calculator?");
            System.out.println("4. May I guess your number?");
            int ans = in.nextInt();
            switch (ans)
            {
                case 1: {
                    lotteryDrawind();
                    break;
                }
                case 2:{
                   fate();
                    break;
                }
                case 3:{
                    calculator();
                    break;
                }
                case 4:{
                    boolean t = guess();
                    if (t){
                       System.out.println("More then 5.");
                        }
                       else {
                        System.out.println("Les then 5.");
                    }
                    break;
                }
            }

        }
    }

    public static boolean guess()
    {
        System.out.println("Enter your number.");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        return t > 5 ? true : false;
    }

    public static void lotteryDrawind()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i +1;
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Bet the folowing combination. It'll make you rich.");
        for (int i : result) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void fate()
    {
        System.out.println("Choose your favourite poet.");
        System.out.println("1. Pushkin");
        System.out.println("2. Lermontov");
        System.out.println("3. Shevchenko");

        Scanner in = new Scanner(System.in);
        int p = in.nextInt();

        String str;

        switch (p)
        {
            case 1: {
                str = stringPushkin();
                break;
            }
            case 2: {
                str = stringLermontov();
                break;
            }
            default: {
                str = stringShevch();
            }
        }
        String[] strArray = str.split(" ");
        System.out.println("Choose number from 1 to " + (strArray.length - 1));
        int i = in.nextInt();
        System.out.println(strArray[i-1]);
        System.out.println(strArray[i]);
        System.out.println(strArray[i+1]);
    }

    public static void calculator()
    {
        System.out.println("Let's calculate :-)");
        System.out.println("Enter your first number:");
        int num1 = getInt();
        System.out.println("Enter operation symbol (+ - * /):");
        char ch = getOperation();
        System.out.println("Enter your second number:");
        int num2 = getInt();
        System.out.print("Your result is ");
        calc(num1,ch,num2);
    }

    public static int getInt()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }

    public static char getOperation()
    {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        char ch = st.charAt(0);
        return ch;
    }

    public static void calc(int num1,char ch,int num2)
    {
        switch (ch){
            case '+': {
                System.out.println(num1 + num2);
                break;
            }
            case '-':{
                System.out.println(num1 - num2);
                break;
            }
            case '*':{
                System.out.println(num1 * num2);
                break;
            }
            case '/':{
                System.out.println(num1 / num2);
                break;
            }
        }
    }

    public static String stringPushkin()
    {
        String s = "Я к вам пишу – чего же боле?\n" +
                "Что я могу еще сказать?\n" +
                "Теперь, я знаю, в вашей воле\n" +
                "Меня презреньем наказать.\n" +
                "\n" +
                "Но вы, к моей несчастной доле\n" +
                "Хоть каплю жалости храня,\n" +
                "Вы не оставите меня.\n" +
                "\n" +
                "Сначала я молчать хотела;\n" +
                "Поверьте: моего стыда\n" +
                "Вы не узнали б никогда,\n" +
                "Когда б надежду я имела\n" +
                "Хоть редко, хоть в неделю раз\n" +
                "В деревне нашей видеть вас,\n" +
                "Чтоб только слышать ваши речи,\n" +
                "Вам слово молвить, и потом\n" +
                "Все думать, думать об одном\n" +
                "И день и ночь до новой встречи.\n" +
                "Но, говорят, вы нелюдим;\n" +
                "\n" +
                "В глуши, в деревне всё вам скучно,\n" +
                "\n" +
                "А мы... ничем мы не блестим,\n" +
                "Хоть рады вам и рады простодушно.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Зачем вы посетили нас?\n" +
                "В глуши забытого селенья\n" +
                "Я никогда не знала б вас,\n" +
                "Не знала б горького мученья.\n" +
                "Души неопытной волненья\n" +
                "Смирив со временем (как знать?),\n" +
                "По сердцу я нашла бы друга,\n" +
                "Была бы верная супруга\n" +
                "И добродетельная мать.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Другой!.. Нет, никому на свете\n" +
                "Не отдала бы сердца я!\n" +
                "То в высшем суждено совете...\n" +
                "То воля неба: я твоя;\n" +
                "Вся жизнь моя была залогом\n" +
                "Свиданья верного с тобой;\n" +
                "Я знаю, ты мне послан богом,\n" +
                "До гроба ты хранитель мой...\n" +
                "Ты в сновиденьях мне являлся,\n" +
                "Незримый, ты мне был уж мил,\n" +
                "Твой чудный взгляд меня томил,\n" +
                "В душе твой голос раздавался\n" +
                "Давно...нет, это был не сон!\n" +
                "Ты чуть вошел, я вмиг узнала,\n" +
                "Вся обомлела, заплыла\n" +
                "И в мыслях молвила: вот он!\n" +
                "Не правда ль? Я тебя слыхала:\n" +
                "Ты говорил со мной в тиши,\n" +
                "Когда я бедным помогала\n" +
                "Или молитвой услаждала\n" +
                "Тоску волнуемой души?\n" +
                "И в это самое мгновенье\n" +
                "Не ты ли, милое виденье,\n" +
                "В прозрачной темноте мелькнул,\n" +
                "Проникнул тихо к изголовью?\n" +
                "Не ты ль, с отрадой и любовью,\n" +
                "Слова надежды мне шепнул?\n" +
                "Кто ты, мой ангел ли хранитель,\n" +
                "Или коварный искуситель:\n" +
                "Мои сомненья разреши.\n" +
                "\n" +
                "Быть может, это все пустое,\n" +
                "Обман неопытной души!\n" +
                "И суждено совсем иное...\n" +
                "Но так и быть! Судьбу мою\n" +
                "Отныне я тебе вручаю,\n" +
                "Перед тобою слезы лью,\n" +
                "Твоей защиты умоляю...\n" +
                "Вообрази: я здесь одна,\n" +
                "Никто меня не понимает,\n" +
                "Рассудок мой изнемогает,\n" +
                "И молча гибнуть я должна.\n" +
                "Я жду тебя: единым взором\n" +
                "Надежды сердца оживи\n" +
                "Иль сон тяжелый перерви,\n" +
                "Увы, заслуженный укором!\n" +
                "\n" +
                " \n" +
                "\n" +
                "Кончаю! Страшно перечесть...\n" +
                "Стыдом и страхом замираю...\n" +
                "Но мне порукой ваша честь,\n" +
                "И смело ей себя вверяю...";
        return s;
    }

    public static String stringLermontov()
    {
        String s = "Белеет парус одинокой\n" +
                "В тумане моря голубом!..\n" +
                "Что ищет он в стране далекой?\n" +
                "Что кинул он в краю родном?...\n" +
                "Играют волны — ветер свищет,\n" +
                "И мачта гнется и скрыпит...\n" +
                "Увы! Он счастия не ищет\n" +
                "И не от счастия бежит!\n" +
                "Под ним струя светлей лазури,\n" +
                "Над ним луч солнца золотой...\n" +
                "А он, мятежный, просит бури,\n" +
                "Как будто в бурях есть покой!";
        return s;
    }

    public static String stringShevch()
    {
        String s = "Мені тринадцятий минало.\n" +
                "\n" +
                "Я пас ягнята за селом.\n" +
                "\n" +
                "Чи то так сонечко сіяло,\n" +
                "\n" +
                "Чи так мені чого було?\n" +
                "\n" +
                "Мені так любо, любо стало,\n" +
                "\n" +
                "Неначе в Бога......\n" +
                "\n" +
                "Уже прокликали до паю,\n" +
                "\n" +
                "А я собі у бур’яні\n" +
                "\n" +
                "Молюся Богу... І не знаю,\n" +
                "\n" +
                "Чого маленькому мені\n" +
                "\n" +
                "Тойді так приязно молилось,\n" +
                "\n" +
                "Чого так весело було.\n" +
                "\n" +
                "Господнє небо, і село,\n" +
                "\n" +
                "Ягня, здається, веселилось!\n" +
                "\n" +
                "І сонце гріло, не пекло!\n" +
                "\n" +
                "Та недовго сонце гріло,\n" +
                "\n" +
                "Недовго молилось...\n" +
                "\n" +
                "Запекло, почервоніло\n" +
                "\n" +
                "І рай запалило.\n" +
                "\n" +
                "Мов прокинувся, дивлюся:\n" +
                "\n" +
                "Село почорніло,\n" +
                "\n" +
                "Боже небо голубеє\n" +
                "\n" +
                "І те помарніло.\n" +
                "\n" +
                "Поглянув я на ягнята —\n" +
                "\n" +
                "Не мої ягнята!\n" +
                "\n" +
                "Обернувся я на хати —\n" +
                "\n" +
                "Нема в мене хати!\n" +
                "\n" +
                "Не дав мені Бог нічого!..\n" +
                "\n" +
                "І хлинули сльози,\n" +
                "\n" +
                "Тяжкі сльози!.. А дівчина\n" +
                "\n" +
                "При самій дорозі\n" +
                "\n" +
                "Недалеко коло мене\n" +
                "\n" +
                "Плоскінь вибирала,\n" +
                "\n" +
                "Та й почула, що я плачу. /37/\n" +
                "\n" +
                "Прийшла, привітала,\n" +
                "\n" +
                "Утирала мої сльози\n" +
                "\n" +
                "І поцілувала...\n" +
                "\n" +
                "Неначе сонце засіяло,\n" +
                "\n" +
                "Неначе все на світі стало\n" +
                "\n" +
                "Моє... лани, гаї, сади!..\n" +
                "\n" +
                "І ми, жартуючи, погнали\n" +
                "\n" +
                "Чужі ягнята до води.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Бридня!.. А й досі, як згадаю,\n" +
                "\n" +
                "То серце плаче та болить,\n" +
                "\n" +
                "Чому Господь не дав дожить\n" +
                "\n" +
                "Малого віку у тім раю.\n" +
                "\n" +
                "Умер би, орючи на ниві,\n" +
                "\n" +
                "Нічого б на світі не знав.\n" +
                "\n" +
                "Не був би в світі юродивим.\n" +
                "\n" +
                "Людей і [Бога] не прокляв!";
        return s;
    }
}
