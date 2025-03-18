package com.bookstore.jpa.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // Indica que a classe BookModel é uma entidade JPA
@Table(name = "TB_BOOK") // Define o nome da tabela
public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id // Define que o dado na coluna será de tipo ID
    @GeneratedValue(strategy=GenerationType.AUTO) // Gera um ID de forma automática
    private UUID id;

    @Column(nullable= false, unique= true) // Define que é uma coluna, que os valores não podem ser nulos e devem ser únicos
    private String title;

    @ManyToOne // Define a relação com a tabela Publisher de muito livros para uma editora
    @JoinColumn(name="publisher_id") // Define a chave estrangeira que liga as tabelas
    private PublisherModel publisher;

    @ManyToMany
    @JoinTable( // Criando tabela auxiliar para relacionar book e author
        name = "tb_book_author",
        joinColumns= @JoinColumn(name = "book_id"),
        inverseJoinColumns= @JoinColumn(name="author_id")
    )
    private Set<AuthorModel> authors = new HashSet<>();



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public PublisherModel getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherModel publisher) {
        this.publisher = publisher;
    }

    public Set<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorModel> authors) {
        this.authors = authors;
    }
    

}
