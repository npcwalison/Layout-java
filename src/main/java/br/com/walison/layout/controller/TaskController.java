package br.com.walison.layout.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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

        // Redirecinando pagina para view
        return "redirect:/view";
    }

    @GetMapping("/view")
    public ModelAndView view() {

        // faz o mapeamento entre os objetos no java para os objetos no html
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("tasks", tasks);

        return mv;
    }


    // Filtro de dados
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("index");

        Task taskFind = tasks.stream().filter(task -> id.equals(task.getId())).findFirst().get();

        mv.addObject("task", taskFind);

        return mv;
    }
}
