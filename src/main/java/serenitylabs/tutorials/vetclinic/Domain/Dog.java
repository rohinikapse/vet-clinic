package serenitylabs.tutorials.vetclinic.Domain;
import java.time.LocalDateTime;

public class Dog {

    private final String name;
    private final String dateOfBirth;
    private final String breed;
    private final String colour;
    private final String favouriteFood;
    private final String toy;

    public Dog(String name, String breed, String dateOfBirth, String colour, String favouriteFood, String toy) {


        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.breed = breed;
        this.colour = colour;
        this.favouriteFood = favouriteFood;
        this.toy = toy;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getFavouriteToy() {
        return toy;
    }

}

//----------- DogBuilder---CLASS----------------------------------------------------------

  /*  public static WithBreed called(String name) {    // step 1create method on called
        return new DogBuilder(name);
    }*/

//-------section interface

//- Dog Builderclass moved with test logic




