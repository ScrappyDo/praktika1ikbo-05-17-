

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Match extends JFrame {
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        JLabel res = new JLabel("Result: 0 X 0");
        JLabel last = new JLabel("Last Scorer: N/A");
        JLabel winner = new JLabel("Winner: DRAW");

        int milanScore = 0;
        int madridScore = 0;
        String lastScorer = "N/A";
        String win = "Winner: DRAW";

        public Match() {
                super("Match");
                setSize(500, 500);
                setLayout(new GridLayout(5,5));
                setDefaultCloseOperation(EXIT_ON_CLOSE);

                add(new JPanel());

                add(last);

                add(new JPanel());

                add(milanButton);
                milanButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent ae) {
                                milanScore++;
                                lastScorer = "AC Milan";
                                win = ((milanScore > madridScore) ? "Winner: AC Milan" : "Winner: Real Madrid");
                                if (milanScore == madridScore) win = "Winner: DRAW";
                                res.setText("Result: " + milanScore + " X " + madridScore);
                                last.setText("Last Scorer: " + lastScorer);
                                winner.setText(win);
                        }
                });

                add(res);

                add(madridButton);
                madridButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent ae) {
                                madridScore++;
                                lastScorer = "Real Madrid";
                                win = ((milanScore > madridScore) ? "Winnder: AC Milan" : "Winner: Real Madrid");
                                if (milanScore == madridScore) win = "Winner: DRAW";
                                res.setText("Result: " + milanScore + " X " + madridScore);
                                last.setText("Last Scorer: " + lastScorer);
                                winner.setText(win);
                        }
                });

                add(new JPanel());

                add(winner);

                add(new JPanel());

                setVisible(true);
        }

        public static void main(String[] args) {
                new Match();
        }
}