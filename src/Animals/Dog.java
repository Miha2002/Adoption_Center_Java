package Animals;

public class Dog extends Animal implements Adoptable{
    String breed;

    public Dog(){}

    public Dog(String name, String sex, int age, int weight,
               Boolean trained, String breed) {
        super(name, sex, age, weight, trained);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void adoptMe(){
        System.out.println("I am "+name+", a "+age+" year(s) old "+breed+
                " and I'm looking for my forever home.");
    }


}
