public class Info {
    private
    int age;

    public Info() {
        age = -1;
    }

    public void setAge(String str)
    {
        try
        {
            age = Integer.parseInt(str);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}
