package com.lifeccp.douhao.command.commands;

import com.lifeccp.douhao.command.GarageDoor;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/28
 * Time: 15:57
 * Description:
 * \
 */
public class GarageDoorOpenCommand implements Command {

    private String name = "GarageDoor Open Command";

    GarageDoor garageDoor ;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
