import java.net.SocketPermission;
import java.util.*;
public class Plot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l,b, totalArea=0,remainingArea=0,allPlotArea=0;
        char choice='null';
        System.out.println("Enter length and breadth of total ground:");
        l= in.nextInt();
        b= in.nextInt();
        totalArea+=l*b;
        remainingArea=totalArea;
        do{
            System.out.println("Enter length and breadth of a plot:");
            l= in.nextInt();
            b= in.nextInt();
            if(l*b<= remainingArea)
            {
                allPlotArea += l*b;
                remainingArea=totalArea-allPlotArea;
                System.out.println("Do you want to enter more plot (Y/N) :");
            }
            else
            {
                System.out.println("no more size available");
                break;

            }
        }
            while(choice =='y' || choice == 'Y');
        
        System.out.println("Total Area is :" +totalArea);
        System.out.println("Remaining Area is :" +remainingArea);
    }
}
