package serenitylabs.tutorials.vetclinic.Domain;

import java.time.LocalDateTime;

public class Dog1 {

    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String favouriteFood;
    private final String colour;
    private final String favouriteToy;

// also change construction from public to private so no-one can change constructor prameterter
    private Dog1(String name, String breed, LocalDateTime dateOfBirth, String colour, String favouriteToy,String favouriteFood) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
        this.colour = colour;
        this.favouriteToy = favouriteToy;
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getColour() {
        return colour;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }
    
//----
    // Step 1 -create static method for 1st method of build pattern from test class( i.e .called) with <ClassBuilder>

    public static WithBreed called(String name) {
        return new Dog1Builder(name);           // return new DogBuilder(first constrauctor paramter)
    }

   

    public interface WithBreed {
             OfColour ofBreed(String breed);
     }
   public  interface OfColour {
         Dog1Builder ofColour(String colour);
     }

    // step 2 create inner *public class
    public static class Dog1Builder implements WithBreed, OfColour {
        private String name;
        private String breed;
        private String colour;
        private String favouriteFood;
        private LocalDateTime dateOfBirth;
        private String favoriteToy;

        //Step 3 Create method for each builderclass and return paramters and declars feilds
        public Dog1Builder(String name) {
            this.name = name;
        }


        public Dog1Builder bornOn(LocalDateTime dateOfBirth) {
            this.dateOfBirth =dateOfBirth;
            return this;
        }

        public Dog1Builder ofBreed(String breed) {
            this.breed =breed;
            return this;
        }

        public Dog1Builder ofColour(String colour) {
            this.colour =colour;
            return this;
        }

        public Dog1 withFavouriteFood(String favouriteFood) {
            return new Dog1 (name,breed,dateOfBirth,colour,favoriteToy,favouriteFood);
        }

        public Dog1Builder withFavoriteToy(String favoriteToy) {
            this.favoriteToy = favoriteToy;
            return this;
        }
    }
    }

















































/*-----

    //In the Builder Pattern,you write a dedicated class to create instances of the class you want to build
    public static WithBreed called(String name) {                 //The first call creates the builder instance i.e DogBuilder
        return new Dog1Builder(name);
    }


    interface WithBreed {
        ofColour ofBreed(String breed);
    }

    interface ofColour{
        Dog1Builder ofColour(String colour);
    }
// 1.Dog Builder class with  fields values which  corresponds to the the value which are  going to pass through the constructors name,breed ,birthday etc

    public  static class Dog1Builder implements WithBreed,ofColour{
        private String name;               //make DogBuilder public class a static inner class
        private String breed;
        private LocalDateTime birthday;
        private String favouriteFood;
        private String colour;


        public Dog1Builder(String name){             //we create  DogBuilder -> when we say Dog1.called -> Dog1.called creates Dog1Builder
            this.name = name;
        }

        public Dog1Builder ofBreed(String breed) {
            this.breed = breed;
            return this; }


        public Dog1 bornOn(LocalDateTime birthday) {
           return  new Dog1(name,breed,birthday,favouriteFood,colour);
    }

        public Dog1Builder withFavouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }

        public Dog1Builder ofColour(String colour) {
            this.colour = colour;
            return this;
        }

  /*   public Dog build() {
            return new Dog(name,breed,birthday);
        }

}
}
*/