package com.custObjSet;

public class Employee {
	
	private String id;
	private String name;
	private int age;
	
	private String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

}
