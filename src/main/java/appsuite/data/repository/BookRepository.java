package appsuite.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import appsuite.domain.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
