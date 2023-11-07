package ovh.johanpassion;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien avez vous de pièces de 1 centime ?");
        int unCent = clavier.nextInt();
        System.out.println("Combien avez vous de pièces de 2 centime ?");
        int deuxCent = clavier.nextInt();
        System.out.println("Combien avez vous de pièces de 5 centime ?");
        int cinqCent = clavier.nextInt();
        System.out.println("Combien avez vous de pièces de 10 centime ?");
        int dixCent = clavier.nextInt();
        System.out.println("Combien avez vous de pièces de 50 centime ?");
        int cinquanteCent = clavier.nextInt();
        int total = (unCent*1)+(deuxCent*2)+(cinqCent*5)+(dixCent*10)+(cinquanteCent*50);
        if(total==100){
            System.out.println("Vous avez pile ce qu'il faut pour acheter un café crème !");
        }else if(total<100){
            System.out.println("Il vous manque "+Math.abs(total-100)+" centimes pour acheter un café crème");
        }else{
            System.out.println("Vous avez assez pour vous acheter un café crème, et il vous restera "+(total-100)+" centimes");
        }
        clavier.close();
    }
    
}
