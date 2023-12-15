package Lab_30.part_1;

import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanCoding {
    public static void main(String[] args) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put('a', 12);
        frequencyMap.put('b', 4);
        frequencyMap.put('c', 15);
        frequencyMap.put('d', 8);
        frequencyMap.put('e', 25);

        // Построение дерева
        HuffmanNode root = buildHuffmanTree(frequencyMap);

        // Генерация кодов
        HashMap<Character, String> huffmanCodes = generateHuffmanCodes(root, "");

        System.out.println("Huffman Codes:");
        for (char key : huffmanCodes.keySet()) {
            System.out.println(key + ": " + huffmanCodes.get(key));
        }
    }

    private static HuffmanNode buildHuffmanTree(HashMap<Character, Integer> frequencyMap) {
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();

        //Создание узлов для каждого символа
        for (char key : frequencyMap.keySet()) {
            priorityQueue.offer(new HuffmanNode(key, frequencyMap.get(key)));
        }

        while (priorityQueue.size() > 1) {
            // Извлекаем два узла с наименьшей частотой
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();

            // Создаем внутренний узел
            HuffmanNode internalNode = new HuffmanNode('\0', left.frequency + right.frequency);
            internalNode.left = left;
            internalNode.right = right;

            // Добавляем внутренний узел обратно
            priorityQueue.offer(internalNode);
        }

        // Возвращаем корень дерева
        return priorityQueue.poll();
    }

    private static HashMap<Character, String> generateHuffmanCodes(HuffmanNode root, String currentCode) {
        HashMap<Character, String> huffmanCodes = new HashMap<>();

        // Есть ли узел
        if (root != null) {
            // Содержит ли он символ
            if (root.data != '\0') {
                huffmanCodes.put(root.data, currentCode);
            }

            // Рекурсивный вызов
            huffmanCodes.putAll(generateHuffmanCodes(root.left, currentCode + "0"));
            huffmanCodes.putAll(generateHuffmanCodes(root.right, currentCode + "1"));
        }

        return huffmanCodes;
    }
}
