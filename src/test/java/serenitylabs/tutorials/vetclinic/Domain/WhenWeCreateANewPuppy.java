package serenitylabs.tutorials.vetclinic.Domain;

import org.junit.Assert;
import org.junit.Test;

public class WhenWeCreateANewPuppy {

    @Test

    public void a_new_puppy_should_have_a_name() throws Exception{
       // Puppy coffee = new Puppy("Coffee", "Shepherd","THE_FOURTH_OF_JULY");

        // step 1 in the Builder Pattern ,we write a dedicated class to craete instances of the class which we want to build as follow .

        Puppy coffee = Puppy.called("Coffee")
                             .ofBreed("Shepherd")
                             .bornOn("THE_FOURTH_OF_JULY")
                             .build();

        //step2 -Create method Puppy.called() >> This first call creates the builder instance >>> create Puppy reord for us

        Assert.assertEquals("Coffee", coffee.getName());
        Assert.assertEquals("Shepherd", coffee.getBreed());
        Assert.assertEquals("THE_FOURTH_OF_JULY", coffee.getDateOfBirth());
    }


}
