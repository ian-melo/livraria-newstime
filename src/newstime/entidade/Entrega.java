//TODO: VERIFICAR PARA CONFIGURAR DATA EM DIAS ÚTEIS
package newstime.entidade;

import java.util.Date;
import newstime.excecao.NegocioException;

/**
 * Classe de entidade que representa a entrega da venda
 * @author Ian Melo
 */
public class Entrega {
    /**
     * Tipos de entrega existentes
     */
    public static enum TipoEntrega{
        /**
         * Entrega é feita em até 3 dias úteis
         */
        RAPIDA,
        /**
         * Entrega é feita em até 5 dias úteis
         */
        ECONOMICA,
        /**
         * Entrega é feita em uma data agendada acima de 5 dias úteis
         */
        AGENDADA
    }
    
    /**
     * Intervalo mínimo entre a data atual e a data de entrega definido para o do tipo "AGENDADA"
     * (data deve ser acima do intervalo mínimo)
     */
    public static final int INTER_MIN = 5;
    
    /**
     * Tipo de entrega da entrega
     */
    private TipoEntrega tipo;
    /**
     * Preço da entrega
     */
    private float preco;
    /**
     * Data da entrega, se for "AGENDADA"
     */
    private Date dataEntrega;
    
    
    //GETTERS SETTERS
    /**
     * Retorna o tipo de entrega da entrega
     * @return Tipo de entrega da entrega
     */
    public TipoEntrega getTipo() {
        return tipo;
    }
    /**
     * Define o tipo de entrega da entrega
     * @param tipo Tipo de entrega da entrega
     */
    public void setTipo(TipoEntrega tipo) {
        this.tipo = tipo;
    }
    /**
     * Retorna o preço da entrega
     * @return Preço da entrega
     */
    public float getPreco() {
        return preco;
    }
    /**
     * Define o preço da entrega
     * @param preco Preço da entrega
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    /**
     * Retorna a data da entrega, se for "AGENDADA"
     * @return Data da entrega
     */
    public Date getDataEntrega() {
        return dataEntrega;
    }
    /**
     * Define a data da entrega, se for "AGENDADA"
     * @param dataEntrega Data da entrega
     * @throws newstime.excecao.NegocioException Caso não siga a regra estipulada
     */
    public void setDataEntrega(Date dataEntrega) throws NegocioException {
        if(this.validarData(dataEntrega))
            this.dataEntrega = dataEntrega;
        else
            throw new NegocioException("O intervalo da data de entrega deve ser de " + Entrega.INTER_MIN + " dias úteis.");
    }
    
    //VALIDADORES
    /**
     * Verifica se a data da entrega "AGENDADA" é uma data válida dentro do tempo limite
     * @param data Data de entrega
     * @return true, se a data está aceitável pela regra
     * <br/>false, caso contrário
     */
    private boolean validarData(Date data) {
        //Configura para a data limite
        Date d = new Date();
        d.setDate(d.getDate() + INTER_MIN);
        //Verifica se a data está acima do prazo
        if(data.compareTo(d) > 0)
            return true;
        else
            return false;
    }
}
