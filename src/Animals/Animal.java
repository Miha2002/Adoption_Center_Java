package Animals;

public class Animal implements Training{
    int id;
    static int count = 0;
    String name;
    String sex; // f/m
    int age;
    int weight;
    Boolean trained;

    {
        count++;
    }

    public Animal(){}

    public Animal(String name, String sex, int age, int weight, Boolean trained) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.trained = trained;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Boolean getTrained() {
        return trained;
    }

    public void setTrained(Boolean trained) {
        this.trained = trained;
    }

    public void Train(){
        if(!trained)
            trained = true;
        else
            System.out.println("The animal was previously trained.\n");
    }
}
