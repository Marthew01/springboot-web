package com.zry.timmer.dao;

import com.zry.timmer.entity.Task;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskMapper {
    List<Task> getAllTask();

    Integer addTask(Task user);

    Integer endTask(Task user);

    Integer updateUserById(Task user);

    Integer deleteUserById(Integer id);
}
