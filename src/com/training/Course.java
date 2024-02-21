package com.training;

public class Course {
    private String courseName;
    private float durationInHours;
    private int courseId;
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public float getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(float durationInHours) {
        this.durationInHours = durationInHours;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public Course(){}

    public Course(String courseName, float durationInHours, int courseId) {
        this.courseName = courseName;
        this.durationInHours = durationInHours;
        this.courseId = courseId;
    }
}
