package newstime.controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import newstime.entidade.Cliente;
import newstime.entidade.Conta;
import newstime.entidade.Endereco;
import newstime.excecao.BancoException;
import newstime.excecao.FormatacaoIncorretaException;
import newstime.excecao.NegocioException;

/**
 * Esta classe controla o cadastro de clientes da livraria, atravez do form Cadastro livro
 * usuarios do sistema sem ser os administradores
 * @author Fábio M.
 */
public class ControleContaCliente {
    
    /**
     * Usuarios do sistema, clientes da loja virtual, poderam efetuar seu cadastro
     * @param email
     * @param senha
     * @param nome
     * @param sobrenome
     * @param sexo
     * @param cpf
     * @param dataNascimento
     * @param telefone
     * @param telefoneAlt
     * @param celular
     * @param endereco
     * @param promocional
     * @return
     * @throws NegocioException
     * @throws BancoException 
     * @throws newstime.excecao.FormatacaoIncorretaException 
     */
    
    //public boolean cadastrarCliente(String email, String senha, String nome, String sobrenome, String sexo, String cpf, String dataNascimento, String telefone, String telefoneAlt, String celular, String endereco, boolean promocional) throws NegocioException, BancoException, FormatacaoIncorretaException, ParseException {
    public boolean cadastrarCliente(String email, String senha, String nome, String sobrenome, String sexo, String cpf, String dataNascimento, String telefone, String telefoneAlt, String celular, Endereco endereco, boolean promocional) throws NegocioException, BancoException, FormatacaoIncorretaException, ParseException {
        /* Endereco altera do de tipo String para tipo Endereco */
        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        
        cliente.setEmail(email);
        cliente.setSenha(senha);
        cliente.setNome(nome);
        cliente.setSobrenome(sobrenome);
        cliente.setSexo(sexo);
        cliente.setCpf(cpf);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNasc = formato.parse(dataNascimento);
        cliente.setDataNascimento(dataNasc);
        
        cliente.setTelefone(telefone);
        cliente.setTelefoneAlt(telefoneAlt);
        cliente.setCelular(celular);
        cliente.setEndereco(null);//mudar - temporario
        cliente.setPromocional(promocional);
        
        cliente.setEndereco(endereco);
        
        conta.cadastrar(cliente);//enviando obijeto
        
        
        
        
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
