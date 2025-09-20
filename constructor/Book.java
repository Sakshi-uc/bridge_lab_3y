public class Book {
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;

    public Book() {
        this.bookTitle = "Unknown";
        this.bookAuthor = "Unknown";
        this.bookPrice = 0.0;
    }

    public Book(String bookTitle, String bookAuthor, double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    public String getTitle() { return bookTitle; }
    public String getAuthor() { return bookAuthor; }
    public double getPrice() { return bookPrice; }
    public void setTitle(String bookTitle) { this.bookTitle = bookTitle; }
    public void setAuthor(String bookAuthor) { this.bookAuthor = bookAuthor; }
    public void setPrice(double bookPrice) { this.bookPrice = bookPrice; }
}
