class Whatsapp
{
    static void send(int no)
    {
        System.out.println("Sent only no:");
    }
    static void send(String msg)
    {
        System.out.println("Sent only texts");
    }
    static void send(int no, String msg)
    {
        System.out.println("sent both no with texts");
    }
    static void send(String msg, int no)
    {
        System.out.println("sent texts with no");
    }
    public static void main(String[] args)
    {
        send(101);
        send("Hello");
        send(101, "Hi");
        send("Hi", 101);
    }
}