package command.ex2;

import command.ex2.light.Light;
import command.ex2.light.LightOffCommand;
import command.ex2.light.LightOnCommand;
import command.ex2.stereo.Stereo;
import command.ex2.stereo.StereoOffWithCDCommand;
import command.ex2.stereo.StereoOnWithCDCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        Stereo gameStereo = new Stereo("Game CD");
        Stereo movieStereo = new Stereo("Movie CD");

        StereoOnWithCDCommand gameStereoOn = new StereoOnWithCDCommand(gameStereo);
        StereoOffWithCDCommand gameStereoOff = new StereoOffWithCDCommand(gameStereo);
        StereoOnWithCDCommand movieStereoOn = new StereoOnWithCDCommand(movieStereo);
        StereoOffWithCDCommand movieStereoOff = new StereoOffWithCDCommand(movieStereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, gameStereoOn, gameStereoOff);
        remoteControl.setCommand(3, movieStereoOn, movieStereoOff);

        System.out.println(remoteControl.toString());
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

    }
}
