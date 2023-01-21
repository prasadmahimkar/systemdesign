package org.designpatterns.creational.factory.courses;

import org.designpatterns.creational.factory.modules.ConceptModule;
import org.designpatterns.creational.factory.modules.DemoModule;
import org.designpatterns.creational.factory.modules.IntroModule;

public class HLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ConceptModule());
        modules.add(new DemoModule());
    }
}
