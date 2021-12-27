import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String();

        Info info = new Info();
        System.out.println("Введите ваш возраст: ");
        str = in.nextLine();
        info.setAge(str);

        System.out.print("Начать сборку комплектующих? (y/n) --- ");
        str = in.nextLine();
        while (!Objects.equals(str, "y")) {
            if (Objects.equals(str, "n")) {
                System.out.println("Завершение");
                System.exit(0);
            }
            System.out.print("Повторите ввод --- ");
            str = in.nextLine();
        }

        Computer[] comp = new Delivery[10];
        for (int i = 0; i < 10; i++)
            comp[i] = new Delivery();
        int k = 0;

        while (Objects.equals(str, "y") && k < 10) {
            comp[k].inputBoard(); //Ввод информации о плате
            comp[k].inputProc(); //Ввод информации о процессоре
            comp[k].inputRam(); //Ввод информации о озу
            comp[k].inputMemory(); //Ввод информации о накопителе
            comp[k].inputVideo(); //Ввод информации о видеокарте

            comp[k].myPrice(); //Полная стоимость заказа

            System.out.print("\nВаш заказ:");
            comp[k].outputComputer(); //Вывод заказа
            System.out.println("Стоимость доставки: " + comp[k].getDeliveryCost());
            k++;

            System.out.print("Начать новую сборку? (y/n)");
            str = in.nextLine();

            while (!Objects.equals(str, "y")) {
                if (Objects.equals(str, "n")) {
                    System.out.print("Завершение");
                    break;
                }
                System.out.print("Повторите ввод --- ");
                str = in.nextLine();
            }

        }

        System.out.println("\nHelper сработал. Ответ на запрос: " + HelperClass.isValidInteger(5));

        Computer[][] compArr = new Delivery[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                compArr[i][j] = new Delivery();
            }
    }
}