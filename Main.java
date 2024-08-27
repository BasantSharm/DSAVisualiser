import javax.swing.*;
import java.awt.event.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JTextArea greeter = new JTextArea();
        greeter.setBounds(50, 30, 200, 30);
        greeter.setEditable(false);
        greeter.setText("Welcome to the Greeter! Please choose an algorithm.");

        JButton button = new JButton("Submit");
        button.setBounds(50, 70, 100, 30);

        String[] algos = {"Bubble Sort", "Kruskal's Algorithm", "Djikstra's Algorithm"};
        JComboBox options = new JComboBox(algos);
        options.setBounds(50, 100, 200, 30);
        JFrame goodbye = new JFrame();
        goodbye.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        goodbye.setSize(800, 600);
        goodbye.setLocationRelativeTo(null);
        goodbye.setLayout(null);
        JTextArea byetext = new JTextArea();
        byetext.setBounds(50, 100, 200, 30);
        byetext.setEditable(false);
        byetext.setText("Thank you for using this visualizer!");
        goodbye.add(byetext);
        boolean go = true;
        while (go)
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice = (String) options.getSelectedItem();
                if (choice.equals("Leave")) {
                    goodbye.setVisible(true);

                }
                if (choice.equals("Bubble Sort")) {
                    bubblesorttime();
                    // USE dispose.close for closing future GUI elements.
                }
            }
        });


        frame.add(options);
        frame.add(greeter);
        frame.add(button);
        frame.setVisible(true);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}