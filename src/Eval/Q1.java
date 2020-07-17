package Eval;

import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {
// Calcule et écrit tous les entiers pairs à partir de [n jusqu'à n +10[
    //Variable
        int Nb;
        int i;
    //Constantes
        final int Even;

        Scanner reader = new Scanner(System.in);
        System.out.print("Entrer un entier positif n pour afficher les entiers sur l'intervalle [n, n+10[: ");
        Nb = reader.nextInt();

        Even = Nb +10;

        for (i = 0; Nb < Even; i++)
        {
            if (Nb % 2 == 0)
            {
               System.out.printf("La nombre pair #%d de la serie est : %d  \n", i, Nb);
               Nb += 2;
            }
            else
                Nb += 1;
        }
    }
}