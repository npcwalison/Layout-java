package br.com.walison.layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.walison.layout.model.Task;

@Controller
public class TaskController {
    
    // indentificando pagina inicial
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    // recebendo arquivos do formulario
    @PostMapping("/index")
    public void create(Task task) {
        System.out.println("O nome da tarefa é " + task.getName());
    }
}
