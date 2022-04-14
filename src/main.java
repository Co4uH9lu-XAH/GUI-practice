import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Enigma-2022");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JLabel enterLabel = new JLabel("Ввод");
        c.gridx=0; // Устанавливает компонент в ячейку по иксу
        c.gridy =0; // Устанавливает компонент в ячейку по игреку
        c.gridwidth = 1; // устанавливает количество ячеек по Х, которые занимает компонент
        c.gridheight = 3; // устанвливает кол-во ячеек по У, которые занимает элемент
        c.weightx = 0.0;// Устанавливает как будет происходить растяжка элементов.
        c.weighty = 0.9; // Непонятно. Надо посмотреть еще.
        //c.anchor = GridBagConstraints.NORTHWEST; // Где распложен элемент (Север, юг, запад, северо-запад и т.д.)
        //c.fill = GridBagConstraints.VERTICAL; // Как расположен элемент (горизонтал, вертикал или по умолчанию)
        c.insets = new Insets(10,10,0,0); // Объект insets устанавливает отступы компонента от других объектов или границ. (верх, лево, низ, право).
        c.ipadx = 0; //Устанавливает на сколько увеличивается компонент по Х.
        c.ipady = 0; // Устанавливает, на сколько увеличивается компонент по У. По умолчанию задаются минимальные размеры.
        frame.add(enterLabel, c);

        JTextArea textAreaInput = new JTextArea(3,40);
        c.gridx=1;
        c.gridwidth = 5;
        c.gridheight = 3;
        c.insets = new Insets(10,10,0,10);
        textAreaInput.setLineWrap(true);
        frame.add(new JScrollPane(textAreaInput), c);

        JLabel encoder = new JLabel("Шифр");
        c.gridx=1;
        c.gridy=4;
        c.gridwidth = 1;
        c.gridheight = 1;
        frame.add(encoder, c);

        JLabel decoder = new JLabel("Дешифр");
        c.gridx=2;
        c.gridy=4;
        frame.add(decoder, c);

        JRadioButton enButton = new JRadioButton();
        c.gridx=1;
        c.gridy=5;
        frame.add(enButton, c);

        JRadioButton decButton = new JRadioButton();
        c.gridx=2;
        c.gridy=5;
        frame.add(decButton, c);

        ButtonGroup group = new ButtonGroup();
        group.add(enButton);
        group.add(decButton);

        JButton doButton = new JButton("Шифр/дешифр");
        c.gridx=4;
        c.gridy=5;
        frame.add(doButton, c);

        JButton clear = new JButton("Очистить");
        c.gridx=5;
        c.gridy=5;
        frame.add(clear, c);

        JLabel outputLabel = new JLabel("Вывод");
        c.gridx=0;
        c.gridy =6;
        c.gridwidth = 1;
        c.gridheight = 3;
        c.insets = new Insets(10,10,0,0);
        frame.add(outputLabel, c);

        JTextArea textAreaOutPut = new JTextArea(3,40);
        c.gridx=1;
        c.gridwidth = 6;
        c.gridheight = 3;
        c.insets = new Insets(10,10,10,10);
        textAreaOutPut.setLineWrap(true);
        frame.add(new JScrollPane(textAreaOutPut), c);

        frame.pack();
        frame.setVisible(true);
    }
}
