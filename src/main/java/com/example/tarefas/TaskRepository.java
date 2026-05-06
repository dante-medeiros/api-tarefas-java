package com.example.tarefas;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByConcluida(boolean concluida);

    List<Task> findByPrioridade(String prioridade);
}