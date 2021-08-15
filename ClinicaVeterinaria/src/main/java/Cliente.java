/**
 *
 * @author Victor Calebe
 */
public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String cep;
    private String email;

    public Cliente(String nome, String endereco, String telefone, String cep, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
