/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

public class aluno {
    public static void main(String[] args) {

    biblioteca Anderson;
    Anderson = new biblioteca();
    
    Anderson.nome = "Anderson Silva";
    Anderson.autor = "Eiichiro Oda";
    Anderson.titulo = "One piece";
    Anderson.editora = "Shonem Jump";
    Anderson.paginas = "110";
    
    Anderson.livros = (0);
    Anderson.limite = (3);
            
    Anderson.emprestar(2);
    Anderson.renovar(1);
    Anderson.devolver(1);
    Anderson.comprar(10);
   }
} 
