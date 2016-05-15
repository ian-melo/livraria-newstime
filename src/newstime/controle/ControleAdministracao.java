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
   
    private String titulo;
    private Autor autor;
    private Editora editora;
    private int anoPublicacao;
    private String resumo;
    private String sumario;
    private int qtdEstoque;
    private float precoVenda;
    private float precoOferta;
    private float precoCusto;
    private float margemLucro;
    private boolean oferta;
    private boolean digital;
    private int ID;
    private int ID_AUTOR;
    private int ID_EDITORA;
    private String isbn;
    private String nomeAutor;
    private String nomeEditora;

    /* - Para pegar o valor do retorno nos formulario - */
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getResumo() {
        return resumo;
    }

    public String getSumario() {
        return sumario;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public float getPrecoOferta() {
        return precoOferta;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public float getMargemLucro() {
        return margemLucro;
    }

    public boolean isOferta() {
        return oferta;
    }

    public boolean isDigital() {
        return digital;
    }

    public int getID() {
        return ID;
    }

    public int getID_AUTOR() {
        return ID_AUTOR;
    }

    public int getID_EDITORA() {
        return ID_EDITORA;
    }
    
    public String getNomeAutor() {
        return nomeAutor;
    }
    
    public String getNomeEditora() {
        return nomeEditora;
    }

    
    
    
    
    
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
     * @param isbn - equivalente ao codigo do livro
     * @param autor - Objeto autor
     * @param titulo - o titulo do livro
     * @param editora - a editora com qual o livro pertence
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
    
    public void buscarLivro(String isbn) throws BancoException{
        //CadastroLivro cdl = new CadastroLivro();//Apenas um teste - apagar
        
        BancoDados bd = new BancoDados();
        LivroDAO livroDAO = new LivroDAO(bd);
        Livro livro = new Livro();
        Livro livroRetorno = new Livro();
        
        livro.setIsbn(isbn);//Envia o isbn do livro
        
        livroRetorno = livroDAO.buscar(livro);//Envia objeto livro e retorna um objeto livroRetorno som o livro caso seje encontrado retorna uma exceção se não for
        
        /* - Objeto Autor - */
        System.out.println("Id autor: " + livroRetorno.getID_AUTOR());
        AutorDAO autorDAO = new AutorDAO(bd);
        Autor autor = new Autor();
        autor.setID(livroRetorno.getID_AUTOR());
        
        autor = autorDAO.buscarId(autor);
        
        System.out.println("______AUTOR_________");
        System.out.println(autor.getCodigo());
        System.out.println(autor.getNome());
        System.out.println(autor.getLocalNasci());
        System.out.println("____________________");
        //Para retornar para o form
        
        
        /* - Objeto Editora - */
         System.out.println("Id editora: " + livroRetorno.getID_EDITORA());
        EditoraDAO editoraDAO = new EditoraDAO(bd);
        Editora editora = new Editora();
        editora.setID(livroRetorno.getID_EDITORA());
        
        editora = editoraDAO.buscarId(editora);
        
        System.out.println("______EDITORA_______");
        System.out.println(editora.getCnpj());
        System.out.println(editora.getNome());
        System.out.println(editora.getTelefone());
        System.out.println("____________________");
        
        
        titulo = livroRetorno.getTitulo();
        //private Autor autor;
        //private Editora editora;
        anoPublicacao = livroRetorno.getAnoPublicacao();
        resumo = livroRetorno.getResumo();
        sumario = livroRetorno.getSumario();
        qtdEstoque = livroRetorno.getQtdEstoque();
        precoVenda = livroRetorno.getPrecoVenda();
        precoOferta = livroRetorno.getPrecoOferta();
        precoCusto = livroRetorno.getPrecoCusto();
        margemLucro = livroRetorno.getMargemLucro();
        this.isbn = livroRetorno.getIsbn();
        nomeAutor = autor.getNome();
        nomeEditora = editora.getNome();
        
        //oferta = livroRetorno.get;
        //digital = livroRetorno.getDigital();
        //ID;
        //ID_AUTOR;
        //ID_EDITORA;
        
       
        
        
        
        
        
        
        //Teste - APAGAR
        System.out.println("Ano Public. " + anoPublicacao);
        System.out.println("-2. " + livroRetorno.getResumo());
        System.out.println("-3. " + livroRetorno.getSumario());
        System.out.println("-4. " + livroRetorno.getMargemLucro());
        System.out.println("-5. " + livroRetorno.getQtdEstoque());
        
        //List<Object> arrayLivro = new ArrayList();//Teste
        

        
        
    }
    
    public void alterarLivro(String isbn, String titulo, String autor, String editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital){
        
    }
    
    public void removerLivro(){
        
    }
}
