package programa;
import entidade.*;
import java.util.Scanner;

public class CriadorDeHeroi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos criar um heroi!");

        System.out.println("Qual será seu nome? ");
        String nomeheroi = sc.nextLine();

        System.out.println("Começando a partir de 0, qual o XP inicial do seu herói? ");
        int xp = sc.nextInt();

        Heroi primeiroheroi = new Heroi(nomeheroi, xp);


        System.out.println("O Herói de nome " + primeiroheroi.getNome() + " está no nível " + primeiroheroi.getNivelheroi());

    }
}
