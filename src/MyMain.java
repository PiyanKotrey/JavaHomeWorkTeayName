import java.util.Scanner;
public class MyMain{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        String Name = input.nextLine().toUpperCase();
        int sum = 0;
        for(int i=0;i<Name.length();i++){
            switch (Name.charAt(i)){
                case 'A','J','S':
                    sum +=1;
                    break;
                case 'B','K','T':
                    sum +=2;
                    break;
                case 'C','L','U':
                    sum +=3;
                    break;
                case 'D','M','V':
                    sum +=4;
                    break;
                case 'E','N','W':
                    sum +=5;
                    break;
                case 'F','O','X':
                    sum +=6;
                    break;
                case 'G','P','Y':
                    sum +=7;
                    break;
                case 'H','Q','Z':
                    sum +=8;
                    break;
                case 'I','R':
                    sum +=9;
                default:
                    sum +=0;
            }
        }
        int result;
        int value1=0;
        int value2=0;
        while (true){
            result=sum/10;
            sum=sum%10;
            value1=sum+result;
            if (value1>9){
                result=value1/10;
                value1=value1%10;
                value2=result+value2;
                System.out.println("You are in Chapter:" +value2);
            }else {
                System.out.println("You are in Chapter:" +value1);
            }
            break;
        }
    }

}
