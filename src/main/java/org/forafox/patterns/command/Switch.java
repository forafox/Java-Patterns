package org.forafox.patterns.command;
/*the Invoker class*/
public class Switch {
    private final Command flipUpCommand;
    private final Command flipDownCommand;

    public Switch(Command flipUpCommand,Command flipDownCommand){
        this.flipUpCommand=flipUpCommand;
        this.flipDownCommand=flipDownCommand;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }

    public void flipDown(){
        flipDownCommand.execute();
    }
}
