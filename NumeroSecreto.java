package com.mycompany.numerosecreto;

import java.util.Random;
import java.util.Scanner;
public class NumeroSecreto {

    public static void main(String[] args) {
       Scanner sc1 = new Scanner (System.in);
       Random rd1 = new Random();
       
      int numeroSecreto = rd1.nextInt(1, 11);
       System.out.println("Numero secreto foi gerado, nao mostre ao jogador!");
       int contador = 0;
       int chute;
       boolean acertou = false;
       contador += 1;
       contador += 1;
       contador += 1;
       contador += 1;
       contador += 1;
       contador += 1;
       contador += 1;
       contador += 1;
       contador += 1;
       contador += 1;
       
       do {
          
           System.out.println("Digite um numero entre 1 e 10 e veja se esta correto: ");
           chute = sc1.nextInt();
           
           
           if (chute < numeroSecreto) {
           
               System.out.println("O numero secreto é maior, tente novamente");
           } else if(chute > numeroSecreto) {
               System.out.println("O numero secreto é menor, tente novamente");           
           } else {
               System.out.println("Parabens, você acertou!");
               acertou = true;
           }
       
       
       }while(!acertou);
       
         System.out.println("Contador: " + contador);
         
           
       
        sc1.close(); 
    }
}