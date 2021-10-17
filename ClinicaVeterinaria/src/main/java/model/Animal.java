package model;

/**
 *
 * @author Victor Calebe
 */
public class Animal {   
    private int id;
    private String nome;
    private int anoNasc;
    private String sexo;// macho femea
    private int idEspecie;
    private int idCliente;

    public Animal(int id, String nome, int anoNasc, String sexo, int idEspecie, int idCliente){
        this.id = id;
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.sexo = sexo;
        this.idEspecie = idEspecie;
        this.idCliente = idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getanoNasc() {
        return anoNasc;
    }

    public void setanoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", anoNasc=" + anoNasc + ", sexo=" + sexo + '}';
    }
    
    
    
    
}