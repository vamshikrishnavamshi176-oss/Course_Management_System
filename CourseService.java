package Container;

import java.util.*;

public interface CourseService {

    List<Course> courses = new ArrayList<>();

    static void addCourse(Course c) {
        courses.add(c);
    }

    static void removeCourse(String name) {
        courses.removeIf(course ->
                course.getCourseName().equalsIgnoreCase(name));
    }

    static List<Course> getCourses() {
        return courses;
    }

    static Course findCourse(String name) {
        for(Course c : courses) {
            if(c.getCourseName().equalsIgnoreCase(name))
                return c;
        }
        return null;
    }
}

