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
        System.out.println("|RAM|");
        System.out.println("Name: ");
        ram.name = in.nextLine();
        System.out.println("Amount of memory (Gb): ");
        ram.memory = in.nextInt();
        ram.price = ram.memory * 750;//Считаю стоимость относительно объема памяти озу
        return ram;
    }

    public void outputToConsoleRam()
    {
        System.out.print("\n|RAM|"
                + "\n  Name - " + name
                + "\n  Amount of memory - " + memory
                + "\n  Price - " + price);
    }

    public int getPrice()
    {
        return price;
    }

}
