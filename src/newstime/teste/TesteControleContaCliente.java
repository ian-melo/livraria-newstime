package newstime.teste;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import newstime.controle.ControleContaCliente;
import newstime.excecao.BancoException;
import newstime.excecao.FormatacaoIncorretaException;
import newstime.excecao.NegocioException;


/**
 *
 * @author Fabio
 */
public class TesteControleContaCliente {
     public static void main(String[] args){
         ControleContaCliente controleCliente = new  ControleContaCliente();
         
         try {
             //String email, String senha, String nome, String sobrenome, String sexo, String cpf, String dataNascimento, String telefone, String telefoneAlt, String celular, String endereco, boolean promocional) throws NegocioException, BancoException, FormatacaoIncorretaException, ParseException {

             controleCliente.cadastrarCliente("teste@teste.com", "senha1234", "nomeC", "SobreNome", "F", "111.111.111-11", "11/11/2000", "(11)1111-1111", "(11)1111-1111", "(11)1111-1111", "Endereco", true);
         
         
         
         
         } catch (NegocioException | BancoException | FormatacaoIncorretaException | ParseException ex) {
             Logger.getLogger(TesteControleContaCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}
