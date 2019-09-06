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
public class Venda {
    private int codigo;
    private Date datavenda;
    private double ValorTotal;

    public Venda(int codigo, Date datavenda, double ValorTotal) {
        this.codigo = codigo;
        this.datavenda = datavenda;
        this.ValorTotal = ValorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
    
}
