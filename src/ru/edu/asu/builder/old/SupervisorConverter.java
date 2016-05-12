package ru.edu.asu.builder.old;

import ru.edu.asu.builder.old.AbstractConverter;

import java.util.ArrayList;

public class SupervisorConverter extends AbstractConverter {

	private ArrayList<String> supervisors = new ArrayList<String>();

	public ArrayList<String> getSupervisors() {
		return supervisors;
	}

	//@Override
	public void readSupervisor(String supervisorName) {
		supervisors.add(supervisorName);
	}

}
