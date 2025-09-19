public class Problem5 {
    public static void main(String[] args) {
        LibraryItem[] collection = new LibraryItem[] {
            new Book(1,"Effective Java","Joshua Bloch"),
            new Magazine(2,"Time","Various"),
            new DVD(3,"Inception","Christopher Nolan")
        };
        for (LibraryItem libItem : collection) {
            System.out.println(libItem.getItemDetails() + " LoanDuration: " + libItem.getLoanDuration() + " days");
            if (libItem instanceof Reservable) {
                ((Reservable)libItem).reserveItem("Gaurav");
                System.out.println("Availability: " + ((Reservable)libItem).checkAvailability());
            }
            System.out.println("----");
        }
    }
}
abstract class LibraryItem {
    private int libId;
    private String libTitle;
    private String libAuthor;
    public LibraryItem(int id, String title, String author) {
        this.libId = id;
        this.libTitle = title;
        this.libAuthor = author;
    }
    public int getLibId(){ return libId; }
    public String getLibTitle(){ return libTitle; }
    public String getLibAuthor(){ return libAuthor; }
    public String getItemDetails(){ return "["+libId+"] "+libTitle+" by "+libAuthor; }
    public abstract int getLoanDuration();
}
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {
    private String reservedUser;
    public Book(int id,String title,String author){ super(id,title,author); }
    @Override
    public int getLoanDuration(){ return 21; }
    @Override
    public void reserveItem(String borrower){ this.reservedUser = borrower; }
    @Override
    public boolean checkAvailability(){ return reservedUser == null; }
}
class Magazine extends LibraryItem {
    public Magazine(int id,String title,String author){ super(id,title,author); }
    @Override
    public int getLoanDuration(){ return 7; }
}
class DVD extends LibraryItem implements Reservable {
    private String reservedUser;
    public DVD(int id,String title,String author){ super(id,title,author); }
    @Override
    public int getLoanDuration(){ return 5; }
    @Override
    public void reserveItem(String borrower){ this.reservedUser = borrower; }
    @Override
    public boolean checkAvailability(){ return reservedUser == null; }
}
