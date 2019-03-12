package ru.deleveryClub;

import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class frameApp {

        JLabel logText = new JLabel("Логин: ");
        JLabel passText = new JLabel("Пароль: ");
        JLabel userIDText = new JLabel("UserID: ");
        JLabel messageText = new JLabel("Документ");


        public JTextField login = new JTextField();
        public JTextField pass = new JTextField();
        public JTextField user = new JTextField();
        public JTextField message = new JTextField();
        public JButton button = new JButton("Отправить");
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("PARTA");
        //конструктор
        frameApp(){
            GridLayout glayout = new GridLayout(5, 2);
            panel.setLayout(glayout);
            panel.add(logText);
            panel.add(login);

            panel.add(passText);
            panel.add(pass);

            panel.add(userIDText);
            panel.add(user);

            panel.add(messageText);
            panel.add(message);

            panel.add(button);

            frame.setContentPane(panel);
            frame.pack();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

            engine kisses = new engine(this);
            //добавляем в слушатель
            button.addActionListener(kisses);
        }

}