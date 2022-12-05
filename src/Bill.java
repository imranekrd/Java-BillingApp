import java.util.ArrayList;

public class Bill {

    private ArrayList<String> orderedFood;
    private ArrayList<Integer> orderedQuantity;

    public Bill(){
        orderedFood = new ArrayList<String>();
        orderedQuantity = new ArrayList<Integer>();
    }

    private double totalCost;
    public double getTotalCost(){
        return totalCost;
    }


    public void addOrder(String meal, int quantity,String[] dish,double[] cost){
        orderedFood.add(meal);
        orderedQuantity.add(quantity);

        for (int i =0;i< dish.length;i++){
            if (meal.equals(dish[i])){
                totalCost += quantity * cost[i];
            }
        }
    }

    public void getOrder(){
        for (int i =0;i<orderedFood.size();i++){
            System.out.println(orderedFood.get(i)+" "+orderedQuantity.get(i));

        }
    }
    private double deliveryCharge = 10;
    private boolean serviceordelivery;

    public void SeterviceorDelivery(int type){
        if(type == 1){
            serviceordelivery = true;
            if(serviceordelivery){
                totalCost += deliveryCharge ;
                System.out.println("You are charged "+deliveryCharge+" TL for delivery.");
            }
        }else {
            System.out.println("No extra price charged for service.");
        }
    }




}
