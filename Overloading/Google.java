class Google
{
    void send(double amt)
    {
        System.out.println("Sent successfully");
    }
    void send(String tran_Id)
    {
        System.out.println("Sent got transaction ID");
    }
    void send(double amt, String tranID)
    {
        System.out.println("Sent sucessfully and got transaction Id");
    }
    void send(String tran_Id, double amt)
    {
        System.out.println("got tran-ID and sent money sucessfuly");
    }
    public static void main(String[] args)
    {
        Google gp = new Google();
        gp.send(50000);
        gp.send("352DS6AB2E2");
        gp.send(50000, "352DS6E2");
        gp.send("352DS6E2", 50000);
    }
}