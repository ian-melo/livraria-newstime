package newstime.entidade;

import java.util.ArrayList;
import newstime.excecao.NegocioException;

/**
 * Classe de entidade que representa o carrinho de compras
 * @author Ian Melo
 */
public class Carrinho {
    /**
     * Itens do carrinho de compras
     */
    private final ArrayList<ItemPedido> itens = new ArrayList<>();
    
    /**
     * Adiciona o item ao carrinho de compras
     * @param item Item do carrinho de compras
     */
    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }
    /**
     * Altera o item do carrinho de compras
     * @param item Item do carrinho de compras
     * @throws NegocioException Caso haja problema na configuração de quantidade
     */
    public void alterarItem(ItemPedido item) throws NegocioException {
        //Busca a posição
        int p = itens.indexOf(item);
        //Altera o item
        itens.get(p).definirItemPedido(item.getLivro(), item.getQuantidade());
    }
    /**
     * Retira o item do carrinho de compras
     * @param item Item do carrinho de compras
     */
    public void retirarItem(ItemPedido item) {
        itens.remove(item);
    }
    /**
     * Remove todos os itens do carrinho de compras
     */
    public void limparCarrinho() {
        itens.clear();
    }
    
    //GETTERS SETTERS
    /**
     * Retorna os itens do carrinho de compras
     * @return Itens do carrinho de compras
     */
    public ArrayList<ItemPedido> getItens() {
        return itens;
    }   
}