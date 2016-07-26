package command;

import logic.CashMachine;
import logic.ConsoleHelper;
import exception.InterruptOperationException;

import java.util.ResourceBundle;

/**
 * Created by s.sergienko on 20.07.2016.
 */
class ExitCommand implements Command {

    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "exit_en");

    @Override
    public void execute() throws InterruptOperationException {
        String s;

        do {
            ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));

            s = ConsoleHelper.readString();

            if (s.equals(res.getString("yes"))) {
                ConsoleHelper.writeMessage(res.getString("thank.message"));
                throw new InterruptOperationException();
            }
            else if (s.equals("n")) {
                break;
            }
        }
        while (!s.equals("y"));
    }
}
