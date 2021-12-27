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
        System.out.println("|Материнская плата|");
        System.out.println("Название производителя: ");
        board.name = in.nextLine();
        System.out.println("Сокет: ");
        board.socket = in.nextInt();
        board.price = board.socket * 4 / 100 * 100; //Считаю стоимость относительно вида сокета
        return board;
    }

    public void outputToConsoleMotherBoard()
    {
        System.out.print("\n|Материнская плата|"
                + "\n  Название - " + name
                + "\n  Сокет - " + socket
                + "\n  Цена - " + price);
    }

    public int getPrice()
    {
        return price;
    }

}
