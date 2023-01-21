package org.designpatterns.creational.factory;

import org.designpatterns.creational.factory.courses.Course;
import org.designpatterns.creational.factory.courses.CourseFactory;
import org.designpatterns.creational.factory.modules.Module;

import java.util.List;

public class FactoryDemoApp {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        System.out.println("HLD Details :: "+hldCourse.getModules());
        hldCourse.displayCourseModulesDescription();

        Course lldCourse = CourseFactory.getCourse("LLD");
        System.out.println("LLD Details :: "+lldCourse.getModules());
        List<Module> lldCourseModules = lldCourse.getModules();
        for (Module module:lldCourseModules) {
            module.displayDescription();
        }
    }
}
