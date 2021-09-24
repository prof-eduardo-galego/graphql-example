package fiap.scj.graphqlexample.repositories;

import fiap.scj.graphqlexample.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepo {

    private static final List<Book> POST_COLLECTION = new ArrayList<>();

    static {
        POST_COLLECTION.add(new Book("143fc43d-f88e-4e57-8c3e-b66bb5de9780", "Le Petit Prince", "Infantil", "1"));
        POST_COLLECTION.add(new Book("58122d1e-118c-43cb-b307-6e5957f00ccc", "O Hobbit ", "Aventura", "2"));
        POST_COLLECTION.add(new Book("6db22fa0-3f10-431b-89aa-59e8973c9dda", "The Lord of Ring", "Aventura", "2"));
        POST_COLLECTION.add(new Book("e5e4cfcc-83d4-47c5-803f-6a23ccef2906", "Vidas Secas", "Romance", "3"));
    }

    public List<Book> getRecent(int count, int offset) {
        return POST_COLLECTION.stream().skip(offset).limit(count).collect(Collectors.toList());
    }

    public List<Book> getAll() {
        return POST_COLLECTION;
    }

    public List<Book> getAuthor(String author) {
        return POST_COLLECTION.stream().filter(post -> author.equals(post.getAuthorId())).collect(Collectors.toList());
    }

    public void save(Book post) {
        POST_COLLECTION.add(0, post);
    }
}
