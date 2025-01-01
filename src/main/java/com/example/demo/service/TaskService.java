package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskService {
	
 @Autowired
 private TaskRepository taskRepository;
 
 //this function is for creating new tasks
 public Task createTask(Task task){
    return taskRepository.save(task);
 }
 
 //get all tasks
 public List<Task> getAllTask(){
	 return taskRepository.findAll();
 }
 
 
 //this is used to get particular task on the basis of specific id
 public Task getById(int id){
	 return taskRepository.findById(id).orElseThrow(
	 ()-> new ResourceNotFoundException("Task id is not Found : " + id));
 }
 
 
 //this method for task update
 public Task updateTask(int id, Task task) {
	 getById(id);
	 task.setId(id);
	 return taskRepository.save(task);
 }
 
 
 public String deleteTask(int id) {
	 getById(id);
	 taskRepository.deleteById(id);
	 return "Task Record Deleted Successfully with Id : " + id;
 }
 
 

}
