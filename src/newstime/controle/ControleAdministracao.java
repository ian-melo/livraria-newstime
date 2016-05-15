package newstime.controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import newstime.DAO.AutorDAO;
import newstime.DAO.BancoDados;
import newstime.DAO.EditoraDAO;
import newstime.DAO.LivroDAO;
import newstime.entidade.Autor;
import newstime.entidade.Editora;
import newstime.entidade.Livro;
import newstime.excecao.BancoException;
import newstime.excecao.FormatacaoIncorretaException;
import newstime.excecao.NegocioException;


/**
 * Está classe controla o cadastro dos livro, verifica se todos os requisitos e 
 * campos estão devidamente preenchidos
 * @author Fábio M.
 */
public class ControleAdministracao {
    /**
     * Atributos
     * @return 
     */
    
    
    
    
    
    /**
     * Metodos
     */
    
    /**
     * Verifica o tipo de conta, se é de cliente ou 
     * funcionario/administrador do sistema
     * @param login
     * @param senha
     */
    public void verificaConta(String login, String senha){
        
    }
    

    
    /**
     * Cadastra os livros
     * deve ser feito depois dos cadastros de autor e editora
     * @param isbn
     * @param autor
     * @param titulo
     * @param editora
     * @param anoPublicacao
     * @param categoria
     * @param resumo
     * @param sumario
     * @param qtdEstoque
     * @param precoVenda
     * @param precoOferta
     * @param precoCusto
     * @param margemLucro
     * @param oferta
     * @param digital
     * @throws newstime.excecao.NegocioException
     * @throws newstime.excecao.BancoException

     */
    public void inserirLivro(String isbn, String titulo, Autor autor, Editora editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital) throws NegocioException, BancoException{
    //public void inserirLivro(String isbn, String titulo, String autor, String editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital) throws NegocioException, BancoException{
        
        //Mudança no diagrama de tipo string autor para tipo Autor autor;
        //Mudança no diagrama de tipo string editora para tipo Editora editora;
      
        
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        livro.setTitulo(titulo);
        
        livro.setAutor(autor);// objeto tipo autor
        livro.setEditora(editora);
        
        livro.setAnoPublicacao(qtdEstoque);
        livro.setCategoria(Livro.CategoriaLivro.ARTES);//mudar verificar//erro
        
        livro.setResumo(resumo);
        livro.setSumario(sumario);
        livro.setQtdEstoque(qtdEstoque);
        livro.setPrecoVenda(Float.parseFloat(precoVenda));
        livro.setPrecoOferta(Float.parseFloat(precoOferta));
        livro.setPrecoCusto(Float.parseFloat(precoCusto));
        livro.setMargemLucro(Float.parseFloat(margemLucro));
        livro.setOferta(oferta);
        livro.setDigital(digital);
        
       BancoDados bd = new BancoDados();
/*      try {
            //JOptionPane.showMessageDialog(null, bd);
            //System.out.println(bd);
            bd.abrirConexao();
        } catch (BancoException ex) {
            Logger.getLogger(ControleAdministracao.class.getName()).log(Level.SEVERE, null, ex);
        }
    */   
        LivroDAO livroDAO = new LivroDAO(bd);
        livroDAO.inserir(livro);
        
        //bd.fecharConexao();
        
        
    }
    
    public void inserirAutor(String nome, String codigo, String localNasc, String localMorte, String dataNasc, String dataMorte) throws ParseException, BancoException{
        Autor autor = new Autor();
        
        autor.setNome(nome);
        autor.setCodigo(codigo);
        autor.setLocalNasci(localNasc);
        autor.setLocalMorte(localMorte);
         
         
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataMort = formato.parse(dataMorte);
        autor.setDataMorte(dataMort);
        Date dataNasce = formato.parse(dataNasc);
        autor.setDataNasci(dataNasce);
        
        BancoDados bd = new BancoDados();
        AutorDAO autorDAO = new AutorDAO(bd);
        
        autorDAO.inserir(autor);
        
    }
    
    public void inserirEditora(String cnpj, String nomeEdi, String endereco, String telefone) throws FormatacaoIncorretaException, BancoException{
        Editora editora = new Editora();
        
        editora.setCnpj(cnpj);
        editora.setNome(nomeEdi);
        editora.setEndereco(endereco);
        editora.setTelefone(telefone);
        
        BancoDados bd = new BancoDados();
        
        EditoraDAO editoraD = new EditoraDAO(bd);
        editoraD.inserir(editora);
        
        
        
    }
    
    
    
    public void buscarLivro(String isbn){
        
    }
    
    public void alterarLivro(String isbn, String titulo, String autor, String editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital){
        
    }
    
    public void removerLivro(){
        
    }
}
