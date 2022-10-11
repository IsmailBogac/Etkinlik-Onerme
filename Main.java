import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak  yapabilirsin ");
            if (heat >= 5) {
                System.out.print("Sinemaya gidebilirsin");
            }

        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsin");
            if (heat >= 15) {
                System.out.println("Piknik de yapabilirsin");
            }
        } else if (heat > 15 && heat < 25) {
            System.out.println("Piknik yapabilirsin");
        } else {
            System.out.println("Yüzebilirsin");
        }
    }

}


// Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
// Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
// Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner