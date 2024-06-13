
import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o código da cor \n");
        
        int luz = sc.nextInt();
        sc.close();
        
        
        switch (luz) {
        // analisa o numero para prever qual sera a proxima luz do semáforo
            case 1:
                System.out.println("A próxima luz será a verde");
                break;
            case 2:
                System.out.println("A próxima luz será a amarela");
                break;
            case 3:
                System.out.println("A próxima luz será a vermelha");
                break;
            default:
                System.out.println("Cor inválida");
                break;
        }
    }

}
