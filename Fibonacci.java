import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        //Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Scanner sc = new Scanner(System.in);
        int elemanSayisi, a=0, b=1, c;

        System.out.println("Kaç elemanlı birfibonacci serisi istiyorsunuz: ");
        elemanSayisi = sc.nextInt();

        System.out.println(elemanSayisi+" elemanlık fibonacci serisi: "+a+","+b);
        for(int i=2;i<=elemanSayisi;i++){
            c = a + b;
            System.out.print(", "+c);
            a=b;
            b=c;
        }
    }
}