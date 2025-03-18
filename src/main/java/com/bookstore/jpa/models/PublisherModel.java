package com.bookstore.jpa.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity // Indica que a classe BookModel é uma entidade JPA
@Table(name = "TB_PUBLISHER") // Define o nome da tabela
public class PublisherModel implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id // Define que o dado na coluna será de tipo ID
    @GeneratedValue(strategy=GenerationType.AUTO) // Gera um ID de forma automática
    private UUID id;

    @Column(nullable= false, unique= true) // Define que é uma coluna, que os valores não podem ser nulos e devem ser únicos
    private String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) 
    // Definindo a relação com a tabela de livros
    @OneToMany(mappedBy= "publisher", fetch= FetchType.LAZY) // Carregamento lento (lazy) - não faz subconsulta na base de dados
    private Set<BookModel> books = new HashSet<>();


    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookModel> getBooks() {
        return books;
    }

    public void setBooks(Set<BookModel> books) {
        this.books = books;
    }

}
