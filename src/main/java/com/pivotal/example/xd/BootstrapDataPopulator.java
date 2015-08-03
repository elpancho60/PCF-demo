package com.pivotal.example.xd;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@Service
public class BootstrapDataPopulator implements InitializingBean {

    private final Logger LOG = Logger.getLogger(BootstrapDataPopulator.class.getName());


    @Override
    @Transactional()
    public void afterPropertiesSet() throws Exception {
        LOG.info("Bootstrapping data...");

        // Create DB table

        LOG.info("...Bootstrapping completed");
    }


}