package com.qa.amishra.steps;

import com.qa.amishra.Basic.DropTable;
import com.qa.amishra.base.BaseSteps;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;


public class DemoSteps extends BaseSteps{

    @Autowired
    protected DropTable dropTable;

    @Step
    public int  myMethod() {
        return reuseableUtility.gettheNumber();
    }

    @Step
    public void dropTab(){

        dropTable.dropEmployeeTable();
    }


}