/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        int c= 0;
        System.out.println("digite: 3, 4 ou 5: ");
        int codigo = entrada.nextInt();
        System.out.println("Informe o valor de a e b");
        int a = entrada.nextInt();
        int b =entrada.nextInt();
        
        switch (codigo) {
            case 3:
                c =a+b;
                System.out.println( c+(c*20)/100);
                
                       
                a = a+b;
                System.out.println(a=a+(a*20)/100);
                
                break;

            case 4:   
                c = b-a;
                System.out.println(c+(c*20)/100);
                
                 
                a =b-a;
                System.out.println(a=a+(a*20)/100);
                break;

            case 5:
                c = a+a;
                System.out.println(c-(c*5)/100);
                
                
                a = a+a;
                System.out.println(a=a-(a*5)/100);
                break;

            default:
                System.out.println("ERROR 404");
                
                
                
        }

    }   
}
