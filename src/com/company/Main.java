package com.company;

public class Main {

    public static void main(String[] args) {
        // EXERCICES VARIABLES
        int nbr;
        float comp;
        float dec;
        String str;
        boolean piece;

        nbr = 10;
        comp = 0f;
        dec = 9.4f;
        str = "Eh dis donc, Jamy !";
        piece = true;
        System.out.println("Hello World, bitchies !");
        System.out.println("nbr est égal à: " + nbr);
        System.out.println("dec est égal à: " + dec);
        System.out.println("str est égal à: " + str);
        System.out.println("piece est égal à: " + piece);
        System.out.println();

        nbr = 2 * nbr + 3;
        System.out.println("2 * nbr + 3 est égal à : " + nbr);
        nbr = (nbr - 5) / 2 % 3 + 9;
        System.out.println("(nbr - 5) / 2 % 3 + 9 est égal à " + nbr);
        comp = nbr / 2;
        System.out.println("nbr / 2 = " + comp);
        //Un int impair divisé par 2 affiche un float qui s'arrête à l'unité.0
        comp = dec / 2;
        System.out.println("dec / 2 = " + comp);
        //un float divisé par 2 donne un float qui s'arrête net ou au nombre maximal de digit flottant


        //EXERCICE CONDITION
        int grd;
        int myn;
        int pti;

        grd = 0;
        myn = 0;
        pti = 0;

        System.out.println();
        if      (pti < grd && pti < myn)
            System.out.println("pti est le nombre le plus petit");
        else if (myn < grd && myn < pti)
            System.out.println("myn est le nombre le plus petit");
        else if (grd < myn && grd < pti)
            System.out.println("grd est le nombre le plus petit");
        else if (pti == grd && pti < myn)
            System.out.println("pti et grd sont les nombres les plus petits");
        else if (myn == grd && myn < pti)
            System.out.println("myn et grd sont les nombres les plus petits");
        else if (myn == pti && myn < grd)
            System.out.println("myn et pti sont les nombres le plus petits");
        else
            System.out.println("Tous les nombres sont égaux");

        int sign1;
        int sign2;

        sign1 = -10;
        sign2 = -12;
        System.out.println();
        if ((sign1 >= 0 && sign2 >= 0) || (sign1 < 0 && sign2 < 0))
            System.out.println("Le signe de sign1 * sign2 est positif");
        else
            System.out.println("Le signe de sign1 * sign2 est négatif");

        int age;

        age = 14;
        System.out.println();
        if (age >= 18)
            System.out.println("Cette personne est légale =3");
        else
            System.out.println("Cette personne est illégale :/");

        int notebac;

        notebac = 42;
        System.out.println();
        if (notebac < 10)
            System.out.println("T'as pas l'niveau !");
        if (notebac >= 10 && notebac < 13)
            System.out.println("Bac sans mention");
        if (notebac >= 13 && notebac < 16)
            System.out.println("Mention Assez-Bien");
        if (notebac >= 16 && notebac < 18)
            System.out.println("Mention Très Bien");
        if (notebac >= 18 && notebac < 20)
            System.out.println("Mention Excellente");
        if (notebac == 20)
            System.out.println("Mention Parfaite");
        if (notebac > 20)
            System.out.println("T'as niqué le game putain");
        if (notebac == 42)
            System.out.println("CETTE PERSONNE EST UN GENIE BORDEL");

        int pairimpair;

        pairimpair = 53;
        System.out.println();
        if (pairimpair % 2 == 0)
            System.out.println("pairimpair est pair");
        else
            System.out.println("pairimpair est impair");

        int annee;
        int mois;
        int jour;

        annee = 1900;
        mois = 02;
        jour = 29;
        System.out.println();
        if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0))
            System.out.println("L'année " + annee + " est bissextile");
        else
            System.out.println("L'année " + annee + " est normale");

        System.out.println();
        if (annee >= 0) {
            if (mois >= 1 && mois <= 12)
            {
                if ((mois % 2 == 1 || mois == 8) && jour >= 1 && jour <= 31)
                    System.out.println("La date " + jour + "/" + mois + "/" + annee + " est valide");
                else if (mois % 2 == 0 && mois != 2 && mois != 7 && jour >= 1 && jour <= 30)
                    System.out.println("La date " + jour + "/" + mois + "/" + annee + " est valide");
                else if (mois == 2) {
                    if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0))
                    {
                        if (jour >= 1 && jour <= 29)
                            System.out.println("La date " + jour + "/" + mois + "/" + annee + " est valide");
                        else
                            System.out.println("La date " + jour + "/" + mois + "/" + annee + " est invalide");
                    }
                    else if (jour >= 1 && jour <= 28)
                        System.out.println("La date " + jour + "/" + mois + "/" + annee + " est valide");
                    else
                        System.out.println("La date " + jour + "/" + mois + "/" + annee + " est invalide");
                }
            }
        }
        else
            System.out.println("La date " + jour + "/" + mois + "/" + annee + " est invalide");
    }
}