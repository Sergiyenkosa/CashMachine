package command;

import logic.Operation;
import exception.InterruptOperationException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by s.sergienko on 20.07.2016.
 */
public class CommandExecutor {

    private CommandExecutor() {
    }

    static Map<Operation, Command> map = new HashMap<>();

    static {
        map = new HashMap<>();
        map.put(Operation.LOGIN, new LoginCommand());
        map.put(Operation.DEPOSIT, new DepositCommand());
        map.put(Operation.INFO, new InfoCommand());
        map.put(Operation.WITHDRAW, new WithdrawCommand());
        map.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation) throws InterruptOperationException {
        map.get(operation).execute();
    }
}
