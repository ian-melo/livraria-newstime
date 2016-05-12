package newstime.controle;

import newstime.entidade.Autor;
import newstime.entidade.Editora;
import newstime.entidade.Livro;
import newstime.excecao.NegocioException;


/**
 * Está classe controla o cadastro dos livro, verifica se todos os requisitos e 
 * campos estão devidamente preenchidos
 * @author Fábio M.
 */
public class ControleAdministracao {
    /**
     * Atributos
     * @return 
     */
    
    
    
    
    
    /**
     * Metodos
     */
    
    /**
     * Verifica o tipo de conta, se é de cliente ou 
     * funcionario/administrador do sistema
     * @param login
     * @param senha
     */
    public void verificaConta(String login, String senha){
        
    }
    

    
    /**
     * Cadastra os livros
     * deve ser feito depois dos cadastros de autor e editora
     * @param isbn
     * @param autor
     * @param titulo
     * @param editora
     * @param anoPublicacao
     * @param categoria
     * @param resumo
     * @param sumario
     * @param qtdEstoque
     * @param precoVenda
     * @param precoOferta
     * @param precoCusto
     * @param margemLucro
     * @param oferta
     * @param digital
     * @throws newstime.excecao.NegocioException

     */
    public void inserirLivro(String isbn, String titulo, Autor autor, Editora editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital) throws NegocioException{
        //Mudança no diagrama de tipo string autor para tipo Autor autor;
        //Mudança no diagrama de tipo string editora para tipo Editora editora;
      
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        livro.setTitulo(titulo);
        
        livro.setAutor(autor);// objeto tipo autor
        livro.setEditora(editora);
        
        livro.setAnoPublicacao(qtdEstoque);
        livro.setCategoria(Livro.CategoriaLivro.ARTES);//mudar verificar//erro
        
        livro.setResumo(resumo);
        livro.setSumario(sumario);
        livro.setQtdEstoque(qtdEstoque);
        livro.setPrecoVenda(Float.parseFloat(precoVenda));
        livro.setPrecoOferta(Float.parseFloat(precoOferta));
        livro.setPrecoCusto(Float.parseFloat(precoCusto));
        livro.setMargemLucro(Float.parseFloat(margemLucro));
        livro.setOferta(oferta);
        livro.setDigital(digital);
        
       
    }
    
    
    public void buscarLivro(String isbn){
        
    }
    
    public void alterarLivro(String isbn, String titulo, String autor, String editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital){
        
    }
    
    public void removerLivro(){
        
    }
}
