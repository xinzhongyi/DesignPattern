package com.lifeccp.douhao.command.commands;

import com.lifeccp.douhao.command.GarageDoor;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/28
 * Time: 16:33
 * Description:
 * \
 */
public class GarageDoorDownCommand implements Command {

    private String name = "GarageDoor Down Command";

    GarageDoor garageDoor ;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
