package newstime.entidade;

import java.util.Date;

/**
 * Classe de entidade que representa o autor de um livro
 * @author Ian Melo
 */
public class Autor {
    /**
     * Nome do autor
     */
    private String nome;
    /**
     * Data de nascimento do autor
     */
    private Date dataNasci;
    /**
     * Data de morte do autor (se houver)
     */
    private Date dataMorte;
    /**
     * Local de nascimento do autor
     */
    private String localNasci;
    /**
     * Local de morte do autor (se houver)
     */
    private String localMorte;
    
    
    //GETTERS SETTERS
    /**
     * Retorna o nome do autor
     * @return Nome do autor
     */
    public String getNome() {
        return nome;
    }
    /**
     * Define o nome do autor
     * @param nome Nome do autor
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Retorna a data de nascimento do autor
     * @return Data de nascimento do autor
     */
    public Date getDataNasci() {
        return dataNasci;
    }
    /**
     * Define a data de nascimento do autor
     * @param dataNasci Data de nascimento do autor
     */
    public void setDataNasci(Date dataNasci) {
        this.dataNasci = dataNasci;
    }
    /**
     * Retorna a data de morte do autor (se houver)
     * @return 
     */
    public Date getDataMorte() {
        return dataMorte;
    }
    /**
     * Define a data de morte do autor (se houver)
     * @param dataMorte Data de morte do autor
     */
    public void setDataMorte(Date dataMorte) {
        this.dataMorte = dataMorte;
    }
    /**
     * Retorna o local de nascimento do autor
     * @return Local de nascimento do autor
     */
    public String getLocalNasci() {
        return localNasci;
    }
    /**
     * Define o local de nascimento do autor
     * @param localNasci Local de nascimento do autor
     */
    public void setLocalNasci(String localNasci) {
        this.localNasci = localNasci;
    }
    /**
     * Retorna o local de morte do autor (se houver)
     * @return Local de morte do autor
     */
    public String getLocalMorte() {
        return localMorte;
    }
    /**
     * Define o local de morte do autor
     * @param localMorte Local de morte do autor
     */
    public void setLocalMorte(String localMorte) {
        this.localMorte = localMorte;
    }
    
}
