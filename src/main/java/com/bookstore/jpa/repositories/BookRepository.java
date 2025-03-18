package com.bookstore.jpa.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bookstore.jpa.models.BookModel;

public interface BookRepository extends JpaRepository <BookModel, UUID> {

    // Encontrando livros pelo título
    BookModel findBookModelByTitle(String title);

    // Realizando consultas nativas de Query
    @Query(value = "SELECT * FROM tb_book WHERE publisher_id = :id", nativeQuery= true)
    List<BookModel> findBooksByPublisherId(@Param("id") UUID id);


}
