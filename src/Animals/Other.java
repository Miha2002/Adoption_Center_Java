package Animals;

public class Other extends Animal implements Adoptable{
    String species;
    static int count_other = 0;

    {
        count_other++;
    }

    public Other(){
        id = 3000 + count_other;
    }

    public Other(String name, String sex, int age, int weight,
                 Boolean trained, String species) {
        super(name, sex, age, weight, trained);
        this.species = species;

        id = 3000 + count_other;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Other{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", trained=" + trained +
                ", species='" + species + '\'' +
                '}';
    }

    public void adoptMe(){
        if(trained)
            System.out.println("I am "+name+", a trained "+age+" year(s) old "+species+
                    " and I'm looking for my forever home.");
        else
            System.out.println("I am "+name+", a "+age+" year(s) old "+species+
                    " and I'm looking for my forever home.");
    }


}


