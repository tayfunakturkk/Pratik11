package Pratik11;
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int month,day;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz:");
        month =input.nextInt();

        System.out.print("Doğduğunuz günü giriniz:");
        day =input.nextInt();

        if (month==1 && day<=21){
            System.out.println("Oğlak Burcu");
        }
        else if (month==1){
            System.out.println("Kova Burcu");
        }

        if (month==2 && day<=19){
            System.out.println("Kova Burcu");
        }
        else if (month==2){
            System.out.println("Balık Burcu");
        }
        if (month==3 && day<=20){
            System.out.println("Balık Burcu");
        }
        else if (month==3){
            System.out.println("Koç Burcu");
        }

        if (month==4 && day<=20){
            System.out.println("Koç Burcu");
        }
        else if (month==4){
            System.out.println("Boğa Burcu");
        }
        if (month==5 && day<=21){
            System.out.println("Boğa Burcu");
        }
        else if (month==5){
            System.out.println("İkizler Burcu");
        }
        if (month==6 && day<=22){
            System.out.println("İkizler Burcu");
        }
        else if (month==6){
            System.out.println("Yengeç Burcu");
        }
        if (month==7 && day<=22){
            System.out.println("Yengeç Burcu");
        }
        else if (month==7){
            System.out.println("Aslan Burcu");
        }
        if (month==8 && day<=22){
            System.out.println("Aslan Burcu");
        }
        else if (month==8){
            System.out.println("Başak Burcu");
        }
        if (month==9 && day<=22){
            System.out.println("Başak Burcu");
        }
        else if (month==9){
            System.out.println("Terazi Burcu");
        }
        if (month==10 && day<=22){
            System.out.println("Terazi Burcu");
        }
        else if (month==10){
            System.out.println("Akrep Burcu");
        }
        if (month==11 && day<=21){
            System.out.println("Akrep Burcu");
        }
        else if (month==11){
            System.out.println("Yay Burcu");
        }
        if (month==12 && day<=21){
            System.out.println("Yay Burcu");
        }
        else if (month==12){
            System.out.println("Oğlak Burcu");
        }
        else {
            System.out.println("Yanlış sayı girdiniz.Lütfen gün ve ay sayılarını kontrol ediniz.");
        }
    }
}
