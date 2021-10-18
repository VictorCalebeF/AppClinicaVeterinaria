package model;

import model.Animal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Victor Calebe
 */
public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cep;
    private String email;
    
    private List<Animal> animais;
    
    public Cliente(int id, String nome, String endereco, String telefone, String cep, String email){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
        this.animais = new ArrayList<Animal>();
    }

    public int getId(){
        return id;
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
    
    public void setEmail(String email){
        if(!email.equals("")){
            this.email = email;
        }else{
            System.out.println("O campo email esta vazio!");
        }
    }
    
    public void setNome(String nome){
        if(!nome.equals("")){
            this.nome = nome;
        }else{
            System.out.println("O campo nome esta vazio!");
        }
    }
    
    public void setEndereco(String endereco){
        if(!endereco.equals("")){
            this.endereco = endereco;
        }else{
            System.out.println("O campo endereco esta vazio!");
        }
    }
    
    public void setTelefone(String telefone){
        if(!telefone.equals("")){
            this.telefone = telefone;
        }else{
            System.out.println("O campo telefone esta vazio!");
        }
    }
    
    public void setCep(String cep){
        if(!cep.equals("")){
            this.cep = cep;
        }else{
            System.out.println("O campo CEP esta vazio!");
        }
    }
    
    public boolean addAnimal(Animal animal){
        if(!animal.getNome().isEmpty()){
            animais.add(animal);
            return true;
        }
        return false;
    }
    
    public List<Animal> getAnimais(){
        List<Animal> copia = new ArrayList<Animal>(animais);        
        return copia;
    }
    
    @Override
    public String toString() {
        String desc = "Cliente{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", cep=" + cep + ", email=" + email + '}';
        String strAnimais = animais.toString();
        return desc + "\n" + strAnimais;
        
    }
    
    
}
