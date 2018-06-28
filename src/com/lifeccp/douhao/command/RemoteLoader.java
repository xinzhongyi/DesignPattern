package com.lifeccp.douhao.command;

import com.lifeccp.douhao.command.commands.GarageDoorDownCommand;
import com.lifeccp.douhao.command.commands.GarageDoorOpenCommand;
import com.lifeccp.douhao.command.commands.LightOffCommand;
import com.lifeccp.douhao.command.commands.LightOnCommand;
import com.lifeccp.douhao.command.remote.RemoteControl;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/28
 * Time: 16:34
 * Description:
 * \
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl() ;
        Light light = new Light() ;
        GarageDoor garageDoor = new GarageDoor() ;

        LightOnCommand lightOnCommand = new LightOnCommand(light) ;
        LightOffCommand lightOffCommand = new LightOffCommand(light) ;

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor) ;
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor) ;

        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommand(1,garageDoorOpenCommand,garageDoorDownCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
