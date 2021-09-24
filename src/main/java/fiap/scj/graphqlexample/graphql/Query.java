package fiap.scj.graphqlexample.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import fiap.scj.graphqlexample.models.Book;
import fiap.scj.graphqlexample.repositories.BookRepo;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private BookRepo repo;

    public Query(BookRepo bookRepo) {
        this.repo = bookRepo;
    }

    public List<Book> getRecentBooks(int count, int offset) {
        return repo.getRecent(count, offset);
    }

    public List<Book> getAllBooks() {
        return repo.getAll();
    }
}
