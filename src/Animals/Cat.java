package Animals;

public class Cat extends Animal implements Adoptable{
    String furPattern;
    String furColor;

    public Cat(){}

    public Cat(String name, String sex, int age, int weight,
               Boolean trained, String furPattern, String furColor) {
        super(name, sex, age, weight, trained);
        this.furPattern = furPattern;
        this.furColor = furColor;
    }

    public String getFurPattern() {
        return furPattern;
    }

    public void setFurPattern(String furPattern) {
        this.furPattern = furPattern;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void adoptMe(){
        System.out.println("I am "+name+", a "+age+" year(s) old "+ furColor+" "+
                furPattern+" cat and I'm looking for my forever home.");
    }


}
