package br.com.zup.edu.bookflyway.autor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private LocalDateTime dataNascimento;
    private String biografia;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Autor(String nome, String email, LocalDateTime dataNascimento, String biografia) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
    }

    /**
     * @deprecated Construtor para uso exclusivo do Hibernate.
     */
    @Deprecated
    public Autor() {
    }

    public Long getId() {
        return id;
    }
}
