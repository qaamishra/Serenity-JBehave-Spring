package com.qa.amishra.base;

import com.qa.amishra.Basic.ReuseableUtility;
import com.qa.amishra.Basic.SpringJdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;


@Component
@ContextConfiguration(classes = {SpringJdbcConfig.class})
public class BaseSteps {

    @Autowired
    protected ReuseableUtility reuseableUtility;


}
