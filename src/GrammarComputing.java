import java.util.ArrayList;

public class GrammarComputing {
    public static void main(String[] args) throws Exception {
        String initialSeed = "ABA";
        int iterations = 7;

        ArrayList<String> grammar = new ArrayList<>();
        grammar.add(initialSeed);

        for (int i = 0; i < iterations; i++) {
            ArrayList<String> newGrammar = new ArrayList<>();
            for (String str : grammar) {
                StringBuilder sb = new StringBuilder();
                for (char c : str.toCharArray()) {
                    if (c == 'A') {
                        sb.append("AB");
                    } else {
                        sb.append("BA");
                    }
                }
                System.out.println("Iteration " + (i + 1) + ": " + str + " -> " + sb.toString());
                System.out.println("Length of new string: " + sb.length());
                newGrammar.add(sb.toString());
            }
            grammar = newGrammar;
        }

        System.out.println("Final Grammar after " + iterations + " iterations:");
        System.out.println(grammar.toString());

    }
}