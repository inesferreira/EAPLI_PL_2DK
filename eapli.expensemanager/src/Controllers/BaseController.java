package Controllers;

import Model.ContaCorrente;

public class BaseController {

    ContaCorrente contaCorr = new ContaCorrente("Paulo");

    public BaseController() {
    }

    public float getSaldo() {
        return contaCorr.getSaldo();
    }
}
