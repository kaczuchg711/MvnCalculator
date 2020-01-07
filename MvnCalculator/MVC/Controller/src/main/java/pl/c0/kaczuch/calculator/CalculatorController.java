package pl.c0.kaczuch.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class CalculatorController
{
    private CalculatorModelFacade model;
    private CalculatorView view;

    public CalculatorController(CalculatorModelFacade model, CalculatorView view)
    {
        this.model = model;
        this.view = view;

        this.view.addCalculatorListener(new CalculatorLisner());
    }

    class CalculatorLisner implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            double input1 = 0;
            double input2 = 0;
            try
            {
                input1 = Double.valueOf(view.getInput1());
                input2 = Double.valueOf(view.getInput2());

                double result = 0;
                JButton source = (JButton) e.getSource();

                String[] buttonsTexts =
                        {
                                "+",
                                "-",
                                "*",
                                "sqrt",
                        };

                ArrayList<String> t = new ArrayList<>(Arrays.asList(buttonsTexts));

                String text = source.getText();

                switch (t.indexOf(text))
                {
                    case 0:
                        result = model.add(input1, input2);
                        break;
                    case 1:
                        result = model.subtraction(input1, input2);
                        break;
                    case 2:
                        result = model.multiplication(input1, input2);
                        break;
                    case 3:
                        result = model.sqrt(input1);
                        break;
                }

                view.setResult(result);
            }
            catch (Exception e1)
            {
                view.displayErrorMessage("You need to enter a number");
            }
        }
    }
}
