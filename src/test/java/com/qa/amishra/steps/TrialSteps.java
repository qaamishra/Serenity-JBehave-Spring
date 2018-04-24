package com.qa.amishra.steps;

import com.qa.amishra.Basic.Other;
import com.qa.amishra.base.BaseSteps;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.prefs.BackingStoreException;

public class TrialSteps extends BaseSteps{

    @Autowired
    protected Other other;

    @Step
    public void some(){
        other.someMethod();
    }

}
