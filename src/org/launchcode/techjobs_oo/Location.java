package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField {


    public Location(String value) {
        super(value);


    }

    //  constructor should also call the empty constructor in order to initialize the 'id' field.


    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return this.getId() == location.getId();
    }


}
