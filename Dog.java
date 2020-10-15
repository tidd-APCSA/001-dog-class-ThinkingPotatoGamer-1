class Dog{
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean houseTrained;
  
  public Dog(String name, String breed, double weight, String color, boolean houseTrained){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
    this.color = color;
    this.houseTrained = houseTrained;
  }


  public String getName(){
    return name;
  }

  public String getBreed(){
    return breed;
  }

  public double getWeight(){
    return weight;
  }

  public String getColor(){
    return color;
  }

  public boolean getHouseTrainedCondition(){
    return houseTrained;
  }

  //@override
  public String toString(){
   return name + " 🐶";
  }
}