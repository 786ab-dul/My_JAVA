class Telegram
{
    static void send(String link)
    {
        System.out.println("Link has sent");
    }
    static void send(int no)
    {
        System.out.println("Mobile no sent");
    }
    static void send(String link, long mob_no)
    {
        System.out.println("sent link with mobile no");
    }
    static void send(long mob_no, String link)
    {
        System.out.println("Sent no with link");
    }
    public static void main(String[] args)
    {
        send("https://url.com");
        send("+919876543210");
        send("https://...", 919876543210L);
        send(919876543210L, "https");
    }
}