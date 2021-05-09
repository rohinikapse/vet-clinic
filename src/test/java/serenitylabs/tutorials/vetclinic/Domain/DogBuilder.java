package serenitylabs.tutorials.vetclinic.Domain;


public class DogBuilder implements WithBreed, OfColour {             // step 2 create static public class
    private String name;
    private String breed;
    private String dateOfBirth;
    private String colour;
    private String favouriteFood;
    private String toy;

    public static DogBuilder aDog() {
        return new DogBuilder();
    }
    public WithBreed called(String name) {
        this.name = name;
        return this;
    }

    public OfColour ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public Dog bornOn(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return new Dog (name,breed,dateOfBirth,colour,favouriteFood,toy);
    }

    public DogBuilder ofColour(String colour) {
        this.colour = colour;
        return this;
    }

    public DogBuilder withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    public DogBuilder withFavouriteToy(String toy) {
        this.toy = toy;
        return this;
    }
}


