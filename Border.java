import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Border extends JFrame{

    private JTextField[] textfield=new JTextField[3];
    private JLabel label;
    private JButton[] button=new JButton[1];


    public Border(){
        label=new JLabel("0.0");
        textfield[0]=new JTextField("10");
        textfield[1]=new JTextField("10");
        textfield[2]=new JTextField("10");

        button[0]=new JButton("PRODUCT");


        button[0].addActionListener(new CalculatorHandle());

        BorderLayout layout=new BorderLayout();
        JPanel panel=new JPanel(layout);

        panel.add(textfield[0],BorderLayout.LINE_START);
        panel.add(textfield[1],BorderLayout.CENTER);
        panel.add(textfield[2],BorderLayout.LINE_END);

        panel.add(label,BorderLayout.PAGE_START);
        panel.add(button[0],BorderLayout.PAGE_END);

        setContentPane(panel);
    }
    public static void main(String[] args){
        Border calculator=new Border();
        calculator.setSize(2000,2000);
        calculator.setTitle("Calculator");
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.pack();
        calculator.setVisible(true);
        System.out.println(calculator.getInsets());
    }
    private class CalculatorHandle implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            double input1 = Double.parseDouble(textfield[0].getText());
            double input2 = Double.parseDouble(textfield[1].getText());
            double input3 = Double.parseDouble(textfield[2].getText());

            double result = input1 * input2 * input3;
            DecimalFormat format = new DecimalFormat("####.00");

            label.setText(String.valueOf(format.format(result)));

            System.out.println("You just clicked AVERAGE button. The average number is "+result+". ");


        }

    }
}

