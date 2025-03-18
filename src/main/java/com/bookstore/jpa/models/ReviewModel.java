package com.bookstore.jpa.models;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity // Indica que a classe BookModel é uma entidade JPA
@Table(name = "TB_REVIEW") // Define o nome da tabela
public class ReviewModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id // Define que o dado na coluna será de tipo ID
    @GeneratedValue(strategy=GenerationType.AUTO) // Gera um ID de forma automática
    private UUID id;

    @Column(nullable= false) // Define que é uma coluna, que os valores não podem ser nulos e devem ser únicos
    private String comment;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name = "book_id")

    private BookModel book;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BookModel getBook() {
        return book;
    }

    public void setBook(BookModel book) {
        this.book = book;
    }

}
