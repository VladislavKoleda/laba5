import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String();
        System.out.print("Start? (y/n) --- ");
        str = in.nextLine();
        while (!Objects.equals(str, "y"))
        {
            if (Objects.equals(str, "n"))
            {
                System.out.println("Exit");
                System.exit(0);
            }
            System.out.print("Return --- ");
            str = in.nextLine();
        }

        Computer comp = new Computer();
        int k = 0;

        while (Objects.equals(str, "y") && k < 10)
        {
            comp.inputBoard(); //Ввод информации о плате
            comp.inputProc(); //Ввод информации о процессоре
            comp.inputRam(); //Ввод информации о озу
            comp.inputMemory(); //Ввод информации о накопителе
            comp.inputVideo(); //Ввод информации о видеокарте

            comp.myPrice(); //Полная стоимость заказа

            System.out.print("\nВаш заказ:");
            comp.outputComputer(); //Вывод заказа
            k++;

            System.out.print("Start? (y/n)");
            str = in.nextLine();

            while (!Objects.equals(str, "y"))
            {
                if (Objects.equals(str, "n"))
                {
                    System.out.print("Exit");
                    System.exit(0);
                }
                System.out.print("Return --- ");
                str = in.nextLine();
            }

        }

    }

}
