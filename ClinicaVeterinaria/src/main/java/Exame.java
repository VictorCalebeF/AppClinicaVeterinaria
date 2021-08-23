/**
 *
 * @author Victor Calebe
 */
public class Exame {
    private int idConsulta;
    private String descricao;
     
    public Exame(int idConsulta, String descricao) {
        this.idConsulta = idConsulta;
        this.descricao = descricao;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
    
}
