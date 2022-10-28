import java.util.Scanner;
public class SwitchCaseHesapMakinesi {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner (System.in);
        System.out.println("********************************");
        String islemler = "1.Toplama\n"
                         + "2.Çıkarma\n"
                         + "3.Çarpma\n"
                         + "4.Bölme";
        System.out.println(islemler);
        System.out.println("********************************");
          
        System.out.println("işlemi seçiniz");
        String islem = scanner.nextLine();
        switch(islem){
            case "1":
                System.out.print("birinci sayı: ");
                int a = scanner.nextInt();
                System.out.print("ikinci sayı: ");
                int b = scanner.nextInt();
                System.out.println("toplamları: " + (a+b));
                break;
             
            case "2":
                System.out.print("birinci sayı: ");
                int c = scanner.nextInt();
                System.out.print("ikinci sayı: ");
                int d = scanner.nextInt();
                System.out.println("kalan sonuç: " + (c-d));
                
              break;
              
             case"3":
                 System.out.print("birinci sayı: ");
                 int e = scanner.nextInt();
                 System.out.print("ikinci sayı: ");
                 int f = scanner.nextInt();
                 System.out.println("çarpımları: " + (e*f));
                 break;
                 
             case "4":
                 System.out.print("birinci sayı: ");
                 double g = scanner.nextDouble();
                 System.out.print("ikinci sayı: ");
                 double h = scanner.nextDouble();
                 System.out.println("Bölüm sonucu: " + (g/h));
                 break;
                 
             default:
                 System.out.println("geçersiz işlem...");
                 break;
        }
    }
}
