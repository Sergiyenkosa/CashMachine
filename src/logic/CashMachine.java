package logic;

import command.CommandExecutor;
import exception.InterruptOperationException;

import java.util.Locale;

/**
 * Created by s.sergienko on 20.07.2016.
 */
public class CashMachine {

    public static final String RESOURCE_PATH = "resources.";

    public static void main(String[] args) {

        try {

            Locale.setDefault(Locale.ENGLISH);

            CommandExecutor.execute(Operation.LOGIN);

            Operation operation;

            while (true) {
                operation = ConsoleHelper.askOperation();

                CommandExecutor.execute(operation);

            }
        }
        catch (InterruptOperationException e) {

        }


    }
}
