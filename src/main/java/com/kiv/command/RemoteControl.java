package com.kiv.command;

public class RemoteControl {
    public void pressButton(){
        command.execute();
    }
    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    private Command command;
}
