package org.designpatterns.creational.factory.courses;

public class CourseFactory {
    public static Course getCourse(String courseName){
        Course course = null;
        if("LLD".equals(courseName)){
            course = new LLD();
        }
        else if("HLD".equals(courseName)){
            course = new HLD();
        }
        return course;
    }
}
