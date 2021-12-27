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
        System.out.println("|Hard disk|");
        System.out.println("Name: ");
        mem.name = in.nextLine();
        System.out.println("Amount of memory (Gb): ");
        mem.mem = in.nextInt();
        mem.price = mem.mem * 3;//Считаю стоимость относительно объема памяти накопителя
        return mem;
    }

    public void outputToConsoleMemory()
    {
        System.out.print("\n|Hard disk|"
                + "\n  Name - " + name
                + "\n  Amount of memory - " + mem
                + "\n  Price - " + price);
    }

    public int getPrice()
    {
        return price;
    }

}
