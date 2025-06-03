package org.example;

public class Project {
    private String projectNumber;
    private int hours;


    public Project(String projectNumber) {
        this.projectNumber = projectNumber;
        this.hours = 0;

    }

    public void addHours(String project, int hours) {
        if(project.equals(this.projectNumber)) {
            this.hours += hours;
        }
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectNumber(){
        return this.projectNumber;
    }

    @Override
    public String toString() {
        return projectNumber + " " + hours;
    }
}
