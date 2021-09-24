package fiap.scj.graphqlexample.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import fiap.scj.graphqlexample.models.Author;
import fiap.scj.graphqlexample.models.Book;
import fiap.scj.graphqlexample.repositories.BookRepo;

import java.util.List;

public class AuthorResolver implements GraphQLResolver<Author> {
    private BookRepo bookRepo;

    public AuthorResolver(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getBooks(Author author) {
        return bookRepo.getAuthor(author.getId());
    }
}