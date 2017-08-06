/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediary.command;

import view.interactor.PaymentConsoleInteractor;

/**
 *
 * @author Shaheen-Laptop
 */
public class PaymentCommandFactory extends GenericCommandFactory {

    public static PaymentCommandFactory init(PaymentConsoleInteractor interactor) {
        final PaymentCommandFactory command = new PaymentCommandFactory();
        command.addCommand(0, interactor::back);
        command.addCommand(1, interactor::receivePayment);
        command.addCommand(2, interactor::basePayment);
        command.addCommand(3, interactor::viewPayment);
        return command;
    }

}
