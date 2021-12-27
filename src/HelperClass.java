import java.lang.*;

import java.util.*;



class HelperClass {



    // проверить, является ли целое число больше 0 или нет
    public static boolean isValidInteger(int test)
    {
        return (test >= 0);
    }

    // Проверка, ввести число не менее чем
    public static int getInRange(int low) {
        Scanner sc = new Scanner(System.in);
        int test;
        do
        {
            test = sc.nextInt();
        } while (test < low);
        return test;
    }

}