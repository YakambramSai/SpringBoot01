package com.example.demo;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.StudentController;
import com.example.demo.modal.Course;
import com.example.demo.service.StudentService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SpringBoot01ApplicationTests {
	@InjectMocks
	StudentController studentController;
	
	@Mock
	StudentService  studentService;
	
	
	
	@Test
	public void contextLoads() {
		
	}
	
	
	
	@Test
	public void retrieveCoursesForStudent() {
		List<Course> courseList=mockCourses();
		when(studentService.retrieveCourses("Student1")).thenReturn(courseList );
		System.out.println(studentController.retrieveCoursesForStudent("Student1"));
	}



	/**
	 * @return
	 */
	private List<Course> mockCourses() {
		List<Course> courseList=new ArrayList<>();
		courseList.add(new Course("2","B1", null, null));
		return courseList;
	}

}
