//TODO: Logar
package newstime.entidade;

import java.util.Date;

/**
 * Classe de entidade que representa a conta de um funcionário da livraria
 * @author Ian Melo
 */
public class ContaRestrita {
    /**
     * Funcionário da conta
     */
    private static Funcionario funcionario;
    /**
     * Data e hora de entrada
     */
    private static Date dataHoraEntrada;
    /**
     * Data e hora de saída
     */
    private static Date dataHoraSaida;
    
    /**
     * Loga o funcionário na conta
     * @param funcionario Funcionário da conta
     */
    public static void logar(Funcionario funcionario) {
        
    }
    /**
     * Desloga o funcionário da conta
     */
    public static void deslogar() {
        ContaRestrita.funcionario = null;
        ContaRestrita.dataHoraEntrada = null;
        ContaRestrita.dataHoraSaida = null;
    }
    
    //GETTERS SETTERS
    /**
     * Retorna o funcionário da conta
     * @return Funcionário da conta
     */
    public static Funcionario getFuncionario() {
        return funcionario;
    }
    /**
     * Define o funcionário da conta
     * @param funcionario Funcionário da conta
     */
    public static void setFuncionario(Funcionario funcionario) {
        ContaRestrita.funcionario = funcionario;
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
        ContaRestrita.dataHoraEntrada = dataHoraEntrada;
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
        ContaRestrita.dataHoraSaida = dataHoraSaida;
    }
}
