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
        System.out.println("|Processor|");
        System.out.println("Name: ");
        proc.name = in.nextLine();
        System.out.println("number of cores: ");
        proc.count = in.nextInt();
        proc.price = proc.count * 5300; //Считаю стоимость относительно кол-ва ядер
        return proc;
    }

    public void outputToConsoleProcessor()
    {
        System.out.print("\n|Processor|"
                + "\n  Name - " + name
                + "\n  Number of cores - " + count
                + "\n  Price - " + price);
    }

    public int getPrice()
    {
        return price;
    }
}
