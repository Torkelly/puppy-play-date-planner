package ppdapp.beans;

public enum DogBreeds {
		AKITA("Akita"),
	    AUSTRALIAN_SHEPARD("Australian Shepherd"),
	    BEAGLE("Beagle"),
	    BOXER("Boxer"),
	    BULLDOG("Bulldog"),
	    CHIHUAHUA("Chihuahua"),
	    CHOW_CHOW("Chow Chow"),
	    DACHSHUND("Dachshund"),
	    FRENCH_BULLDOG("French Bulldog"),
	    GERMAN_SHEPARD("German Shepard"),
	    GREAT_DANE("Great Dane"),
	    MIXED_MUTT("Mixed/Mutt"),
	    PITBULL("Pitbull"),
	    POINTER("Pointer"),
	    POMERANIAN("Pomeranian"),
	    POODLE("Poodle"),
	    PUG("Pug"),
	    LABRADOR("Retriever - Labrador"),
	    GOLDEN("Retriever - Golden"),
	    ROTTWEILER("Rottweiler"),
	    SAMOYED("Samoyed"),
	    SIBERIAN_HUSKY("Siberian Husky"),
	    SHIH_TZU("Shih Tzu"),
	    WELSH_CORGI("Welsh Corgi"),
	    YORKSHIRE_TERRIER("Yorkshire Terrier"),
	    OTHER("Other");

	        private String dogBreeds;
	        private DogBreeds(String dogBreeds){
	            this.dogBreeds = dogBreeds;
	        }

	        @Override
	        public String toString() {
	            return dogBreeds;
	        }

}
