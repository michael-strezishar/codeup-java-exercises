import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {
            "adventurous",
            "adaptable",
            "aggressive",
            "ambitious",
            "beautiful",
            "brave",
            "calm",
            "clean",
            "chubby",
            "caring",
            "clumsy",
            "funky",
            "funny",
            "flimsy",
            "gigantic",
            "grumpy",
            "great",
            "itchy",
            "magnificent",
            "nervous",
            "proud",
            "scruffy",
            "silly",
            "stinky",
            "tall",
            "big"




    };

    public static String[] nouns = {
            "apple",
            "banana",
            "cat",
            "kitten",
            "dog",
            "puppy",
            "car",
            "shoes",
            "socks",
            "baby",
            "monkey",
            "pen",
            "tree",
            "house",
            "pants",
            "shorts",
            "road",
            "bike",
            "boat",
            "butt",
            "foot",
            "hands",
            "hat",
            "nose",
            "face",
            "daddy",
            "villager",
            "squidword",
            "gorilla"

    };

    public static void main(String[] args) {
        String adj = randomWord(adjectives);
        String noun = randomWord(nouns);
        String noun2 = randomWord(nouns);
        System.out.println("Here is your server name:");
        System.out.println(adj + "-" + noun + "-" + noun2);
    }

    public static String randomWord(String[] words) {
        Random randomNameGen = new Random();
        return words[randomNameGen.nextInt(words.length)];
    }


}
