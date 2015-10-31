/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprojeto.entity;

/**
 *
 * @author farah
 */
public class Cliente implements Comparable{

    private String nome;
    private Bairro bairro;

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    @Override
    public int compareTo(Object t) {
        return this.getNome().compareTo(((Cliente) t).getNome());
    }
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
