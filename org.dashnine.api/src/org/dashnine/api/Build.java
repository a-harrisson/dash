package org.dashnine.api;

import java.util.List;

public interface Build {

	void start();

	void abort();

	List<Artefact> getArtefacts();

	Log getLog();
	

}
