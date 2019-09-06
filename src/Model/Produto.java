/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucas.64325
 */
public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double precocompra;
    private double precovenda;

    public Produto(int codigo, String nome, int quantidade, double precocompra, double precovenda) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precocompra = precocompra;
        this.precovenda = precovenda;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(double precocompra) {
        this.precocompra = precocompra;
    }

    public double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }
    
}
