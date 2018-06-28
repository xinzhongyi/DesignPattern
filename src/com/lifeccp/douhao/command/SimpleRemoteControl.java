package com.lifeccp.douhao.command;

import com.lifeccp.douhao.command.commands.Command;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/28
 * Time: 15:53
 * Description:
 * \
 */
public class SimpleRemoteControl {
    Command slot ;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
