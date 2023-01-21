package org.designpatterns.creational.factory.courses;

import org.designpatterns.creational.factory.modules.*;

public class LLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new SummaryModule());
        modules.add(new ConceptModule());
        modules.add(new DemoModule());
        modules.add(new ExerciseModule());

    }
}
