package br.org.davi.todolistwithrest.model;

import br.org.davi.todolistwithrest.enums.Status;
import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 40,nullable = false)
    private String title;
    @Column(length = 1000)
    private String description;
    @Column(length = 10,nullable = false)
    private Status status;

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
