package fiap.scj.graphqlexample.configs;

import fiap.scj.graphqlexample.graphql.AuthorResolver;
import fiap.scj.graphqlexample.graphql.BookResolver;
import fiap.scj.graphqlexample.graphql.Mutation;
import fiap.scj.graphqlexample.graphql.Query;
import fiap.scj.graphqlexample.repositories.AuthorRepo;
import fiap.scj.graphqlexample.repositories.BookRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {

    @Bean
    public BookRepo bookRepo() {
        return new BookRepo();
    }

    @Bean
    public AuthorRepo authorRepo() {
        return new AuthorRepo();
    }

    @Bean
    public BookResolver bookResolver(AuthorRepo authorRepo) {
        return new BookResolver(authorRepo);
    }

    @Bean
    public AuthorResolver authorResolver(BookRepo bookRepo) {
        return new AuthorResolver(bookRepo);
    }

    @Bean
    public Query query(BookRepo bookRepo) {
        return new Query(bookRepo);
    }

    @Bean
    public Mutation mutation(BookRepo bookRepo) {
        return new Mutation(bookRepo);
    }
}