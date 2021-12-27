import java.util.Scanner;

public class Processor {
    private
        int price; //цена
        int count; //количество ядер
        String name; //название процессора

    public Processor(){
        name = "";
        count = 0;
        price = 0;
    }

    public Processor inputFromConsoleProcessor() {
        Scanner in = new Scanner(System.in);
        Processor proc = new Processor();
        System.out.println("|Процессор|");
        System.out.println("Название производителя: ");
        proc.name = in.nextLine();
        System.out.println("Количество ядер: ");
        proc.count = in.nextInt();
        proc.price = proc.count * 5300; //Считаю стоимость относительно кол-ва ядер
        return proc;
    }

    public void outputToConsoleProcessor()
    {
        System.out.print("\n|Процессор|"
                + "\n  Название - " + name
                + "\n  Кол-во ядер - " + count
                + "\n  Цена - " + price);
    }

    public int getPrice()
    {
        return price;
    }
}
