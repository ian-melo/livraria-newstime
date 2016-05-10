//TODO: Logar
package newstime.entidade;

import java.util.Date;

/**
 * Classe de entidade que representa a conta de um cliente da livraria
 * @author Ian Melo
 */
public class Conta {
    /**
     * Cliente da conta
     */
    private static Cliente cliente;
    /**
     * Data e hora de entrada
     */
    private static Date dataHoraEntrada;
    /**
     * Data e hora de saída
     */
    private static Date dataHoraSaida;
    
    /**
     * Cadastra o cliente
     * @param cliente Cliente da conta
     */
    public static void cadastrar(Cliente cliente) {
        //IMPLEMENTAR
    }
    /**
     * Loga o cliente na conta
     * @param cliente Cliente da conta
     */
    public static void logar(Cliente cliente) {
        //IMPLEMENTAR
    }
    /**
     * Desloga o cliente da conta
     */
    public static void deslogar() {
        Conta.cliente = null;
        Conta.dataHoraEntrada = null;
        Conta.dataHoraSaida = null;
    }
    
    //GETTERS SETTERS
    /**
     * Retorna o cliente da conta
     * @return Cliente da conta
     */
    public static Cliente getCliente() {
        return cliente;
    }
    /**
     * Define o cliente da conta
     * @param cliente Cliente da conta
     */
    public static void setCliente(Cliente cliente) {
        Conta.cliente = cliente;
    }
    /**
     * Retorna a data e hora de entrada
     * @return Data e hora de entrada
     */
    public static Date getDataHoraEntrada() {
        return dataHoraEntrada;
    }
    /**
     * Define a data e hora de entrada
     * @param dataHoraEntrada Data e hora de entrada
     */
    public static void setDataHoraEntrada(Date dataHoraEntrada) {
        Conta.dataHoraEntrada = dataHoraEntrada;
    }
    /**
     * Retorna a data e hora de saída
     * @return Data e hora de saída
     */
    public static Date getDataHoraSaida() {
        return dataHoraSaida;
    }
    /**
     * Define a data e hora de saída
     * @param dataHoraSaida Data e hora de saída
     */
    public static void setDataHoraSaida(Date dataHoraSaida) {
        Conta.dataHoraSaida = dataHoraSaida;
    }
}
