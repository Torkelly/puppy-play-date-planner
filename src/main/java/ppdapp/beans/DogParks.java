package ppdapp.beans;

public enum DogParks {
	
	 PEARSON_PARK("Pearson Park"),
     WATER_WORKS_PARK("Water Works Park"),
     RACCOON_RIVER_PARK("Raccoon River Park"),
     LEGION_PARK("Legion Park"),
     GRAYS_GARDENS("Gray's Gardens"),
     ASHBY_PARK("Ashby Park"),
     RIVERVIEW_PARK("Riverview Park"),
     BEAVERDALE_PARK("Beaverdale Park"),
     EWING_PARK("Ewing Park"),
     WILSON_PARK("Wilson Park"),
     ALL("All Puppy Owners");
	
	 private String dogParkName;
    private DogParks(String dogParkName){
            this.dogParkName = dogParkName;
    }

    @Override
    public String toString() {
            return dogParkName;
    }
}
