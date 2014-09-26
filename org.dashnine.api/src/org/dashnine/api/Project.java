package org.dashnine.api;

import java.util.List;

import aQute.bnd.annotation.ConsumerType;
import aQute.bnd.annotation.ProviderType;

@ConsumerType
@ProviderType
public interface Project {

	List<Job> getJobs();
	
	void addJob(Job job);
	
}
