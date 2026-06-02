package jobsheet15;

public class book25 {
    public String isbn;
    public String title;

    public book25() {
    }

    public book25(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}