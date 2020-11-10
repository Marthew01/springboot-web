package com.zry.timmer.service;

import com.zry.timmer.dao.TaskMapper;
import com.zry.timmer.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskMapper taskMapper;
    public List getAllTask(){
        List<Task> allUser = taskMapper.getAllTask();
        return allUser;
    }

    public void addTask(Task task){
        taskMapper.addTask(task);
    }

    public void endTask(Task task){
        task.setStatus(1);
        taskMapper.endTask(task);
    }
}
