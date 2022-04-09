package by.epam.akbarova;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList words = new ArrayList();

        Parser parser = new Parser();
        parser.parse();
        System.out.println(parser.countWordsInSentencesTask1());
        System.out.println(parser.getSentencesIncreasingCountOfWordsTask2());
        System.out.println(parser.findWordNotInSentencesTask3().text);
        System.out.println(parser.getWordsInQuestionsByLengthTask4(6));
        System.out.println(parser.sentences);

        Sentence sentence = new Sentence(words);
        System.out.println(sentence.text);
    }
}
