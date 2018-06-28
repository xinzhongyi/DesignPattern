package com.lifeccp.douhao.command.commands;

import com.lifeccp.douhao.command.Light;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/28
 * Time: 16:32
 * Description:
 * \
 */
public class LightOffCommand implements Command {

    private String name ;

    private Light light ;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
