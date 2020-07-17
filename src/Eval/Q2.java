package Eval;

import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
// Calcule et ecrit le produit des N premiers nombres impairs
    //Variable
        int Nb;
        int i;
        int Odd;
        int Produit;

        Produit = 1;
        Odd = 3;

        Scanner reader = new Scanner(System.in);
        System.out.print("Entrer un entier positif n pour afficher le produit des n premiers entiers ");
        Nb = reader.nextInt();



        for (i = 0; i < Nb; i++)
        {
               System.out.printf("Le produit #%d de la suite est : %d  \n", i+1, Produit);
               Produit *= (Odd);
               Odd += 2;
        }
    }
}