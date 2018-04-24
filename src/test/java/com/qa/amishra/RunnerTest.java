package com.qa.amishra;


import com.qa.amishra.base.BaseSteps;
import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.reporters.StoryReporterBuilder;

import java.util.ArrayList;
import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class RunnerTest extends SerenityStories {

    //Reports will come here : /target/site/serenity/index.html  : Please trigger : mvn clean verify

    @BeforeStories

    public void BeforeStoriesSetup() {

        System.out.println("BeforeStoriesSetup");
    }

    @AfterStories
    public void AfterStoriesTearDown() {
        System.out.println("AfterStoriesTearDown");
    }


    @Override
    public List<String> storyPaths() {

        List<String> storiesToRun = new ArrayList<String>();

        //If you want to run a single/multiple but not all stories from this Junit,set the property below as System.setProperty("story", "Demo.story");
        //If you want to run all stories : mvn clean verify
        String storyProperty = System.getProperty("story"); //This is -Dstory : mvn clean verify -Dstory="Demo.story"  : mvn clean verify -Dstory="Trial.story" :mvn clean verify -Dstory="Demo.story,Trial.story"

        StoryFinder sf = new StoryFinder();

        //If nothing provided at command line or if running from this Junit class all the stories will be picked for running.
        if (storyProperty == null || storyProperty.isEmpty()) {
            return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.story", "");
        } else {
            String[] storyNames = storyProperty.split(",");
            for (String storyName : storyNames) {
                storiesToRun.addAll(sf.findPaths(CodeLocations.codeLocationFromClass(this.getClass()), "**/" + storyName, ""));
            }
            return storiesToRun;
        }

    }



}
