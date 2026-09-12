package com.spring.core.object;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> subjects;
	private Teacher teacher;

	public Student(int id, String name, List<String> subjects, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.teacher = teacher;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", teacher=" + teacher + "]";
	}

}
