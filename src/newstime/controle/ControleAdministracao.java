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
    private String titulo;
    private int anoPublicacao;
    private String resumo;
    private String sumario;
    private int qtdEstoque;
    private float precoVenda;
    private float precoOferta;
    private float precoCusto;
    private float margemLucro;
    private String isbn;
    private String nomeAutor;
    private String nomeEditora;
    private String categoria;
    private boolean digital;
    private boolean oferta;

    public String getTitulo() {
        return titulo;
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

    public String getIsbn() {
        return isbn;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDigital() {
        return digital;
    }

    public boolean isOferta() {
        return oferta;
    }
    
    /**
     * Verifica se o login e senha do administrador batem
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
     * @return 
     * @throws newstime.excecao.NegocioException
     * @throws newstime.excecao.BancoException
     */
    public boolean inserirLivro(String isbn, String titulo, String autor, String editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital) throws NegocioException, BancoException{
        BancoDados bd = new BancoDados();
        AutorDAO autorDAO = new AutorDAO(bd);
        EditoraDAO editoraDAO = new EditoraDAO(bd);
        LivroDAO livroDAO = new LivroDAO(bd);
        
        //Busca autor, caso não encontre, insere e busca
        Autor au = new Autor();
        au.setNome(autor);
        try {
            au = autorDAO.buscar(au);
        } catch(BancoException ex) {
            autorDAO.inserir(au);
            au = autorDAO.buscar(au);
        }
        
        //Busca editora, caso não encontre, insere e busca
        Editora ed = new Editora();
        ed.setNome(editora);
        try {
            ed = editoraDAO.buscar(ed);
        } catch(BancoException ex) {
            editoraDAO.inserir(ed);
            ed = editoraDAO.buscar(ed);
        }
        
        //Define e insere livro
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        livro.setTitulo(titulo);
        livro.setAnoPublicacao(Integer.parseInt(anoPublicacao));
        livro.setCategoria(Livro.CategoriaLivro.valueOf(categoria));
        livro.setResumo(resumo);
        livro.setSumario(sumario);
        livro.setQtdEstoque(qtdEstoque);
        livro.setPrecoVenda(Float.parseFloat(precoVenda));
        livro.setPrecoOferta(Float.parseFloat(precoOferta));
        livro.setPrecoCusto(Float.parseFloat(precoCusto));
        livro.setMargemLucro(Float.parseFloat(margemLucro));
        livro.setOferta(oferta);
        livro.setDigital(digital);
        livro.setAutor(au);// seta o objeto autor dentro de livro
        livro.setEditora(ed);//seta o objeto editora dentro de livro
        
        livroDAO.inserir(livro);
        return true;
    }
    
    public void inserirAutor(String nome, String codigo, String localNasc, String localMorte, String dataNasc, String dataMorte) throws ParseException, BancoException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Autor autor = new Autor();
        autor.setNome(nome);
        autor.setCodigo(codigo);
        autor.setLocalNasci(localNasc);
        autor.setLocalMorte(localMorte);
        
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
        BancoDados bd = new BancoDados();
        LivroDAO livroDAO = new LivroDAO(bd);
        AutorDAO autorDAO = new AutorDAO(bd);
        EditoraDAO editoraDAO = new EditoraDAO(bd);
        
        //Busca livro (ISBN)
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        livro = livroDAO.buscar(livro);
        
        //Puxa autor
        Autor autor = new Autor();
        autor.setID(livro.getID_AUTOR());
        autor = autorDAO.buscarId(autor);
        
        //Puxa editora
        Editora editora = new Editora();
        editora.setID(livro.getID_EDITORA());
        editora = editoraDAO.buscarId(editora);
        
        //Define resultados
        this.titulo = livro.getTitulo();
        this.anoPublicacao = livro.getAnoPublicacao();
        this.resumo = livro.getResumo();
        this.sumario = livro.getSumario();
        this.qtdEstoque = livro.getQtdEstoque();
        this.precoVenda = livro.getPrecoVenda();
        this.precoOferta = livro.getPrecoOferta();
        this.precoCusto = livro.getPrecoCusto();
        this.margemLucro = livro.getMargemLucro();
        this.isbn = livro.getIsbn();
        this.categoria = livro.getCategoria().toString();
        this.nomeAutor = autor.getNome();
        this.nomeEditora = editora.getNome();
        this.oferta = livro.isOferta();
        this.digital = livro.isDigital();
    }
    
    public boolean alterarLivro(String isbn, String titulo, String autor, String editora, String anoPublicacao, String categoria, String resumo, String sumario, int qtdEstoque, String precoVenda, String precoOferta, String precoCusto, String margemLucro, boolean oferta, boolean digital) throws BancoException, NegocioException{
        BancoDados bd1 = new BancoDados();
        LivroDAO livroDAO = new LivroDAO(bd1);
        AutorDAO autorDAO = new AutorDAO(bd1);
        EditoraDAO editoraDAO = new EditoraDAO(bd1);
        
        //Busca livro, se não existir, pára
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        livro = livroDAO.buscar(livro);
        
        //Altera autor
        Autor au = new Autor();
        au.setID(livro.getID_AUTOR());
        au.setNome(autor);
        autorDAO.alterar(au);
        
        //Altera editora
        Editora ed = new Editora();
        au.setID(livro.getID_EDITORA());
        ed.setNome(editora);
        editoraDAO.alterar(ed);
        
        //Altera livro
        livro.setIsbn(isbn);
        livro.setTitulo(titulo);
        livro.setAnoPublicacao(Integer.parseInt(anoPublicacao));
        livro.setCategoria(Livro.CategoriaLivro.valueOf(categoria));
        livro.setResumo(resumo);
        livro.setSumario(sumario);
        livro.setQtdEstoque(qtdEstoque);
        livro.setPrecoVenda(Float.parseFloat(precoVenda));
        livro.setPrecoOferta(Float.parseFloat(precoOferta));
        livro.setPrecoCusto(Float.parseFloat(precoCusto));
        livro.setMargemLucro(Float.parseFloat(margemLucro));
        livro.setOferta(oferta);
        livro.setDigital(digital);
        livro.setAutor(au);
        livro.setEditora(ed);
        
        livroDAO.alterar(livro);
        return true;
    }
    
    public void removerLivro(String isbn) throws BancoException{
        BancoDados bd = new BancoDados();
        LivroDAO livroDAO = new LivroDAO(bd);
        
        //Busca livro, se não existir, pára
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        livro = livroDAO.buscar(livro);
        
        //Exclui
        livroDAO.excluir(livro);
        
        //NOTA: Para segurança, não foi excluído autor e editora
    }
}
