package com.stockTickr;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Adcomp on 10/17/2014.
 */
public class Gooey extends JFrame{

    public Gooey(String thing){

        JLabel item1 = new JLabel(thing);
        setLayout(new FlowLayout());
        add(item1);
    }
}
