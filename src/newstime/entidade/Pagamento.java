package newstime.entidade;

/**
 * Classe de entidade que representa o pagamento da venda
 * @author Ian Melo
 */
public class Pagamento {
    /**
     * Tipos de pagamento existentes
     */
    public static enum TipoPagamento {
        /**
         * Cartão de débito
         */
        DEBITO,
        /**
         * Cartão de crédito
         */
        CREDITO,
        /**
         * Boleto bancário
         */
        BOLETO
    }
    
    /**
     * Número de parcelas restantes do pagamento
     */
    private int parcelaRestante;
    /**
     * Forma de pagamento do pagamento
     */
    private TipoPagamento forma;
    /**
     * Número de parcelas definidas do pagamento (1, se for à vista)
     */
    private int numParcelas;
    
    
    //GETTERS SETTERS
    /**
     * Retorna o número de parcelas restantes do pagamento
     * @return Número de parcelas restantes do pagamento
     */
    public int getParcelaRestante() {
        return parcelaRestante;
    }
    /**
     * Define o número de parcelas restantes do pagamento
     * @param parcelaRestante Número de parcelas restantes do pagamento
     */
    public void setParcelaRestante(int parcelaRestante) {
        this.parcelaRestante = parcelaRestante;
    }
    /**
     * Retorna a forma de pagamento do pagamento
     * @return Forma de pagamento do pagamento
     */
    public TipoPagamento getForma() {
        return forma;
    }
    /**
     * Define a forma de pagamento do pagamento
     * @param forma Forma de pagamento do pagamento
     */
    public void setForma(TipoPagamento forma) {
        this.forma = forma;
    }
    /**
     * Retorna o número de parcelas definidas do pagamento (1, se for à vista)
     * @return Número de parcelas definidas do pagamento
     */
    public int getNumParcelas() {
        return numParcelas;
    }
    /**
     * Define o número de parcelas definidas do pagamento (1, se for à vista)
     * @param numParcelas Número de parcelas definidas do pagamento
     */
    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }
    
}
