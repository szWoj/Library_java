import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private Integer capacity;

    public Library(Integer capacity){
        collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int collectionCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        if(collectionCount() < this.capacity) {
            this.collection.add(book);
        }
    }

    public Book removeBook(){
        return this.collection.remove(0);
    }
}
