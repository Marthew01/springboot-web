package com.zry.timmer.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zry.timmer.entity.Task;
import com.zry.timmer.service.TaskService;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {

    @Autowired
    TaskService taskService;

    @GetMapping("/login")
    public String login() {

        return "/checkout/index";
    }

    //添加
    @PostMapping("/sets")
    public String set(Task task, Model model) {
        task.setStatus(0);
        task.setOrderBy(0);
        System.out.println(task);
        taskService.addTask(task);
        model.addAttribute("task",task);
        return "success";
    }

    //修改
    @PutMapping("/sets")
    public String update(Task task) {


        return "success";
    }

    //结束
    @PutMapping("/shutdown")
    public String end(Task task) {
        taskService.endTask(task);
        return "success";
    }
}
