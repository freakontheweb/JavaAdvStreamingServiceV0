package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public Profile(String name, LocalDate dateOfBirth) {
        setName(name);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        return Period.between(getDateOfBirth(), LocalDate.now()).getYears();
    }

    public boolean allowedToWatch(Content content) {
        boolean allowed;
        int minimumAge = content.getMaturityRating().getMinimumAge();

        if (dateOfBirth == null) {
            allowed = false;
        } else if (getAge() >= minimumAge) {
            allowed = true;
        } else {
            allowed = false;
        }
        return allowed;
    }
}
