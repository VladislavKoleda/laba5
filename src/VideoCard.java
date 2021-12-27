import java.util.Scanner;

public class VideoCard {
    private
        int price; //цена
        int memory; //объем памяти
        String name; //название производителя

    public VideoCard() {
        name = "";
        memory = 0;
        price = 0;
    }

    public VideoCard inputFromConsoleVideoCard()
    {
        Scanner in = new Scanner(System.in);
        VideoCard card = new VideoCard();
        System.out.println("|Видеокарта|");
        System.out.println("Название производителя: ");
        card.name = in.nextLine();
        System.out.println("Объем памяти (гб): ");
        card.memory = in.nextInt();
        card.price = card.memory * 4100;//Считаю стоимость относитнльно оъема памяти видеокарты
        return card;
    }

    public void outputToConsoleVideoCard()
    {
        System.out.print("\n|Видеокарта|"
                + "\n  Название - " + name
                + "\n  Объем памяти - " + memory
                + "\n  Цена - " + price);
    }

    public int getPrice()
    {
        return price;
    }

}
