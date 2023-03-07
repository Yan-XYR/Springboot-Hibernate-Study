package com.yaxu.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "1"),
				new Course(2, "Learn DevOps", "2"),
				new Course(3, "Learn Azure", "3"),
				new Course(4, "Learn GCP", "4")
				
				);
	}

}
