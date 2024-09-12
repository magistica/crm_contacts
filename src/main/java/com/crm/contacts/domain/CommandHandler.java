package com.crm.contacts.domain;

public interface CommandHandler<T extends Command> {

    public void handle(T command);
}
