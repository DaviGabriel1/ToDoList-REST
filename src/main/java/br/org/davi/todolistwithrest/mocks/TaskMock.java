package br.org.davi.todolistwithrest.mocks;

import br.org.davi.todolistwithrest.enums.Status;
import br.org.davi.todolistwithrest.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class TaskMock {
    private static AtomicLong al = new AtomicLong();

    public static List<Task> findAllMock(){
        List<Task> taskList = new ArrayList<>();
        for(int i = 0;i<14;i++){
            Task task = new Task();
            task.setId(al.get());
            task.setTitle("title "+i);
            task.setDescription("description "+ i);
            task.setStatus((i % 2 == 0) ? Status.COMPLETED : Status.PENDING);
            taskList.add(task);
        }
        return taskList;
    }

    public static Task findById(Long id) {
        Task task = new Task();
        task.setId(id);
        task.setTitle("title 1");
        task.setDescription("description 1");
        task.setStatus(Status.COMPLETED);
        return task;
    }
}
