package conditional;
import java.util.Scanner;
public class ProfitLoss {

	public static void main(String[] args) {
		float salePrice,costPrice,amount;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enetr Cost Price\n");
        costPrice=sc.nextFloat();
        System.out.println("Enetr Selling Price\n");
        salePrice=sc.nextFloat();
        
        if(salePrice>costPrice)
        {
        	amount=salePrice-costPrice;
            System.out.println("Profit is "+amount);

        }
        else if(costPrice>salePrice) {
        	 amount=costPrice-salePrice;
             System.out.println(amount+" loss");

        }
        else
        {
            System.out.println("No Profit No Loss");

        }
        

	}

}
