package org.launchcode.techjobs_oo.tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
    Job job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
@Test
    public void testSettingJobId (){
    assertTrue(!job1.equals(job2));
    assertTrue(job2.getId()-job1.getId()==1);
    }
@Test
    public void testJobConstructorSetsAllFields (){
    assertTrue(job1.getId()==1);
    assertTrue(job1.getName().equals("Product tester"));
    assertTrue(job1.getEmployer().toString().equals("ACME"));
    assertTrue(job1.getLocation().toString().equals("Desert"));
    assertTrue(job1.getPositionType().toString().equals("Quality control"));
    assertTrue(job1.getCoreCompetency().toString().equals("Persistence"));
}
@Test
    public void testJobsForEquality (){
    assertFalse(job2.equals(job3));
}
@Test
    public void testToString(){
        String str =  "Id: 4\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "PositionType: Quality control\n" +
                "CoreCompetency: Persistence";
        assertEquals(job1.toString(),str);
}

}
