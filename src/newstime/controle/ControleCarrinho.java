package newstime.controle;

import javax.swing.JOptionPane;
import newstime.DAO.BancoDados;
import newstime.DAO.LivroDAO;
import newstime.entidade.ItemPedido;
import newstime.entidade.Livro;
import newstime.entidade.Carrinho;
import newstime.excecao.BancoException;
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
    public void adicionarItem(String isbn, String quantidade) {
        BancoDados bd = new BancoDados();
        LivroDAO lDao = new LivroDAO(bd);
        
        try {
            ItemPedido itemP = new ItemPedido();
            Livro livro = new Livro();
            livro.setIsbn(isbn);
            livro = lDao.buscar(livro);
            itemP.definirItemPedido(livro, Integer.parseInt(quantidade));
            Carrinho.adicionarItem(itemP);
            JOptionPane.showMessageDialog(null,"Item adicionado com sucesso.");
        } catch (NegocioException | BancoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
     * 
     * @param isbn
     * @param quantidade
     */
    public void alterarItem(String isbn, String quantidade) {
        ItemPedido escolhido = null;
        for(ItemPedido ix : Carrinho.getItens()) {
            if(ix.getLivro().getIsbn().equals(isbn)) {
                escolhido = ix;
                break;
            }
        }
        if(escolhido != null) {
            try {
                escolhido.definirItemPedido(escolhido.getLivro(), Integer.parseInt(quantidade));
                Carrinho.alterarItem(escolhido);
                JOptionPane.showMessageDialog(null,"Item alterado com sucesso.");
            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
    
    /**
     * 
     * @param isbn 
     */
    public void retirarItem(String isbn) {
        ItemPedido escolhido = null;
        for(ItemPedido ix : Carrinho.getItens()) {
            if(ix.getLivro().getIsbn().equals(isbn)) {
                escolhido = ix;
                break;
            }
        }
        if(escolhido != null) {
            Carrinho.retirarItem(escolhido);
            JOptionPane.showMessageDialog(null,"Item removido com sucesso.");
        }
    }
    
    /**
     * 
     */
    public void limparCarrinho(){
        Carrinho.limparCarrinho();
    }
}
