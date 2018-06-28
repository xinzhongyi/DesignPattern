package com.lifeccp.douhao.command.commands;

import com.lifeccp.douhao.command.Light;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/28
 * Time: 15:51
 * Description:
 * \
 */
public class LightOnCommand implements Command {

    private String name = "Lignt On Command";

    Light light ;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
