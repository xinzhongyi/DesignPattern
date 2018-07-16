package com.lifeccp.douhao.proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/16
 * Time: 9:50
 * Description:
 * \
 */
public class ImageProxy implements Icon {

    ImageIcon imageIcon ;
    URL imageURL ;
    Thread retrievalThread ;
    boolean retrieving = false ;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);
        }else{
            g.drawString("Loading CD cover,please wait....", x + 300, y + 190);
            if(!retrieving){
                retrieving = true ;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        imageIcon = new ImageIcon(imageURL,"CD  Cover") ;
                        c.repaint();
                    }
                }) ;
                retrievalThread .start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth() ;
        }else{
            return 800 ;
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return  imageIcon.getIconHeight() ;
        }else{
            return 600 ;
        }
    }
}
