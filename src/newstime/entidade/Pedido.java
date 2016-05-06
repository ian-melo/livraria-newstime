package newstime.entidade;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe de entidade que representa o pedido de uma venda
 * @author Ian Melo
 */
public class Pedido {
    /**
     * Itens do pedido
     */
    private ArrayList<ItemPedido> itensPedido;
    /**
     * Cliente do pedido
     */
    private Cliente cliente;
    /**
     * Data e hora do pedido
     */
    private Date dataHora;
    
    
    //GETTERS SETTERS
    /**
     * Retorna os itens do pedido
     * @return Itens do pedido
     */
    public ArrayList<ItemPedido> getItensPedido() {
        return itensPedido;
    }
    /**
     * Define os itens do pedido
     * @param itensPedido Itens do pedido
     */
    public void setItensPedido(ArrayList<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
    /**
     * Retorna o cliente do pedido
     * @return Cliente do pedido
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Define o cliente do pedido
     * @param cliente Cliente do pedido
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Retorna a data e hora do pedido
     * @return Data e hora do pedido
     */
    public Date getDataHora() {
        return dataHora;
    }
    /**
     * Define a data e hora do pedido
     * @param dataHora Data e hora do pedido
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
}
