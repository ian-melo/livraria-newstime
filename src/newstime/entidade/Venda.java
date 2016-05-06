//TODO: Completar classe
package newstime.entidade;

/**
 * Classe de entidade que representa a venda
 * @author Ian Melo
 */
public class Venda {
    /**
     * Tipos de situação de pagamento da venda
     */
    public static enum PagoVenda{
        /**
         * A venda já foi paga por completo; nenhuma parcela restante ou pago à vista
         */
        SIM,
        /**
         * Não foi realizado o pagamento inicial da venda (1ª parcela) ou o pagamento à vista
         */
        NAO,
        /**
         * Já foi paga uma ou mais parcelas da venda, mas ainda há parcelas a pagar
         */
        PAGANDO
    }
    /**
     * Tipos de status em que a venda pode se encontrar à respeito da entrega do produto e pagamento
     */
    public static enum StatusVenda{
        /**
         * Não foi feito o pagamento total nem parcial da venda
         */
        AGUARDO,
        /**
         * Não foi entregue o produto, mas já houve o pagamento total ou parcial
         */
        ANDAMENTO,
        /**
         * O produto foi entregue e já houve o pagamento total ou parcial
         */
        CONCLUIDO
    }
    
    /**
     * Pedido da venda
     */
    private Pedido pedido;
    /**
     * Endereço da venda
     */
    private Endereco endereco;
    /**
     * Situação de pagamento da venda
     */
    private PagoVenda pago;
    /**
     * Status da venda
     */
    private StatusVenda status;
    /**
     * Pagamento da venda
     */
    private Pagamento pagamento;
    /**
     * Entrega da venda
     */
    private Entrega entrega;
    
    
    //GETTERS SETTERS
    /**
     * Retorna o pedido da venda
     * @return Pedido da venda
     */
    public Pedido getPedido() {
        return pedido;
    }
    /**
     * Define o pedido da venda
     * @param pedido Pedido da venda
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    /**
     * Retorna o endereço da venda
     * @return Endereço da venda
     */
    public Endereco getEndereco() {
        return endereco;
    }
    /**
     * Define o endereço da venda
     * @param endereco Endereço da venda
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    /**
     * Retorna a situação de pagamento da venda
     * @return Situação de pagamento da venda
     */
    public PagoVenda getPago() {
        return pago;
    }
    /**
     * Define a situação de pagamento da venda
     * @param pago Situação de pagamento da venda
     */
    public void setPago(PagoVenda pago) {
        this.pago = pago;
    }
    /**
     * Retorna o status da venda
     * @return Status da venda
     */
    public StatusVenda getStatus() {
        return status;
    }
    /**
     * Define o status da venda
     * @param status Status da venda
     */
    public void setStatus(StatusVenda status) {
        this.status = status;
    }
    /**
     * Retorna o pagamento da venda
     * @return Pagamento da venda
     */
    public Pagamento getPagamento() {
        return pagamento;
    }
    /**
     * Define o pagamento da venda
     * @param pagamento Pagamento da venda
     */
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    /**
     * Retorna a entrega da venda
     * @return Entrega da venda
     */
    public Entrega getEntrega() {
        return entrega;
    }
    /**
     * Define a entrega da venda
     * @param entrega Entrega da venda
     */
    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}