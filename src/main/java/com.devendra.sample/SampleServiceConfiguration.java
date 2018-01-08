package com.devendra.sample;

import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.db.DatabaseConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class SampleServiceConfiguration extends Configuration {

	@Valid
	@NotNull
	private DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration();

	public DatabaseConfiguration getDatabaseConfiguration() {
		return databaseConfiguration;
	}

	public void setDatabaseConfiguration(
			DatabaseConfiguration databaseConfiguration) {
		this.databaseConfiguration = databaseConfiguration;
	}

}
