public class Delivery extends Computer{
    private
    int deliveryCost;

    public Delivery()
    {
        deliveryCost = 0;
    }

    public Delivery(int price)
    {
        super(price);
    }

    public void setDeliveryCost(int price)
    {
        deliveryCost = price;
    }

    public int getDeliveryCost()
    {
        return super.getDeliveryCost();
    }

    public String ToString()
    {
        String s = "Стоимость доставки: " + deliveryCost;
        return s;
    }

}
