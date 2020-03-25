package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String job ="";
        job += "Id: " + getId();
        if(getName()==""){
            job += "\nName: Data not available";
        }
        else{
            job += "\nName: " + getName();
        }
        if(getEmployer().toString()==""){
            job += "\nEmployer: Data not available";
        }else{
            job += "\nEmployer: " + getEmployer();
        }

        if(getLocation().toString()==""){
            job += "\nLocation: Data not available";
        }else{
            job += "\nLocation: " + getLocation();
        }

        if(getPositionType().toString()==""){
            job += "\nPositionType: Data not available";
        }else{
            job += "\nPositionType: " + getPositionType();
        }
        if (getCoreCompetency().toString()==""){
            job += "\nCoreCompetency: Data not available";
        }else{
            job += "\nCoreCompetency: " +  getCoreCompetency();
        }

        return  job;
    }

@Override
public int hashCode() {
    return Objects.hash(getId());
}
@Override
    public boolean equals(Object o){
    if (this == o) return true;
    if (!(o instanceof Job)) return false;
    Job job = (Job) o;
    return getId() == job.getId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
