package Animals;

public class Cat extends Animal implements Adoptable{
    String fur_pattern;
    String fur_color;
    static int count_cat = 0;

    {
        count_cat++;
    }

    public Cat(){
        id= 2000 + count_cat;
    }

    public Cat(String name, String sex, int age, int weight,
               Boolean trained, String fur_pattern, String fur_color) {
        super(name, sex, age, weight, trained);
        this.fur_pattern = fur_pattern;
        this.fur_color = fur_color;

        id= 2000 + count_cat;
    }

    public String getFur_pattern() {
        return fur_pattern;
    }

    public void setFur_pattern(String fur_pattern) {
        this.fur_pattern = fur_pattern;
    }

    public String getFur_color() {
        return fur_color;
    }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", trained=" + trained +
                ", fur_pattern='" + fur_pattern + '\'' +
                ", fur_color='" + fur_color + '\'' +
                '}';
    }

    public void adoptMe(){
        if(trained)
            System.out.println("I am "+name+", a trained "+age+" year(s) old "+ fur_color+" "+
                    fur_pattern+" cat and I'm looking for my forever home.");
        else
            System.out.println("I am "+name+", a "+age+" year(s) old "+ fur_color+" "+
                    fur_pattern+" cat and I'm looking for my forever home.");

    }


}
