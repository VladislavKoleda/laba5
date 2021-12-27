import java.util.Scanner;

public class Ram {
    private
        int price; //цена
        int memory; //объем памяти
        String name; //название производителя

    public Ram() {
        name = "";
        memory = 0;
        price = 0;
    }

    public Ram inputFromConsoleRam()
    {
        Scanner in = new Scanner(System.in);
        Ram ram = new Ram();
        System.out.println("|ОЗУ|");
        System.out.println("Название производителя: ");
        ram.name = in.nextLine();
        System.out.println("Объем памяти (гб): ");
        ram.memory = in.nextInt();
        ram.price = ram.memory * 750;//Считаю стоимость относительно объема памяти озу
        return ram;
    }

    public void outputToConsoleRam()
    {
        System.out.print("\n|ОЗУ|"
                + "\n  Название - " + name
                + "\n  Объем памяти - " + memory
                + "\n  Цена - " + price);
    }

    public int getPrice()
    {
        return price;
    }

}
