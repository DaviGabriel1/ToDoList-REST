package br.org.davi.todolistwithrest.repositories;

import br.org.davi.todolistwithrest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
