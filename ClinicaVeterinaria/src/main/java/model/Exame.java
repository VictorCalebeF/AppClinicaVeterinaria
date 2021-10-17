package model;

/**
 *
 * @author Victor Calebe
 */
public class Exame {
    private int id;
    private int idConsulta;
    private String nome;
     
    public Exame(String nome, int idConsulta) {
        this.id = id;
        this.idConsulta = idConsulta;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }
    
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String nome) {
        this.nome = nome;
    }
   
    
}
