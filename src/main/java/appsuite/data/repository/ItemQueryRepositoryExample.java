package appsuite.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import appsuite.domain.Item;

public interface ItemQueryRepositoryExample extends JpaRepository<Item, Long> {

	@Query(value = "select * from #{#entityName} b where b.sku=?1", nativeQuery = true)
	List<Item> findByName(String name);

	/*
	 * @Query(value =
	 * "select name,author,price from Book b where b.price>?1 and b.price<?2")
	 * List<Book> findByPriceRange(long price1, long price2);
	 * 
	 * @Query(value =
	 * "select name,author,price from Book b where b.name like %:name%")
	 * List<Book> findByNameMatch(@Param("name") String name);
	 * 
	 * @Query(value =
	 * "select name,author,price from Book b where b.name = :name AND b.author=:author AND b.price=:price"
	 * ) List<Book> findByNamedParam(@Param("name") String
	 * name, @Param("author") String author,
	 * 
	 * @Param("price") long price);
	 */
}