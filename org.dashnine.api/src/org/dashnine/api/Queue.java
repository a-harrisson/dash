package org.dashnine.api;

public interface Queue {

	void queue(Build build);

	Build pop();
}
