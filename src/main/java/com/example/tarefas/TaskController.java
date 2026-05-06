package com.example.tarefas;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Task criarTarefa(@RequestBody Task task) {
        return repository.save(task);
    }

    @GetMapping
    public List<Task> listarTarefas() {
        return repository.findAll();
    }

    @GetMapping("/concluidas")
    public List<Task> listarConcluidas() {
        return repository.findByConcluida(true);
    }

    @GetMapping("/prioridade/{nivel}")
    public List<Task> listarPorPrioridade(@PathVariable String nivel) {
        return repository.findByPrioridade(nivel);
    }

    @PutMapping("/{id}")
    public Task atualizarTarefa(@PathVariable Long id, @RequestBody Task dados) {
        Task task = repository.findById(id).orElseThrow();

        task.setTitulo(dados.getTitulo());
        task.setDescricao(dados.getDescricao());
        task.setConcluida(dados.isConcluida());
        task.setPrioridade(dados.getPrioridade());

        return repository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        repository.deleteById(id);
    }
}