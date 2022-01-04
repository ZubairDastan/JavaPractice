package C2;

// A program to calculate total product quantity
// and price using REGEXP
public class StoreCalculate {
    public static void main(String[] args) {
        String str="1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));

        double product1Count=Double.parseDouble(arr[0]);
        double product1Price=Double.parseDouble(arr[1]);
        double product2Count=Double.parseDouble(arr[2]);
        double product2Price=Double.parseDouble(arr[3]);
        double product3Count=Double.parseDouble(arr[4]);
        double product3Price=Double.parseDouble(arr[5]);
        double totalCount=product1Count+product2Count+product3Count;
        double totalPrice=product1Price+product2Price+product3Price;

        System.out.println("Total product price is: "+totalPrice+" and total product number is: "+ (int)totalCount);
    }
}
