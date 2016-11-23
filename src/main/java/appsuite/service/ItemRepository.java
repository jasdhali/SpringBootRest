package appsuite.service;

import org.springframework.data.jpa.repository.JpaRepository;

import appsuite.domain.Book;

public interface ItemRepository extends JpaRepository<Book,Long> {

}
