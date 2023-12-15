package Lab_31;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProcessorTree {
    private TreeNode root;

    public ProcessorTree() {

        this.root = null;
    }

    public void insert(ProcessorRecord record) {

        root = insertRec(root, record);
    }

    private TreeNode insertRec(TreeNode root, ProcessorRecord record) {
        if (root == null) {
            return new TreeNode(record);
        }

        if (record.key < root.data.key) {
            root.left = insertRec(root.left, record);
        } else if (record.key == root.data.key) {
            System.out.println("Запись с ключом " + record.key + " уже существует ");
        } else if (record.key > root.data.key && record.key < root.data.key * 2) {
            root.middle = insertRec(root.middle, record);
        } else {
            root.right = insertRec(root.right, record);
        }

        return root;
    }

    public void levelOrderTraversal() {
        if (root == null) {
            System.out.println("Дерево пустое");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                System.out.print(current.data.key + " ");
                if (current.left != null) queue.add(current.left);
                if (current.middle != null) queue.add(current.middle);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println();
        }
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) {
            System.out.println("Запись с ключом " + key + " не найдена ");
            return null;
        }

        if (key < root.data.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data.key && key < root.data.key * 2) {
            root.middle = deleteRec(root.middle, key);
        } else if (key > root.data.key * 2) {
            root.right = deleteRec(root.right, key);
        } else {

            if (root.left == null && root.middle == null && root.right == null) {
                return null;
            } else if (root.middle == null) {
                return root.left;
            } else if (root.left == null) {
                return root.middle;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.middle);

            root.middle = deleteRec(root.middle, root.data.key);
        }

        return root;
    }

    private ProcessorRecord minValue(TreeNode root) {
        ProcessorRecord minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public ProcessorRecord search(int key) {

        return searchRec(root, key);
    }

    private ProcessorRecord searchRec(TreeNode root, int key) {
        if (root == null || root.data.key == key || (key > root.data.key && key < root.data.key * 2)) {
            return root.data;
        }

        if (key < root.data.key) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            saveToFileRec(root, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveToFileRec(TreeNode root, PrintWriter writer) {
        if (root != null) {
            writer.println(root.data.key + ", " + root.data.name + ", " + root.data.clockFrequency + ", " +
                    root.data.cacheSize + ", " + root.data.busFrequency + ", " + root.data.specInt + ", " +
                    root.data.specFp);
            saveToFileRec(root.left, writer);
            saveToFileRec(root.middle, writer);
            saveToFileRec(root.right, writer);
        }
    }

    public static void main(String[] args) throws IOException {
        ProcessorTree processorTree = new ProcessorTree();
        processorTree.readDataFromFile("PROCS.TXT");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите функцию:");
            System.out.println("L - Вывести порядок уровней дерева");
            System.out.println("D n - Удалить запись с ключом n");
            System.out.println("A n - Добавить запись с ключом n");
            System.out.println("S - Сохранить в файл");
            System.out.println("E - Выход");

            String option = scanner.next().toUpperCase();

            switch (option) {
                case "L":
                    processorTree.levelOrderTraversal();
                    break;
                case "D":
                    int keyToDelete = scanner.nextInt();
                    processorTree.delete(keyToDelete);
                    break;
                case "A":
                    int keyToAdd = scanner.nextInt();
                    ProcessorRecord recordToAdd = new ProcessorRecord(keyToAdd, "Sample ", 2.0, 256, 0.400, 664, 734);
                    processorTree.insert(recordToAdd);
                    break;
                case "S":
                    processorTree.saveToFile("PROCS.TXT");
                    System.out.println("Данные сохранены в файл");
                    break;
                case "E":
                    System.out.println("Выход из программы");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверная функция. Попробуйте еще раз");
            }
        }
    }

    private void readDataFromFile(String filename) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Анна/IdeaProjects/java_labs/src/Lab_31/PROCS.TXT"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Разбиваем строку на части
                String[] parts = line.split(", ");

                ProcessorRecord record = new ProcessorRecord(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        Double.parseDouble(parts[2]),
                        Integer.parseInt(parts[3]),
                        Double.parseDouble(parts[4]),
                        Integer.parseInt(parts[5]),
                        Integer.parseInt(parts[6])
                );

                // Вставляем запись в дерево
                insert(record);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}