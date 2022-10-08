package main;

import java.util.List;

public class JobSeeker {
    String firstName;
    String lastName;
    String jobTitle;
    List<Application> applications;
    Integer salaryExpectation;

    public JobSeeker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
