/**
 * Created by sergo on 21.01.17.
 */
public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        cat.age = 10;
        cat.weight = 15;
        cat.strength = 8;
        cat1.age = 11;
        cat1.weight = 10;
        cat1.strength = 5;
        if (cat.fight(cat1)) {
            System.out.println("победил cat");
        }else System.out.println("победил cat1");

    }
    public boolean fight(Cat cat){
        if (this.age > cat.age) {return false;}
        else if (this.weight < cat.weight) {return false;}
        else if (this.strength < cat.strength) {return false;}

        else return true;
    }
}
