package Lab_30.part_1;

class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left, right;

    // Создания узла
    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
    }

    // Метода сравнения для приоритетной очереди
    @Override
    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;
    }
}