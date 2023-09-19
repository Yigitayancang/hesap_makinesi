import java.util.Scanner;
public class hesap_makinesi {

    public static void main(String[] args) {
        int  a , b , secim ;
        Scanner karar = new Scanner(System.in);
        System.out.print("BİRİNCİ SAYIYI GİRİNİZ : ");
        a = karar.nextInt();
        System.out.print("İKİNCİ SAYIYI GİRİNİZ : ");
        b = karar.nextInt();
        System.out.println("TOPMA İÇİN : 1 \n ÇIKARMA İÇİN : 2 \n ÇARPMA İÇİN : 3 \n BÖLME İÇİN : 4 ");
        secim = karar.nextInt();
        if( secim == 1 ){
            System.out.println("SAYILARIN TOPLAMI : " + ( a + b ));
        }
        else if ( secim == 2){
            System.out.println("SAYILARIN ÇIKARIMI : " + (a - b ));    
        }
        else if (secim ==3 ){
            
            System.out.println("SAYILARIN ÇARPIMI : " + ( a * b ));
        }
        else if (secim == 4){
             if( a != 0 && b !=0 ){
                System.out.println(" SAYILARIN BÖLÜMÜ : " +  ( a / b ));
             }
             else{
                System.out.println(" 0 bölünmez bir sayı : ");
             }
        }
        else{
            System.out.println("YANLIŞ BİR VERİ GİRİLDİ LÜTFEN VERİLEN TABLOYA UYUNUZ .");
        }


    }

    
}