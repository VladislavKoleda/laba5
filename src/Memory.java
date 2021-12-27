import java.util.Scanner;

public class Memory {
    private
        int price; //цена
        int mem; //объем памяти
        String name; //название диска

    public Memory() {
        name = "";
        mem = 0;
        price = 0;
    }

    public Memory inputFromConsoleMemory()
    {
        Scanner in = new Scanner(System.in);
        Memory mem = new Memory();
        System.out.println("|Накопитель|");
        System.out.println("Название производителя: ");
        mem.name = in.nextLine();
        System.out.println("Объем памяти (гб): ");
        mem.mem = in.nextInt();
        mem.price = mem.mem * 3;//Считаю стоимость относительно объема памяти накопителя
        return mem;
    }

    public void outputToConsoleMemory()
    {
        System.out.print("\n|Накопитель|"
                + "\n  Название - " + name
                + "\n  Объем памяти - " + mem
                + "\n  Цена - " + price);
    }

    public int getPrice()
    {
        return price;
    }

}
