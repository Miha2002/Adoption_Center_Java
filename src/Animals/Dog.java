package Animals;

public class Dog extends Animal implements Adoptable{
    String breed;
    static int count_dog = 0;

    {
        count_dog++;
    }

    public Dog(){
        id = 1000 + count_dog;
    }

    public Dog(String name, String sex, int age, int weight,
               Boolean trained, String breed) {
        super(name, sex, age, weight, trained);
        this.breed = breed;

        id = 1000 + count_dog;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getCount_dog() {
        return count_dog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", trained=" + trained +
                ", breed='" + breed + '\'' +
                '}';
    }

    public void adoptMe(){
        if(trained)
            System.out.println("I am "+name+", a trained "+age+" year(s) old "+breed+
                    " and I'm looking for my forever home.");
        else
            System.out.println("I am "+name+", a "+age+" year(s) old "+breed+
                    " and I'm looking for my forever home.");

    }


}
