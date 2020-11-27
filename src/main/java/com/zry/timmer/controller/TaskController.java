package com.zry.timmer.controller;

import com.zry.timmer.entity.Task;
import com.zry.timmer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class TaskController {

//    @Autowired
//    private TaskService taskService;

    @GetMapping("/login")
    public String login() {

        return "/checkout/index";
    }

    //添加
    @PostMapping("/sets")
    public String set(Task task, Model model) {
        task.setStatus(0);
        System.out.println(task);
//        taskService.addTask(task);
        model.addAttribute("task",task);
        int anInt = task.getOrderBy();
        System.out.println(anInt);
        if(0==anInt){
            //正计时
            return "/asc";
        }else {
            return "/desc";
        }
    }

    //修改
    @PutMapping("/sets")
    public String update(Task task) {
        return "success";
    }

    //结束
    @PutMapping("/shutdown")
    public String end(Task task) {
//        taskService.endTask(task);
        return "success";
    }
}
