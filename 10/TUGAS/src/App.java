import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);
        System.out.println("Nomor 1. Nilai (<=0)= " );
        int nilai = Inputan.nextInt();
        
        TampilNilai(nilai);
        //no 2
        Scanner Inputan2 = new Scanner(System.in);
        System.out.println("Nomor 2. Nilai(>=10) = " );
        int nilai2 = Inputan2.nextInt();
        Terbalik(nilai2);
        //no 3
        Scanner Inputan3 = new Scanner(System.in);
        System.out.println("Nomor 3. Nilai Faktor(>=1)" );
        int nilai3 = Inputan3.nextInt();
        int hasilFaktor = Faktorial(nilai3);
        System.out.println("Nilai faktor (>=1) =  " + hasilFaktor);
        //no 4
        Scanner Inputan4 = new Scanner(System.in);
        System.out.println("Nomor 4. Nilai Fibonacci (>=1) = " );
        int nilai4 = Inputan4.nextInt();
        for (int i = 0; i < nilai4; i++) {
            System.out.println("Angka = "+fibonacci(i));
        }
        //no 5
        Scanner Inputan5 = new Scanner(System.in);
        System.out.println("Nomor 5. Nilai (>=1)" );
        int nilai5 = Inputan5.nextInt();
        int hasilpascal = Pascal(nilai5);
        System.out.println("Jumlah semua Segitiga Pascal =  " + hasilpascal);
        //no 6
        Scanner Inputan6 = new Scanner(System.in);
        System.out.println("Nomor 6. Nilai (>=1)" );
        int nilai6 = Inputan6.nextInt();
        int hasilTambah = TambahNilai(nilai6);
        System.out.println("Nilai tambah nilai= " + hasilTambah);
    }   
    private static void TampilNilai(int num){
        System.out.println("ANGka =" + num);
        
        if( num == 10 ){
            return;
        }
        num++;
        TampilNilai(num);
    }
    private static void Terbalik(int num){
        System.out.println("ANGka =" + num);
        
        if( num == 0 ){
            return;
        }
        num--;
        Terbalik(num);
    }
    private static int Faktorial(int num){
        
        if( num == 1 ){
            return num;
        }

        return num * Faktorial(num-1);
        
    }
    private static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
    private static int Pascal(int num){
        
        if (num == 0) {
            return 1;
        }
        return (int)Math.pow(2, num) + Pascal(num - 1);
        
    }
    private static int TambahNilai(int num){

        if( num == 0 ){
            return num;
        }


        return num + TambahNilai(num-1);
    }
}
