
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
class cal implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;
    Color DarkcB, DarkcW, Darkccontrol, DarkcNum, DarkcOperator, DarkcEqual, DarkcOperator2, lighcOperator2, lighcEqual, lighcOperator, lighcNum, lighccontrol, lighcW, lightcB;
    MenuItem mi1, mi2, mi5, mi6;
    GridLayout g1;
    Panel p1, p2;
    TextField tf;
    
    
    
    String fv, sv, op;
    double fdv, sdv, tot;

    cal() {

        Frame f1 = new Frame();

        f1.setBackground(Color.GRAY);
        f1.addWindowListener(new close());
        f1.setBounds(500, 200, 400, 500);
        f1.setTitle("Calculator");

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        MenuBar mbar = new MenuBar();
//menuItems
        MenuItem mi1 = new MenuItem("Dark");
        MenuItem mi2 = new MenuItem("Light");;
        MenuItem mi5 = new MenuItem("Help");
        MenuItem mi6 = new MenuItem("About");

        
        
        //Theme Changing Point
        mi1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                
                b1.setForeground(DarkcW);
                b1.setBackground(DarkcNum);

                b2.setForeground(DarkcW);
                b2.setBackground(DarkcNum);

                b3.setForeground(DarkcW);
                b3.setBackground(DarkcNum);

                b4.setForeground(DarkcW);
                b4.setBackground(DarkcNum);

                b5.setForeground(DarkcW);
                b5.setBackground(DarkcNum);

                b6.setForeground(DarkcW);
                b6.setBackground(DarkcNum);

                b7.setForeground(DarkcW);
                b7.setBackground(DarkcNum);

                b8.setForeground(DarkcW);
                b8.setBackground(DarkcNum);

                b9.setForeground(DarkcW);
                b9.setBackground(DarkcNum);

                b10.setForeground(DarkcW);
                b10.setBackground(DarkcNum);

                b11.setForeground(DarkcW);
                b11.setBackground(DarkcNum);

                b12.setForeground(DarkcW);
                b12.setBackground(Darkccontrol);

                b13.setForeground(DarkcW);
                b13.setBackground(DarkcOperator);

                b14.setForeground(DarkcW);
                b14.setBackground(DarkcOperator);

                b15.setForeground(DarkcW);
                b15.setBackground(DarkcOperator);

                b16.setForeground(DarkcW);
                b16.setBackground(DarkcOperator);

                b17.setBackground(DarkcEqual);
                b17.setForeground(DarkcW);

                b18.setForeground(DarkcW);
                b18.setBackground(DarkcOperator2);

                b19.setForeground(DarkcW);
                b19.setBackground(DarkcOperator2);

                b20.setForeground(DarkcW);
                b20.setBackground(DarkcNum);

                tf.setForeground(DarkcW);
                tf.setBackground(DarkcB);

                p1.setBackground(DarkcB);
                p2.setBackground(DarkcB);

            }

        });

        mi2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                b1.setForeground(lighcW);
                b1.setBackground(lighcNum);

                b2.setForeground(lighcW);
                b2.setBackground(lighcNum);

                b3.setForeground(lighcW);
                b3.setBackground(lighcNum);

                b4.setForeground(lighcW);
                b4.setBackground(lighcNum);

                b5.setForeground(lighcW);
                b5.setBackground(lighcNum);

                b6.setForeground(lighcW);
                b6.setBackground(lighcNum);

                b7.setForeground(lighcW);
                b7.setBackground(lighcNum);

                b8.setForeground(lighcW);
                b8.setBackground(lighcNum);

                b9.setForeground(lighcW);
                b9.setBackground(lighcNum);

                b10.setForeground(lighcW);
                b10.setBackground(lighcNum);

                b11.setForeground(lighcW);
                b11.setBackground(lighcNum);

                b12.setForeground(lighcW);
                b12.setBackground(lighccontrol);

                b13.setForeground(lighcW);
                b13.setBackground(lighcOperator);

                b14.setForeground(lighcW);
                b14.setBackground(lighcOperator);

                b15.setForeground(lighcW);
                b15.setBackground(lighcOperator);

                b16.setForeground(lighcW);
                b16.setBackground(lighcOperator);

                b17.setBackground(lighcEqual);
                b17.setForeground(lighcW);

                b18.setForeground(lighcW);
                b18.setBackground(lighcOperator2);

                b19.setForeground(lighcW);
                b19.setBackground(lighcOperator2);

                b20.setForeground(lighcW);
                b20.setBackground(lighcNum);

                tf.setForeground(lighcW);
                tf.setBackground(lightcB);

                p1.setBackground(lightcB);
                p2.setBackground(lightcB);

            }

        });

        Font menufont = new Font("Comic Sans MS", Font.ITALIC, 18);

        Menu m1 = new Menu("Theme");
        m1.setFont(menufont);
        m1.add(mi1);
        m1.add(mi2);

        Menu m3 = new Menu("Help");
        m3.setFont(menufont);
        m3.add(mi5);
        m3.add(mi6);

        mbar.add(m1);
        mbar.add(m3);

        f1.setMenuBar(mbar);

        
        //Colors Used in Calculator
        lightcB = new Color(255, 255, 255);
        lighcW = new Color(0, 0, 0);
        lighccontrol = new Color(246, 195, 192);
        lighcNum = new Color(191, 227, 246);
        lighcOperator = new Color(140, 243, 157);
        lighcEqual = new Color(210, 170, 252);
        lighcOperator2 = new Color(181, 180, 182);

        DarkcB = new Color(0, 0, 0);
        DarkcW = new Color(255, 255, 255);
        Darkccontrol = new Color(233, 66, 44);
        DarkcNum = new Color(76, 116, 137);
        DarkcOperator = new Color(16, 139, 21);
        DarkcEqual = new Color(9, 89, 108);
        DarkcOperator2 = new Color(85, 90, 91);

        
        
        //Buttons Used In Calculator
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");

        b11 = new Button(".");
        b12 = new Button("C");
        b13 = new Button("+");
        b14 = new Button("-");
        b15 = new Button("×");
        b16 = new Button("÷");
        b17 = new Button("=");
        b18 = new Button("%");
        b19 = new Button("√");
        b20 = new Button("+/-");

        
        //Fonts Used In Calculator
        Font font1 = new Font("Comic Sans MS", Font.BOLD, 30);

        Font font2 = new Font("Cambria Math", Font.BOLD, 30);

