package br.com.walison.layout.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.walison.layout.model.Task;

@Controller
public class TaskController {


    List<Task> tasks = new ArrayList<>();
    
    // indentificando pagina inicial
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    // recebendo arquivos do formulario
    @PostMapping("/index")
    public String create(Task task) {
        // System.out.println("O nome da tarefa é " + task.getName());
        Long id = tasks.size() + 1L;
        tasks.add(new Task(id, task.getName(), task.getDate()));

        return "view";
    }
}
