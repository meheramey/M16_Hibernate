package com.cg.service;

import com.cg.entities.Student;

public interface Studentservice
{
	public abstract void addStudent(Student student);
	public abstract Student findStudentById(int id);
	public abstract void updateStudent(Student student);
	public abstract void removeStudent(Student student);
}
