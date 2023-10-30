package Lab_5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JFrame {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;

    private final Random random = new Random();

    public RandomShapes() {
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Создаем и добавляем панель для рисования фигур
        DrawingPanel drawingPanel = new DrawingPanel();
        add(drawingPanel);

        // Генерируем случайные фигуры
        for (int i = 0; i < 20; i++) {
            Shape shape = createRandomShape();
            drawingPanel.addShape(shape);
        }
    }

    private Shape createRandomShape() {
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);
        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        if (random.nextBoolean()) {
            int radius = random.nextInt(50) + 20; //
            return new Circle(color, x, y, radius);
        } else {
            int width = random.nextInt(50) + 20;
            int height = random.nextInt(50) + 20;
            return new Rectangle(color, x, y, width, height);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RandomShapes().setVisible(true));
    }

    // Панель для рисования фигур
    private class DrawingPanel extends JPanel {
        private final java.util.List<Shape> shapes = new java.util.ArrayList<>();

        public void addShape(Shape shape) {
            shapes.add(shape);
            repaint(); // перерисовываем панель после добавления фигуры
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Shape shape : shapes) {
                shape.draw(g);
            }
        }
    }
}
