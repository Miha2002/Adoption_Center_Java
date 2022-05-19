package Animals;

public class Other extends Animal implements Adoptable{
    String species;

    public Other(){}

    public Other(String name, String sex, int age, int weight,
                 Boolean trained, String species) {
        super(name, sex, age, weight, trained);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void adoptMe(){
        System.out.println("I am "+name+", a "+age+" year(s) old"+species+
                " and I'm looking for my forever home.");
    }


}


