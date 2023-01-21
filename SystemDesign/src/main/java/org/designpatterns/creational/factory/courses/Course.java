package org.designpatterns.creational.factory.courses;

import org.designpatterns.creational.factory.modules.Module;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected List<Module> modules = new ArrayList<>();

    public Course(){
        this.createCourse();
    }
    public List<Module> getModules() {
        return modules;
    }

    public void displayCourseModulesDescription(){
        for (Module module : modules) {
            module.displayDescription();
        }
    }

    public abstract void createCourse();
}
