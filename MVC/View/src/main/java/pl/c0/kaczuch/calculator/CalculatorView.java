package pl.c0.kaczuch.calculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorView extends JFrame
{
    private MainPanel panel;

    static class MainPanel extends JPanel
    {
        private static final int WIDTH = 300;
        private static final int HEIGHT = 150;

        private InputPanel ip;

        private ButtonsPanel bp;

        private LabelPanel lp;

        static private class InputPanel extends JPanel
        {
            private JTextField tf1;
            private JTextField tf2;
            public InputPanel()
            {
                ArrayList<JTextField> list = new ArrayList<>();

                this.tf1 = new JTextField("0");
                this.tf2 = new JTextField("0");

                list.add(tf1);
                list.add(tf2);

                GridLayout l = new GridLayout(1, 3);
                l.setHgap(5);

                this.setLayout(l);
                this.setPreferredSize(new Dimension(150, 20));

                for (JTextField t : list)
                {
                    this.add(t);
                }
            }

            public JTextField getTf1()
            {
                return tf1;
            }
        }

        static private class ButtonsPanel extends JPanel
        {
            private JButton b1;
            private JButton b2;
            private JButton b3;
            private JButton b4;


            public ButtonsPanel()
            {
                ArrayList<JButton> list = new ArrayList<JButton>();
                this.b1 = new JButton("+");
                this.b2 = new JButton("-");
                this.b3 = new JButton("*");
                this.b4 = new JButton("sqrt");
;

                list.add(b1);
                list.add(b2);
                list.add(b3);
                list.add(b4);


                GridLayout l = new GridLayout(1, 4);
                l.setVgap(5);
                l.setHgap(5);

                this.setLayout(l);

                for (JButton b : list)
                {
                    this.add(b);
                }
            }

            public JButton[] getAllButtons()
            {
                JButton[] table = {this.b1, this.b2, this.b3, this.b4};
                return table;
            }
        }

        static private class LabelPanel extends JPanel
        {
            JLabel l1;

            public LabelPanel()
            {

                this.setPreferredSize(new Dimension(150, 20));

                ArrayList<JLabel> list = new ArrayList<JLabel>();
                l1 = new JLabel("wynik");

                list.add(l1);

                GridLayout gl = new GridLayout(1, 3);
                gl.setHgap(5);

                this.setLayout(gl);

                for (JLabel l : list)
                {
                    this.setBackground(new Color(0xD0D0D0));
                    this.add(l);
                }

            }

            public JLabel getL1()
            {
                return l1;
            }

        }

        public MainPanel()
        {
            this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            this.setLocation(100, 100);

            ip = new InputPanel();
            bp = new ButtonsPanel();
            lp = new LabelPanel();

            FlowLayout l = new FlowLayout();
            l.setVgap(20);
            this.setLayout(l);

            this.add(this.ip);
            this.add(this.bp);
            this.add(this.lp);
        }

        public InputPanel getIp()
        {
            return ip;
        }

        public LabelPanel getLp()
        {
            return lp;
        }

        public ButtonsPanel getBp()
        {
            return bp;
        }
    }

    public CalculatorView()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(0x474747));

        this.panel = new MainPanel();
        this.add(panel);
        this.pack();

    }

    public MainPanel getPanel()
    {
        return panel;
    }

    public String getInput()
    {
        return this.getPanel().getIp().getTf1().getText();
    }

    public void setResult(double result)
    {
        panel.getLp().getL1().setText(String.valueOf(result));
    }

    public void addCalculatorListener(ActionListener listenForCalcButtons)
    {
        JButton[] buttons = this.getPanel().getBp().getAllButtons();

        for (JButton b : buttons)
        {
            b.addActionListener(listenForCalcButtons);
        }
    }

    public void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}