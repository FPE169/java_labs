package Lab_28;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class PeopleMap {

    public static Map<String, List<String>> createMap() {
        Map<String, List<String>> map = new HashMap<>();

        addName(map, "Smith", "Alex");
        addName(map, "Black", "Kate");
        addName(map, "Ring", "Alex");
        addName(map, "Foren", "Alex");
        addName(map, "Smith", "Liza");
        addName(map, "Black", "Roma");
        addName(map, "Dainer", "Misha");
        addName(map, "Wainer", "Artem");
        addName(map, "Smith", "Kate");
        addName(map, "Kover", "Ann");

        return map;
    }

    private static void addName(Map<String, List<String>> map, String lastName, String firstName) {
        map.computeIfAbsent(lastName, k -> new ArrayList<>()).add(firstName);
    }

    public static int getSameFirstNameCount(Map<String, List<String>> map, String firstName) {
        int count = 0;

        for (List<String> names : map.values()) {
            for (String name : names) {
                if (name.equals(firstName)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int getSameLastNameCount(Map<String, List<String>> map, String lastName) {
        return map.containsKey(lastName) ? map.get(lastName).size() : 0;
    }

    public static void main(String[] args) {
        Map<String, List<String>> peopleMap = createMap();

        String firstNameToCheck = "Kate";
        String lastNameToCheck = "Smith";

        int sameFirstNameCount = getSameFirstNameCount(peopleMap, firstNameToCheck);
        int sameLastNameCount = getSameLastNameCount(peopleMap, lastNameToCheck);

        System.out.println("Количество людей с именем " + firstNameToCheck + ": " + sameFirstNameCount);
        System.out.println("Количество людей с фамилией " + lastNameToCheck + ": " + sameLastNameCount);
    }
}
