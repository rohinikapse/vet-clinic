package serenitylabs.tutorials.vetclinic.Domain;

import org.junit.Assert;
import org.junit.Test;

public class WhenWeCreateANewDog {
    @Test

    public void a_new_dog_should_have_a_name_a_breed_a_colour_a_date_of_birth() throws Exception {
      //Dog fido = new Dog("Fido", "THE_FOURTH_OF_JULY");

        Dog fido = DogBuilder.aDog()
                     .called("Fido")
                       .ofBreed("Labrador")
                      .ofColour("Black")
                     .bornOn("THE_FOURTH_OF_JULY");


        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("THE_FOURTH_OF_JULY", fido.getDateOfBirth());
        Assert.assertEquals("Labrador", fido.getBreed());

    }

    @Test

    public void a_dog_can_have_an_optional_favourite_food() throws Exception {
        Dog fido = DogBuilder.aDog()
                      .called("Fido")  //mandatory
                      .ofBreed("Labrador")   //mandatory
                      .ofColour("Black")      //mandatory
                       .withFavouriteFood("Milk") //optional
                      .bornOn("THE_FOURTH_OF_JULY");  //mandatory

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Black",fido.getColour());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("THE_FOURTH_OF_JULY", fido.getDateOfBirth());
        Assert.assertEquals("Milk", fido.getFavouriteFood());

    }

    @Test

    public void a_dog_can_have_an_optional_favourite_toy() throws Exception {
        Dog fido = DogBuilder.aDog()
                .called("Fido")  //mandatory
                .ofBreed("Labrador")   //mandatory
                .ofColour("Black")      //mandatory
                .withFavouriteToy("Bone") //optional
                .bornOn("THE_FOURTH_OF_JULY");  //mandatory

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Black",fido.getColour());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("THE_FOURTH_OF_JULY", fido.getDateOfBirth());
        Assert.assertEquals("Bone", fido.getFavouriteToy());

    }

}



