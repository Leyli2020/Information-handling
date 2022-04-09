package by.epam.akbarova;

public class Word implements TextItem {
    public String text;
    boolean isPunctuationMark;

    Word(String text) {
        this.text = text;
        if (text.matches("([\u2026.,!?;:()])")) {
            isPunctuationMark = true;
            System.out.print(this.text);
        } else {
            isPunctuationMark = false;
            System.out.print(" " + this.text);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;

        Word word = (Word) o;

        return text.equals(word.text);

    }

    @Override
    public int hashCode() {
        return text.hashCode();
    }
}
