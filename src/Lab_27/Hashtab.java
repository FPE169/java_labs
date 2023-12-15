package Lab_27;

import java.math.BigInteger;
import java.security.*;
import java.util.ArrayList;



public class Hashtab<K, V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;

    // Метод конвертации байтового массива в шестнадцатеричную строку
    private String convertToHex(final byte[] messageDigest) {
        BigInteger bigint = new BigInteger(1, messageDigest);
        String hexText = bigint.toString(16);
        while (hexText.length() < 32) {
            hexText = "0".concat(hexText);
        }
        return hexText;
    }

    // Метод хэширования строки
    public String HashtabHash(String input) throws NoSuchAlgorithmException {
        String hashtext = null;
        MessageDigest md = MessageDigest.getInstance("MD5");

        // Вычисление хэша входной строки
        byte[] messageDigest = md.digest(input.getBytes());

        hashtext = convertToHex(messageDigest);

        return hashtext;
    }

    // Конструктор класса Lab_27.Hashtab
    public Hashtab() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    // Добавления элемента в хэш-таблицу
    public void HashtabAdd(K a, V b) {
        if (keys.indexOf(a) == -1) {
            keys.add(a);
            values.add(b);
        } else {
            values.add(keys.indexOf(a), b);
        }
    }

    // Поиска элемента в хэш-таблице по ключу
    public V HashtabLookup(K a) {
        try {
            return values.get(keys.indexOf(a));
        } catch (Exception e) {
            return null;
        }
    }

    // Удаления элемента из хэш-таблицы по ключу
    public void HashtabDelete(String b) {
        int a = keys.indexOf(b);
        keys.remove(a);
        values.remove(a);
    }

    public static void main(String arg[]) {
        Hashtab<String, String> a = new Hashtab<>();
        a.HashtabAdd("Alex", "Smith");
        a.HashtabAdd("Kate", "Black");
        a.HashtabAdd("Alex", "Ring");
        a.HashtabAdd("Alex", "Foren");
        a.HashtabAdd("Liza", "Smith");
        a.HashtabAdd("Roma", "Black");
        a.HashtabAdd("Misha", "Dainer");
        a.HashtabAdd("Artem", "Wainer");
        a.HashtabAdd("Kate", "Smith");
        a.HashtabAdd("Ann", "Kover");
        System.out.println(a.HashtabLookup("Alex"));
        a.HashtabDelete("Alex");
        System.out.println(a.HashtabLookup("Alex"));
    }
}
