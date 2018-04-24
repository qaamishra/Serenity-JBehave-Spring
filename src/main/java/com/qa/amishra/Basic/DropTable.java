package com.qa.amishra.Basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DropTable {

    private final Logger logger = LoggerFactory.getLogger(DropTable.class);
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void dropEmployeeTable() {
        jdbcTemplate.execute(QueryTo.dropEmpolyeeTable());
        logger.info("Table Dropped");
    }

}
