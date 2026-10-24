class Bike{
    double biCost;
    String biBr;
    String biCo;
    Bike(double biCost,String biBr,String biCo){
        this.biCost = biCost;
        this.biBr = biBr;
        this.biCo = biCo;
    }
    public boolean equals(Object obj){
        Bike b2 = (Bike) obj;
        return this.biCost==b2.biCost;

    
    }
    public static void main(String[] args){
        Bike b1 = new Bike(250000,"apache", "orange");
        Bike b2 = new Bike(25000,"hero","hihi");
        if(b1.equals(b2)){
            System.out.println("Same Same");
        }else{
            System.out.println("Not same");
        }
       

    }
}