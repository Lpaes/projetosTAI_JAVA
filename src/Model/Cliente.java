/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author lucas.64325
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private Date datanascimento;

    public Cliente(int codigo, String nome, String cpf, Date datanascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }
    
  
    
    
}
