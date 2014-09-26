package org.dashnine.api;

import java.util.List;

public interface User {

	List<Group> getGroups();

	String getUsername();
	
	List<Project> getProjects();

}
