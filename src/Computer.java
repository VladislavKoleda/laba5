public class Computer {
    private
        Processor _proc = new Processor();
        Ram _ram = new Ram();
        Memory _mem = new Memory();
        MotherBoard _board = new MotherBoard();
        VideoCard _video = new VideoCard();
        static int priceOfAllOrder = 0;
        protected int fullPrice;

    public Computer()
    {
        fullPrice = 0;
    }

    public Computer(int price)
    {
        fullPrice = price;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = i;
    }

    public int myPrice()
    { //Полная стоимость заказа
        return fullPrice = _board.getPrice() + _mem.getPrice() + _proc.getPrice() + _ram.getPrice() + _video.getPrice();
    }

    public void outputComputer()
    {//Вывод информации о всех комплектующих
        _board.outputToConsoleMotherBoard();
        _proc.outputToConsoleProcessor();
        _ram.outputToConsoleRam();
        _mem.outputToConsoleMemory();
        _video.outputToConsoleVideoCard();
        System.out.print("\n------------------\nЦена заказа - " + fullPrice + "\n------------------\n");
    }

    public void inputBoard()
    {
        _board = _board.inputFromConsoleMotherBoard();
    }

    public void inputProc()
    {
        _proc = _proc.inputFromConsoleProcessor();
    }

    public void inputRam()
    {
        _ram = _ram.inputFromConsoleRam();
    }

    public void inputMemory()
    {
        _mem = _mem.inputFromConsoleMemory();
    }

    public void inputVideo()
    {
        _video = _video.inputFromConsoleVideoCard();
    }

    public int getPrice()
    {
        return fullPrice;
    }

    public int getDeliveryCost()
    {
        return fullPrice / 10;
    }

}
