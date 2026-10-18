package Main;

import java.util.*;

public class Main {

    public static List<Integer> rankSongs(int n, int m, List<List<Integer>> preferences) {
        Map<Integer, Integer> beatsCount = new HashMap<>();

        // Initialize beatsCount with zeros for each song
        for (int i = 0; i < m; i++) {
            beatsCount.put(i, 0);
        }

        // Iterate over each user's preferences
        for (List<Integer> pref : preferences) {
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    // Check if song pref[i][i] beats song pref[i][j]
                    if (pref.get(i) < pref.get(j)) {
                        beatsCount.put(pref.get(i), beatsCount.get(pref.get(i)) + 1);
                    }
                }
            }
        }

        // Create a list of song ids and sort it based on the specified criteria
        List<Integer> sortedSongs = new ArrayList<>(beatsCount.keySet());
        sortedSongs.sort((a, b) -> {
            int beatsDiff = Integer.compare(beatsCount.get(b), beatsCount.get(a));
            return (beatsDiff != 0) ? beatsDiff : Integer.compare(a, b);
        });

        return sortedSongs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = 3;
        int m = 3;

        List<List<Integer>> preferences = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> userPreferences = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                userPreferences.add(scanner.nextInt());
            }
            preferences.add(userPreferences);
        }

        // Get the ranked songs
        List<Integer> result = rankSongs(n, m, preferences);

        // Output the result
        System.out.println("Ranked Songs: " + result);
    }
}
