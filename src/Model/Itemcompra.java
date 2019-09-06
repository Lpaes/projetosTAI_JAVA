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
public class Itemcompra {
    private int codigo;
    private int quantidade;
    private double valorUnitario;
    private Produto produto;
    private Compra compra;

    public Itemcompra(int codigo, int quantidade, double valorUnitario, Produto produto, Compra compra) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.produto = produto;
        this.compra = compra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
