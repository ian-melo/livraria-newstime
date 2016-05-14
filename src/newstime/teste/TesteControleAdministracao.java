package newstime.teste;
import newstime.controle.ControleAdministracao;
import newstime.entidade.Autor;
import newstime.entidade.Editora;
import newstime.excecao.BancoException;
import newstime.excecao.NegocioException;

/**
 *
 * @author Usuario
 */
public class TesteControleAdministracao {
    public static void main(String[] args) throws NegocioException, BancoException {
            ControleAdministracao controleAdm = new ControleAdministracao();
            
            Autor autor = new Autor();
            Editora editora = new Editora();
            
            //erro não conecta banco
            controleAdm.inserirLivro("111", "titulo", autor, editora , "2222", "categoria", "resumo", "sumario", 33, "44.4", "5.5", "6.6", "7.7", true, true);
            
            
            

    
    }

    
}
