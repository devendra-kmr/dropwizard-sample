package com.devendra.sample;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.jdbi.DBIFactory;
import org.skife.jdbi.v2.DBI;

public class SampleApp extends Service<SampleServiceConfiguration> {


    private final static Logger logger = Logger
            .getLogger(SampleApp.class.getName());

    public static void main(String[] args) throws Exception {

        new SampleApp().run(args);

    }


    @Override
    public void initialize(Bootstrap<SampleServiceConfiguration> bootstrap) {

        bootstrap.setName("sampleconfig");

    }

    @Override
    public void run(SampleServiceConfiguration configuration,
                    Environment environment) throws Exception {

        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment,
                configuration.getDatabaseConfiguration(), "postgresql");



    }

}