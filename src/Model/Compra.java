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
public class Compra {private int codigo;
    private Date datacompra;
    private double valortotal;
    private Fornecedor fornecedor;
   

    public Compra(int codigo, Date datacompra, double valortotal, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.datacompra = datacompra;
        this.valortotal = valortotal;
        this.fornecedor = fornecedor;
    }

    public Date getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(Date datacompra) {
        this.datacompra = datacompra;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
