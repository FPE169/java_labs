package Lab_15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private JTextArea textArea;
    
    public SimpleGUI() {
        // Настройка основного окна
        setTitle("Пример GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание текстового поля
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // Создание меню
        JMenuBar menuBar = new JMenuBar();

        // Меню "Файл"
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        // Меню "Правка"
        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);

        // Меню "Справка"
        JMenu helpMenu = new JMenu("Справка");

        // Добавление меню в строку меню
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Установка строки меню в окне
        setJMenuBar(menuBar);

        // Обработчики событий
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SimpleGUI.this, "Сохранение файла");
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copyMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });

        cutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });

        pasteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleGUI().setVisible(true);
            }
        });
    }
}
