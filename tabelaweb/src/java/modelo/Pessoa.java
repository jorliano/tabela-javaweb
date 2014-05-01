/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


/**
 *
 * @author Oliveira
 */
@Entity
@Table(name = "cadastro")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private float renda;    
    @Column(name = "data_cadastro")    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpl) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
}
