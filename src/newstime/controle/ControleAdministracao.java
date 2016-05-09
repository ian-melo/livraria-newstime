package newstime.controle;


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
     * @param qtdEstoque
     * @param precoVenda
     * @param precoOferta
     * @param precoCusto
     * @param margemLucro
     * @param oferta
     * @param digital

     */
    public void inserirLivro(String isbn, String titulo, String autor, String editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital){
        
    }
    
    
    public void buscarLivro(String isbn){
        
    }
    
    public void alterarLivro(String isbn, String titulo, String autor, String editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital){
        
    }
    
    public void removerLivro(){
        
    }
}
