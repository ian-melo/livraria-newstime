package newstime.controle;

import newstime.entidade.ItemPedido;
import newstime.entidade.Livro;
import newstime.entidade.Carrinho;
import newstime.excecao.NegocioException;

/**
 * Esta classe gerencia o carrinho, podendo ser adicionar e retirado itens do carrinho
 * @author Fabio
 */
public class ControleCarrinho {
    
    
    
    
    /**
     * 
     */
    public void exibirCarrinho(){
        
    }
    
    
    /**
     * 
     * @param isbn
     * @param quantidade 
     */
    public void adicionarItem(String isbn, String quantidade) throws NegocioException{
        Carrinho carrinho = new Carrinho();
        ItemPedido itemP = new ItemPedido();
        Livro livro = new Livro();
        
        livro.setIsbn(isbn);
        
        itemP.definirItemPedido(livro, Integer.parseInt(quantidade));
        carrinho.adicionarItem(itemP);
        
    }
    
    /**
     * 
     * @param isbn
     * @param quantidade 
     */
    public void alterarItem(String isbn, String quantidade) throws NegocioException{
        Carrinho carrinho = new Carrinho();
        ItemPedido itemP = new ItemPedido();
        Livro livro = new Livro();
        
        livro.setIsbn(isbn);
        itemP.definirItemPedido(livro, Integer.parseInt(quantidade));
        carrinho.alterarItem(itemP);
    }
    
    /**
     * 
     * @param isbn 
     */
    public void retirarItem(String isbn) throws NegocioException{
        Carrinho carrinho = new Carrinho();
        ItemPedido itemP = new ItemPedido();
        Livro livro = new Livro();
        
        livro.setIsbn(isbn);
        
        itemP.definirItemPedido(livro, 1);
        carrinho.retirarItem(itemP);
    }
    
    /**
     * 
     */
    public void limparCarrinho(){
        Carrinho carrinho = new Carrinho();
        carrinho.limparCarrinho();
    }
}
