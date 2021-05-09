package serenitylabs.tutorials.vetclinic.Domain;

import java.security.cert.CertPathBuilder;

public class Puppy {
    private final String name;
    private final String breed;
    private final String dateOfBirth;

    public Puppy(String name, String breed, String dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {        return name;    }

    public String getBreed() {        return breed;    }

    public String getDateOfBirth() {        return dateOfBirth;    }


    //--- Step 3- out put of Step2 >>>Crete public static PuppyBuilder using called method.
    public static PuppyBuilder called(String name) {
        return new PuppyBuilder(name);  // create new instance of PubbyBuilder
    }
    //Step 4 -create inner  class PuppyBuilder and make the builder class a staic inner class ,

    public static class PuppyBuilder {   //make this class public -> This part of step 4
        private String name;             //this is output of step 7
        private String breed;            //this is output of step 8
        private String dateOfBirth;


        public PuppyBuilder (String name) {    //Create objectBuilder with value (called)-> This part of step 4
        this.name = name;                      // step 7 create parameter value for name

        }

    // Step 5 ,create next method ofBreed
        public PuppyBuilder ofBreed(String breed) {   // step 8 create parameter value for breed
            this.breed = breed;
            return this;
        }
          public PuppyBuilder bornOn(String dateOfBirth) {       //  step 10 create method for dateOfBirth, and create parameter value for dateOfBirth
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public Puppy build() {
            return new Puppy(name,breed,dateOfBirth); // step 9 Create dog ,and will use constructor here and add new contructor value dateOfbirth
        }

    }




}
