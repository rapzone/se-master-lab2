package ru.edu.asu.builder;

import java.util.ArrayList;

public class ParseTest {

	public static void main(String[] args) {
		/*EmailListConverter emailBuilder = new EmailListConverter();
		DocReader reader = new DocReader(emailBuilder, "projects.xml");
		reader.build();
		ArrayList<String> emailList = emailBuilder.getEmailList();
		System.out.println("------- Email ---------");
		for (String email : emailList) {
			System.out.println(email);
		}
		SupervisorConverter supervisorConverter = new SupervisorConverter();
		reader = new DocReader(supervisorConverter, "projects.xml");
		reader.build();
		ArrayList<String> supervisorList = supervisorConverter.getSupervisors();
		System.out.println("--------- Сотрудники ---------");
		for (String supervisor : supervisorList) {
			System.out.println(supervisor);
		}*/
		
		//------------------------------------------------------------------------------------

		ArrayList<Project> projects;
		NodeConverter projectbuilder = new ProjectConverter();
		DocReader reader = new DocReader(projectbuilder, "projects.xml");

		projects = reader.build();

		for (Project project : projects) {
			System.out.println(project);
		}

	}

}
