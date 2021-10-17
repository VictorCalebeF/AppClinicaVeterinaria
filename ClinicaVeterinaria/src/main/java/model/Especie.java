package model;

/**
 *
 * @author Victor Calebe
 */
public class Especie {
    private int id;
    private String Nome;

    public Especie(int id, String Nome) {
        this.id = id;
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public int getId(){
        return id;
    }
    
    
}
