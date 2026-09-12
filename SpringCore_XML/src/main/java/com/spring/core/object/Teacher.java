package com.spring.core.object;

public class Teacher {
	private int teacherId;
	private String teacherName;

	public Teacher(int teacherId, String teacherName) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
	}

	public Teacher() {

	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + "]";
	}

}
