package command;

import exception.InterruptOperationException;

/**
 * Created by s.sergienko on 20.07.2016.
 */
interface Command {

    void execute() throws InterruptOperationException;
}
