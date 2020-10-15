public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
    Dog firstDog = new Dog("Jill", "Jack-Russel", 14.7, "Black and White", false);
    Dog secondDog = new Dog("Peter", "Bulldog", 9.8, "Black", true);
    Dog thirdDog = new Dog("Isabell", "Poodle", 7.3, "Grey", true);

    System.out.println(firstDog.getHouseTrainedCondition()); // false
    System.out.println(secondDog.getBreed()); // Peter 
    System.out.println(thirdDog.getWeight()); // 7.3

    System.out.println(thirdDog.toString());//Isabell 🐶

  }
}