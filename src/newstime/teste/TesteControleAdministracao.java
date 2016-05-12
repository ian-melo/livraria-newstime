/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newstime.teste.controle;

import newstime.controle.ControleAdministracao;
import newstime.entidade.Autor;
import newstime.entidade.Editora;
import newstime.entidade.Livro;
import newstime.excecao.NegocioException;

/**
 *
 * @author Usuario
 */
public class TesteControleAdministracao {
    public static void main(String[] args) throws NegocioException {
            ControleAdministracao controleAdm = new ControleAdministracao();
            
            Autor autor = new Autor();
            Editora editora = new Editora();
            
            controleAdm.inserirLivro("111", "titulo", autor, editora , "2222", "categoria", "resumo", "sumario", 33, "44.4", "5.5", "6.6", "7.7", true, true);
            /* - IMCOMPLETA - */
            
            
            /* //ERRO(meu)
            Livro l = new Livro();
            
            System.out.println("isbn: " + l.getIsbn());
            System.out.println("Titulo: " + l.getTitulo());
            System.out.println("Resumo: " + l.getResumo());
            System.out.println("Sumario: " + l.getSumario());
            System.out.println("Ano p.: " + l.getAnoPublicacao());
            System.out.println("Categoria: " + l.getCategoria());
            System.out.println("Margem L.: " + l.getMargemLucro());
            System.out.println("Custo: " + l.getPrecoCusto());
            System.out.println("Oferta: " + l.getPrecoOferta());
            System.out.println("Venda: " + l.getPrecoVenda());
            System.out.println("Estoque: " + l.getQtdEstoque());
            System.out.println("Digital: " + l.isDigital());
            System.out.println("Oferta: " + l.isOferta());
       
            /*System.out.println("utor: " + l.getAutor().getDataMorte());
            System.out.println("r: " + l.getAutor().getDataNasci());
            System.out.println("isbn: " + l.getAutor().getLocalMorte());
            System.out.println("isbn: " + l.getAutor().getLocalNasci());
            
         
            System.out.println("isbn: " + l.getEditora().getCnpj());
            System.out.println("isbn: " + l.getEditora().getEndereco());
            System.out.println("isbn: " + l.getEditora().getNome());
            System.out.println("isbn: " + l.getEditora().getTelefone());
    */
    }

    
}
