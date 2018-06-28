package com.lifeccp.douhao.command.commands;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/28
 * Time: 16:03
 * Description:
 * \
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no opertion");
    }

    @Override
    public void undo() {
        System.out.println("no opertion");
    }
}
