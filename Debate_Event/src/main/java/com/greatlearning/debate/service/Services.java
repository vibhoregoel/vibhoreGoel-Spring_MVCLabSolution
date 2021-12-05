package com.greatlearning.debate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.debate.entities.Students;

@Service
public interface Services {
	public List<Students> findAll();

	// Find student record by using its id
	public Students findById(int id);

	// Insert and update method
	public void save(Students student);

	// Delete method
	public void deleteById(int id);

}
