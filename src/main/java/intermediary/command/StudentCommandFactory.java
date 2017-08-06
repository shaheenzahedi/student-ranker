/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediary.command;

import view.interactor.StudentConsoleInteractor;


/**
 *
 * @author Shaheen-Laptop
 */
public final class StudentCommandFactory extends GenericCommandFactory {

    /* Factory pattern */
    public static StudentCommandFactory init(StudentConsoleInteractor interactor) {
        final StudentCommandFactory command = new StudentCommandFactory();
        command.addCommand(0, interactor::back);
        command.addCommand(1, interactor::add);
        command.addCommand(2, interactor::update);
        command.addCommand(3, interactor::search);
        command.addCommand(4, interactor::delete);
        command.addCommand(5, interactor::showAll);
        return command;
    }
}
