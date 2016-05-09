package newstime.controle;

/**
 * Esta classe controla o cadastro de clientes da livraria, atravez do form Cadastro livro
 * usuarios do sistema sem ser os administradores
 * @author Fábio M.
 */
public class ControleContaCliente {
    
    /**
     * Usuarios do sistema, clientes da loja virtual, poderam efetuar seu cadastro
     * @param email
     */
    public boolean cadastrarCliente(String email, String senha, String nome, String sobrenome, String sexo, String cpf, String dataNascimento, String telefone, String telefoneAlt, String celular, String endereco, boolean promocional){
        return false;//temporario
    }
    
    /**
     * 
     * @param email
     * @param senha 
     */
    public void logar(String email, String senha){
        
    }
    
    public void deslogar(){
        
    }
    
    /**
     * 
     * @param cep
     */
    public void adicionarEndereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado, String cep, String referencia){
        
    }
}
