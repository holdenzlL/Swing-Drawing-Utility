package org.example;

import org.example.gui.arrow.Arrow;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        org.example.gui.arrow.Arrow arrow = new Arrow(200,300,400,321);
        arrow.setArrowhead_end(org.example.gui.arrow.pojo.Arrowhead.line);
        arrow.setLinestyle(org.example.gui.arrow.pojo.Linestyle.dashed);
        arrow.setLineWidth(4);
        arrow.setTriangle_size(15);
        arrow.draw((Graphics2D) g);
    }
}