//Setting the Fonts to Buttons
        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);
        b4.setFont(font2);
        b5.setFont(font2);
        b6.setFont(font2);
        b7.setFont(font2);
        b8.setFont(font2);
        b9.setFont(font2);
        b10.setFont(font2);
        b11.setFont(font1);
        b11.setCursor(cursor);
        b12.setFont(font1);
        b12.setCursor(cursor);
        b13.setFont(font1);
        b13.setCursor(cursor);
        b14.setFont(font1);
        b14.setCursor(cursor);
        b15.setFont(font1);
        b15.setCursor(cursor);
        b16.setFont(font1);
        b16.setCursor(cursor);
        b17.setFont(font1);
        b17.setCursor(cursor);
        b18.setFont(font1);
        b18.setCursor(cursor);
        b19.setFont(font1);
        b19.setCursor(cursor);
        b20.setFont(font1);
        b20.setCursor(cursor);


//Calculator Text Field
        tf = new TextField(16);

        Font font = new Font("Georgia", Font.BOLD, 40);

        tf.setFont(font);
        tf.setEditable(false);

//        Panels Used In Calculator
        Panel p1 = new Panel();
        Panel p2 = new Panel();

        GridLayout g1 = new GridLayout(5, 5, 3, 4);

        p1.add(tf);

        p2.setLayout(g1);

        
//        Adding Buttons to the Panel
        p2.add(b12);
        p2.add(b18);
        p2.add(b19);
        p2.add(b16);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b15);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b14);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b13);
        p2.add(b20);
        p2.add(b10);
        p2.add(b11);
        p2.add(b17);

        
//        Decides the Layout of Panels
        f1.add(p1, BorderLayout.PAGE_START);
        f1.add(p2, BorderLayout.CENTER);

        
//        Setting the Environment to Use Buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);

        f1.setVisible(true);

    }

//    Setting Up the Functions of Calculator
    @Override
    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

//        Getting the 0-9 Number Values

        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        } else if (o.equals(b12)) {

            fv = "";
            sv = "";
            tf.setText("");

        } else if (o.equals(b13)) {

            fv = tf.getText();
            tf.setText("");

            op = b13.getLabel();

        } else if (o.equals(b14)) {

            fv = tf.getText();
            tf.setText("");

            op = b14.getLabel();

        } else if (o.equals(b15)) {

            fv = tf.getText();
            tf.setText("");

            op = b15.getLabel();

        } else if (o.equals(b16)) {

            fv = tf.getText();
            tf.setText("");

            op = b16.getLabel();

        } else if (o.equals(b18)) {

            fv = tf.getText();
            tf.setText("");

            op = b18.getLabel();

        } else if (o.equals(b19)) {

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.sqrt(fdv) + "");

        } else if (o.equals(b20)) {

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            if (fdv > 0) {
                fv = "-" + fv;
            } else if (fdv < 0) {
                fdv = fdv * (-1);
                fv = Double.toString(fdv);
            }
            tf.setText(fv);


        } else if (o.equals(b17)) {
            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("-")) {

                tot = fdv - sdv;
                tf.setText(tot + "");

            } else if (op.equals("+")) {

                tot = fdv + sdv;
                tf.setText(tot + "");

            } else if (op.equals("×")) {

                tot = fdv * sdv;
                tf.setText(tot + "");

            } else if (op.equals("÷")) {

                tot = fdv / sdv;
                tf.setText(tot + "");

            } else if (op.equals("%")) {
                tot = ((fdv) / 100) * sdv;
                tf.setText(tot + "");

            }

        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

}

public class Calculator {

    public static void main(String[] args) {

        new cal();

    }

}
