/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110341
 */
public class ExpenseTypeRepository {
    // class member
    private static List<ExpenseType> listExpenseType= new ArrayList<ExpenseType>();

    public ExpenseTypeRepository() {}
    
    public void save(ExpenseType expType)
    {
        if (expType==null) throw new IllegalArgumentException();
        listExpenseType.add(expType);
      
    }
    
    private boolean validType(ExpenseType expType){
        boolean valid = false;
        for (int i = 0; i < listExpenseType.size(); i++) {
            //if(expType.get)
        }
        return valid;
    }
}
