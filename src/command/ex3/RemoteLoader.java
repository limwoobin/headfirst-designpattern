package command.ex3;

import command.ex3.pan.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CellingFan cellingFan = new CellingFan("Living Room");

        CellingFanMediumCommand cellingFanMediumCommand = new CellingFanMediumCommand(cellingFan);
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanLowCommand cellingFanLowCommand = new CellingFanLowCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

        remoteControl.setCommand(0, cellingFanLowCommand, cellingFanOffCommand);
        remoteControl.setCommand(1, cellingFanMediumCommand, cellingFanOffCommand);
        remoteControl.setCommand(2, cellingFanHighCommand, cellingFanOffCommand);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        System.out.println(remoteControl);
    }
}
