package com.crm.contacts.infrastructure;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.crm.contacts.domain.Command;

@Service
public class CommandBus {

    private ApplicationContext context;
    HashMap<Class<? extends Command>, Class<? extends com.crm.contacts.domain.CommandHandler>> commands = new HashMap<Class<? extends Command>, Class<? extends com.crm.contacts.domain.CommandHandler>>();

    public CommandBus(ApplicationContext context) {
        this.context = context;
    }

    public void registerHandler(Class<? extends Command> command, Class<? extends com.crm.contacts.domain.CommandHandler> handler) {
        this.commands.put(command, handler);
    }

    public void dispatch(Command command) {
        var commandHandler = commands.get(command.getClass());
        var commandHandlerInstance = context.getBean(commandHandler);
        commandHandlerInstance.handle(command);
        
    }
}
