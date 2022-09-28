/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Aluno
 */
public class biblioteca {

    String nome;
    String autor;
    String titulo;
    String editora;
    String paginas;
    
    int estoque = 23;
    
    int livros;
    int limite;
    
    void emprestar(int quantidade) {
        System.out.println("---EMPRESTAR---");
        if (this.limite < (quantidade + this.livros)){ //verifica o limite
                               
            System.out.println("Você só pode pegar mais "+this.limite+" livros.");
        } else {
            this.livros += quantidade;   
            System.out.println("Você vai pegar "+quantidade+" livros.");
            System.out.println("Agora você tem "+this.livros+" livros.");
        }
       
    }

    void renovar(int quantidade) {
        System.out.println("---RENOVAR---");
        if (quantidade > this.livros){
            System.out.println("Você não tem tanto livros assim, você tem apenas "+this.livros+" livros.");
        } else {
            System.out .println("Ótimo, você renovou "+quantidade+" livros.");
        }
    }
    
    void devolver(int quantidade) {
        System.out.println("---DEVOLVER---");
        if (quantidade > this.livros){
            System.out.println("Você não tem tanto livros assim, você tem apenas "+this.livros+" livros.");
        } else if (quantidade == 0){
            System.out.println("Você não tem nenhum livro ainda.");
        } else {
            System.out.println("Você vai devolver "+quantidade+" livros, agora você tem "+this.livros+" livros.");
        }
    }

    void comprar(int quantidade) {
        System.out.println("---COMPRAR LIVROS---");
        if (this.estoque < 30){
            this.estoque += quantidade;
            System.out.println(quantidade+" livros foram comprados para a biblioteca.");
            
        }
        System.out.println("Estoque atual de livros: "+this.estoque);
    }

    
    
    
    
}
