package interefaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * 回调
 */
public class Timer {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        javax.swing.Timer t = new javax.swing.Timer(3000, listener);
        t.start();
        JOptionPane.showMessageDialog(null,"退出？");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("当前时间" + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
