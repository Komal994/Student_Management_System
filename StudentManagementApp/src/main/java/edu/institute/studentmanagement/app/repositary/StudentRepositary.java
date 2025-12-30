package edu.institute.studentmanagement.app.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.studentmanagement.app.model.*;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Integer> {

	
	
}
