import java.util.Scanner;
public class Imp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Model Number");
        String modelNumber = sc.next();

        if(modelNumber.charAt(0) == 'P'){
            Petrol p = new Petrol(modelNumber);
        } 
        else if(modelNumber.charAt(0) == 'D'){
            Diesel d = new Diesel(modelNumber);
        }
        else if(modelNumber.charAt(0) == 'C'){
            CNG c = new CNG(modelNumber);
        }
        else if(modelNumber.charAt(0) == '8'){
            ElectricalEngine ee = new ElectricalEngine(modelNumber);
        }
    }

   
}
