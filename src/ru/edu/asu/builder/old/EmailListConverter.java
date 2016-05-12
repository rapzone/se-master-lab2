package ru.edu.asu.builder.old;

import java.util.ArrayList;

public class EmailListConverter /*extends AbstractConverter implements
		NodeConverter*/ {

	ArrayList<String> emailList = new ArrayList<String>();

	public ArrayList<String> getEmailList() {
		return emailList;
	}

	//@Override
	public void readEmail(String email) {
		emailList.add(email);
	}


}
