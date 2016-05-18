package newstime.controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import newstime.entidade.BuscaLivro;
import newstime.entidade.Livro;
import newstime.excecao.BancoException;


/**
 *Está classe gerencia a busca do livro
 * @author Fábio M.
 */

public class ControleBusca {
     ArrayList<Livro> resultadosBusca = new ArrayList<>();

    public ArrayList<Livro> getResultadosBusca() {
        return resultadosBusca;
    }
    

    /**
     * Vai enviar os parametros para buscar um livro atravez do objeto
     * buscalivro e retornar o livro se caso encontrado
     * @param palChave
     * A palavra chave que será enviada
     * @param criterio
     * O criterio da busca
     * A forma que será organizado
     */
    public void buscarLivro(String palChave, int criterio) throws BancoException{
        BuscaLivro busca = new BuscaLivro();
        Livro l = new Livro();
        ArrayList<Livro> resultados = new ArrayList<>();
        
        
        
        /*
        
        0 = Filtros
        1 = Categoria
        2 = Editora
        3 = Título
        4 = Autor
        5 = ISBN
             
        */
       
     
        
        if (criterio == 1){
           resultados = busca.buscarLivros(palChave, (BuscaLivro.CriterioBusca.CATEGORIA));
        }else if(criterio == 2){
            resultados = busca.buscarLivros(palChave, (BuscaLivro.CriterioBusca.EDITORA));
        }else if(criterio == 3){
            resultados = busca.buscarLivros(palChave, (BuscaLivro.CriterioBusca.TITULO));
        }else if(criterio == 4){
            resultados = busca.buscarLivros(palChave, (BuscaLivro.CriterioBusca.AUTOR));
        }else{
            JOptionPane.showMessageDialog(null, "ERRO - Criterio de busca");
        }

        //BuscaLivro.CriterioBusca.valueOf(valor) ===> Converte
        
        /*
        for(Livro x:resultados) {
            System.out.println("_____________________________________teste_");
            System.out.println(x.getTitulo());
            System.out.println(x.getAutor());
            System.out.println(x.getEditora());
        }
        */
        
        resultadosBusca = resultados;
        
        //JOptionPane.showMessageDialog(null, resultados);
    }
    
    
    
    /* - Organiza por ordem alfabetica - */
    public void buscarLivro(String palChave, int criterio, int organizacao) throws BancoException{
        BuscaLivro busca = new BuscaLivro();
        Livro l = new Livro();
        ArrayList<Livro> resultados = new ArrayList<>();
        
        
        
        /*
        0 = CATEGORIA 
        1 = EDITORA   
        2 = TITULO    
        3 = AUTOR     
        */
        
        /*
        FORMA COMO SERÁ ORGANIZADO  
        0 = ALFA_ASC
        1 = ALFA_DESC,
        2 = PRECO_ASC,
        3 = PRECO_DESC
        */
        
        /*ERRADO E MUITO FEIO*/
        if (criterio == 0){
            if(organizacao == 0){
                 resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.CATEGORIA, BuscaLivro.OrganizacaoBusca.ALFA_ASC);
            }else if(organizacao == 1){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.CATEGORIA, BuscaLivro.OrganizacaoBusca.ALFA_DESC);
            }else if(organizacao == 2){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.CATEGORIA, BuscaLivro.OrganizacaoBusca.PRECO_ASC);
            }else if(organizacao == 3){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.CATEGORIA, BuscaLivro.OrganizacaoBusca.PRECO_DESC);
            }else{
                JOptionPane.showMessageDialog(null, "ERRO - Organização de busca");
            }
          
        }else if(criterio == 1){
            if(organizacao == 0){
                 resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.EDITORA, BuscaLivro.OrganizacaoBusca.ALFA_ASC);
            }else if(organizacao == 1){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.EDITORA, BuscaLivro.OrganizacaoBusca.ALFA_DESC);
            }else if(organizacao == 2){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.EDITORA, BuscaLivro.OrganizacaoBusca.PRECO_ASC);
            }else if(organizacao == 3){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.EDITORA, BuscaLivro.OrganizacaoBusca.PRECO_DESC);
            }else{
                JOptionPane.showMessageDialog(null, "ERRO - Organização de busca");
            }
        }else if(criterio == 2){
            if(organizacao == 0){
                 resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.TITULO, BuscaLivro.OrganizacaoBusca.ALFA_ASC);
            }else if(organizacao == 1){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.TITULO, BuscaLivro.OrganizacaoBusca.ALFA_DESC);
            }else if(organizacao == 2){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.TITULO, BuscaLivro.OrganizacaoBusca.PRECO_ASC);
            }else if(organizacao == 3){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.TITULO, BuscaLivro.OrganizacaoBusca.PRECO_DESC);
            }else{
                JOptionPane.showMessageDialog(null, "ERRO - Organização de busca");
            }
        }else if(criterio == 3){
            if(organizacao == 0){
                 resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.AUTOR, BuscaLivro.OrganizacaoBusca.ALFA_ASC);
            }else if(organizacao == 1){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.AUTOR, BuscaLivro.OrganizacaoBusca.ALFA_DESC);
            }else if(organizacao == 2){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.AUTOR, BuscaLivro.OrganizacaoBusca.PRECO_ASC);
            }else if(organizacao == 3){
                resultados = busca.buscarLivros(palChave, BuscaLivro.CriterioBusca.AUTOR, BuscaLivro.OrganizacaoBusca.PRECO_DESC);
            }else{
                JOptionPane.showMessageDialog(null, "ERRO - Organização de busca");
            }
        }else{
            JOptionPane.showMessageDialog(null, "ERRO - Criterio de busca");
        }


        resultadosBusca = resultados;
        /*
        for(Livro x:resultadosBusca) {
            System.out.println("_____________________________________teste_");
            System.out.println(x.getTitulo());
            System.out.println(x.getAutor());
            System.out.println(x.getEditora());
        }
        */        
        
        //JOptionPane.showMessageDialog(null, resultados);
    }
    

    
    
    
    
    /**
     * Vai retornar o livro q foi encontrado
     * no buscalivro
     */
    public void mostrarLivros(){
        
    }
    
    public void buscarCategoria(String categoria){
        BuscaLivro busca = new BuscaLivro();
        //busca.
    }
}
