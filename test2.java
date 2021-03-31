
class Dog {
    String name;

    public void bark() {
        System.out.println("Ruff!");
    }
}
class test {
    public static void main(String[] args) {
        Dog[] pets;
        pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();
        System.out.println(pets[2]);
        pets[3] = pets[0];

        }
    }