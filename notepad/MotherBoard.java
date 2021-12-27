import java.util.Scanner;

public class MotherBoard {
    private
        int price; //цена
        int socket; //сокет
        String name; //название платы

    public MotherBoard() {
        price = 0;
        socket = 0;
        name = "";
    }

    public MotherBoard inputFromConsoleMotherBoard()
    {
        Scanner in = new Scanner(System.in);
        MotherBoard board = new MotherBoard();
        System.out.println("|Mother Board|");
        System.out.println("Name: ");
        board.name = in.nextLine();
        System.out.println("Socket: ");
        board.socket = in.nextInt();
        board.price = board.socket * 4 / 100 * 100; //Считаю стоимость относительно вида сокета
        return board;
    }

    public void outputToConsoleMotherBoard()
    {
        System.out.print("\n|Mother Board|"
                + "\n  Name - " + name
                + "\n  Socket - " + socket
                + "\n  Price - " + price);
    }

    public int getPrice()
    {
        return price;
    }

}
