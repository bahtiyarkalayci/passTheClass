import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        int mat,fiz,turk,kim,muz,toplam,ders;
        double average;
        toplam=0;
        ders=0;

        Scanner scanner=new Scanner(System.in);
        System.out.print("matematik notunu giriniz");
        mat= scanner.nextInt();
        if (mat<=100 && mat>=0) {
            toplam+=mat;
            ders++;
        }else{
            System.out.println("0 ile 1oo arasında olmadığı için ortalamaya katılamaz");
        }
        System.out.print("fizik notunu giriniz");
        fiz=scanner.nextInt();
        if (fiz<=100 && fiz>=0) {
            toplam+=fiz;
            ders++;
        }else{
            System.out.println("0 ile 1oo arasında olmadığı için ortalamaya katılamaz");
        }
        System.out.print("turkce notunu giriniz");
        turk= scanner.nextInt();
        if (turk<=100 && turk>=0) {
            toplam+=turk;
            ders++;
        }else{
            System.out.println("0 ile 1oo arasında olmadığı için ortalamaya katılamaz");
        }
        System.out.print("kimya notunu giriniz");
        kim=scanner.nextInt();
        if (kim<=100 && kim>=0) {
            toplam+=kim;
            ders++;
        }else{
            System.out.println("0 ile 1oo arasında olmadığı için ortalamaya katılamaz");
        }
        System.out.print("muzik notunu giriniz");
        muz=scanner.nextInt();
        if (muz<=100 && muz>=0) {
            toplam+=muz;
            ders++;
        }else{
            System.out.println(" 0 ile 1oo arasında olmadığı için ortalamaya katılamaz");
        }
       average=toplam/ders;
        if (average>=55){
            System.out.println("sınıfı geçtiniz");
        }else {
            System.out.println("sınıfı geçemediniz");
        }
        System.out.println("ortalama"+average);
    }
}
