/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author Paulo Gandra Sousa
 */
@Entity
@Table(name="Expense")
public class Expense extends Movimentos implements Serializable {
    @OneToOne
    @JoinColumn(name="ExpenseType")
    private ExpenseType tipo;
    @OneToOne
    @JoinColumn(name="MEIO_PAGAMENTO")
    private MeioPagamento meioPag;

    protected Expense() {}
    
    public Expense(BigDecimal amount, Date dateOccurred, String descricao, ExpenseType tipo, MeioPagamento mp) {
        super(amount, dateOccurred, descricao);
        this.tipo = tipo;
        this.meioPag = mp;
    }    
 
    public ExpenseType getTipo() {
        return tipo;
    }

    public void setTipo(ExpenseType tipo) {
        this.tipo = tipo;
    }

    public MeioPagamento getMeioPag() {
        return meioPag;
    }

    public void setMeioPag(MeioPagamento meioPag) {
        this.meioPag = meioPag;
    }
    
    @Override
    public String toString() {
        return String.format("%s\nTipo de despesa: %s\nMeio de pagamento: %s", super.toString(), tipo.getName(), meioPag.getDescricao());
    }

}