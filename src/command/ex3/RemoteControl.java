package command.ex3;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command emptyCommand = new EmptyCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = emptyCommand;
            offCommands[i] = emptyCommand;
        }

        undoCommand = emptyCommand;
    }

    public void setCommand(int slot , Command onCommand , Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n---------- Remote Control ------------\n");
        for (int i=0; i<onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append(" ").append(offCommands[i].getClass().getName()).append("\n");
        }

        stringBuff.append("[slot ").append("undo").append("] ").append(undoCommand.getClass().getName()).append(" ").append("\n");
        return stringBuff.toString();
    }
}
