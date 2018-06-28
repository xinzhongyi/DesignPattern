package com.lifeccp.douhao.command.remote;

import com.lifeccp.douhao.command.GarageDoor;
import com.lifeccp.douhao.command.Light;
import com.lifeccp.douhao.command.SimpleRemoteControl;
import com.lifeccp.douhao.command.commands.Command;
import com.lifeccp.douhao.command.commands.GarageDoorOpenCommand;
import com.lifeccp.douhao.command.commands.LightOnCommand;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/28
 * Time: 15:55
 * Description:
 * \
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl() ;
        Light light = new Light() ;
        Command lightOn = new LightOnCommand(light) ;

        GarageDoor garageDoor = new GarageDoor() ;
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor) ;

        remote.setSlot(lightOn);
        remote.buttonWasPressed();

        remote.setSlot(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
