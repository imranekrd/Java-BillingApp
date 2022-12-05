import java.util.*;

public class Main {
    public static void main(String[] args) {
    //dish and cost

     String[] dishes = {"Kebap","Tantuni","Tavuk Doner","Et Doner","Iskender","Corba","Ice Tea","Kutu Kola","Ayran","Salgam"};
     double[] costs = {54.95,25.50,35,42.50,75,15.50,10,10.50,5.50,7.50};

     Bill myBill = new Bill();

     myBill.addOrder("Et Doner",4,dishes,costs);
     myBill.addOrder("Corba",7,dishes,costs);
     myBill.addOrder("Kebap",3,dishes,costs);
     myBill.addOrder("Kutu Kola",10,dishes,costs);


     myBill.getOrder();
     myBill.SeterviceorDelivery(12);
     System.out.println(myBill.getTotalCost()+" TL");






    }

}