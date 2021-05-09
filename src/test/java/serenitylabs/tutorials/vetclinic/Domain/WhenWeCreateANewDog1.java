package serenitylabs.tutorials.vetclinic.Domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenWeCreateANewDog1 {

    @Test
    public void a_new_dog_should_have_a_mandatory_fields() throws Exception {
        LocalDateTime birthday = LocalDateTime.now();

        // Dog1 fido = new Dog1("Fido", "Poodle", birthday); //immutable dog

        Dog1 fido = Dog1.called("Fido")  //mandatory
                        .ofBreed("Poodle")   //mandatory
                        .ofColour("Black")   //mandatory
                        .withFavouriteFood("Pizza"); //mandatory
                      // .build();

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals("Black", fido.getColour());
        Assert.assertEquals("Pizza", fido.getFavouriteFood());


    }

    @Test
    public void a_new_dog_should_have_a_Optional_field_birth_date() throws Exception {
        LocalDateTime birthday = LocalDateTime.now();

        // Dog1 fido = new Dog1("Fido", "Poodle", birthday); //immutable dog

        Dog1 fido = Dog1.called("Fido")  //mandatory
                .ofBreed("Poodle")   //mandatory
                .ofColour("Black")   //mandatory
                .bornOn(birthday)  // optional
                 .withFavouriteFood("Pizza"); //mandatory
        // .build();

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals("Black", fido.getColour());
        Assert.assertEquals(birthday, fido.getDateOfBirth());
        Assert.assertEquals("Pizza", fido.getFavouriteFood());



    }

    @Test
    public void a_new_dog_should_have_a_Optional_field_favourite_toy() throws Exception {
        LocalDateTime birthday = LocalDateTime.now();

        // Dog1 fido = new Dog1("Fido", "Poodle", birthday); //immutable dog

        Dog1 fido = Dog1.called("Fido")  //mandatory
                .ofBreed("Poodle")   //mandatory
                .ofColour("Black")   //mandatory
                 .withFavoriteToy("bone") //Optional
                .withFavouriteFood("Pizza"); //mandatory
        // .build();

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals("Black", fido.getColour());
        Assert.assertEquals("Pizza", fido.getFavouriteFood());
        Assert.assertEquals("bone", fido.getFavouriteToy());



    }
}
