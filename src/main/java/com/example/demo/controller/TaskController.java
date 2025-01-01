package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping  //this end point for add new task
	public Task createTask(@RequestBody Task task) {
		return taskService.createTask(task);
	}
	
	@GetMapping  //this end point for get all tasks
	public List<Task> getAll(){
		return taskService.getAllTask();
	}
	
	@GetMapping("/getById/{id}")   //this end point for get task on the basis of id
	public Task getById(@PathVariable int id) {
		return taskService.getById(id);
	}
	
	@PutMapping("/update/{id}")  //this end point for update task on the basis of id
	public Task updateTask(@PathVariable int id, @RequestBody Task task) {
		return taskService.updateTask(id, task);
	}
	
	@DeleteMapping("/delete/{id}")  //this end point for delete task on the basis of id
	public String deleteTask(@PathVariable int id) {
		return taskService.deleteTask(id);
	}
	
	
	
	
	
}
