import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,aubergine=5.0,inPear,inApple,inTomato,inBanana,inAubergine,result;

        System.out.println("Manavımıza Hoşgeldiniz!"+"\n"+"Ürünlerimiz ve Fiyatlarımız (kg)"+"\n"+"Armut : "+pear+"\n"+"Elma: "+apple+"\n"+"Domates : "+tomato+"\n"+"Muz : "+banana+"\n"+"Patlican : "+aubergine+"\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        inPear = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        inApple = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        inTomato = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        inBanana = input.nextDouble();

        System.out.print("Patlican Kaç Kilo ? :");
        inAubergine = input.nextDouble();
        input.close();
        result = (inPear * pear) + (inApple * apple) + (inTomato * tomato) + (inBanana * banana) + (inAubergine * aubergine);

        System.out.println("Toplam ödenilmesi gereken tutar: "+result);
        


    }
}
