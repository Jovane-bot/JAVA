/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class conta00 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean cod = true;
        int repeat = 0;
        double result = 0;
        if (cod = true){
        
        System.out.println("Escolha um produto: 1-BATATA(R$ 7,00) 2-ARROZ(R$ 18,00) 3-FEIJÃO(R$ 12,00) 4-FRANGO(R$ 23,00) ");
        int produto = entrada.nextInt();
        System.out.println("Informe a quantidade do produto em KG:");
        int quant = entrada.nextInt();
       
        double d = 0;
        double conta = 0;
        
        
        
          switch (produto) {
            case 1:
            
                result = 7 * quant;
                d = (result * 10)/100;
                result = result - d;
                System.out.println("Você comprou "+quant+" de BATATA.");
                conta = conta + result;
                cod = false;
               
                
                break;

            case 2:   
                
                result = 18 * quant;
                d = (result * 10)/100;
                result = result - d;
                System.out.println("Você comprou "+quant+" de ARROZ.");
                conta = conta + result;
                cod = false;
                
                break;

            case 3:
                
                result = 12 * quant;
                d = (result * 10)/100;
                result = result - d;
                System.out.println("Você comprou "+quant+" de FEIJÃO.");
                conta = conta + result;
                cod = false;
                
                break;
                
            case 4:
                
                result = 23 * quant;
                d = (result * 10)/100;
                result = result - d;
                System.out.println("Você comprou "+quant+" de FRANGO.");
                conta = conta + result;
                cod = false;
                
                break;

            default:
                System.out.println("ERROR 404");
                
                
                
                
        }}
        System.out.println("NOTA:  R$"+result);
        System.out.println("Deseja REPETIR o programa? 1-SIM | 2-NÃO");
        repeat = entrada.nextInt();
        
        switch(repeat){
            case 1:
                cod = true;
            case 2:
                cod = false;
        }
        
        
       
}}
