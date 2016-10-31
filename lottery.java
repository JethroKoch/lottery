import java.util.Scanner;
import java.util.Arrays;
public class lottery{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double input[] = new double[6];
        double bonus = Math.ceil(Math.random()) * 49 ;
        double number[] = new double[6];
        int compare = 0;
        for( int i = 0; i<6; i ++){
            number[i] = Math.ceil(Math.random()) * 49; 
        }
        for(int n = 0; n<6; n ++){
            System.out.println("Please enter your next number");
            input[n] = sc.nextInt(); 
        }
        System.out.println("Please enter your bonus number");
        double inputbon = sc.nextInt();
        Arrays.sort(number);
        Arrays.sort(input);
        for(int c = 0; c < 6; c++){
            if((number[c] == input[c])){
                compare ++;
            }
        }
        switch(compare){
            case 3 :
                System.out.println("You won £10");
                break;
            case 4 :
                System.out.println("You win £100");
                break;
            case 5 :
                if(bonus == inputbon){
                        System.out.println("you won £100,000");
                    }
                    else{
                        System.out.println("You won £10,000");
                    }
                    break;
            case 6 :
                System.out.println("You won £1,000,000");
                break;
            default:
                System.out.println("Sorry you didn't win this time");
                break;
            }
        }
    }
