public class JavaZoo {
    // attribute
    private static String zooName = "Java Park n Zoo";

    // constructor
    public JavaZoo() {}

    public static class ZooAnimal {
        private String name;
        private String type;
        private int age;
        private boolean isHungry;

        // constructor
        public ZooAnimal() {}

        public ZooAnimal(String name, String type, int age, boolean isHungry) {
            this.name = name;
            this.type = type;
            this.age = age;
            this.isHungry = isHungry;
        }

        // setter
        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHungry(boolean hungry) {
            isHungry = hungry;
        }

        // getter
        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public int getAge() {
            return age;
        }

        public boolean isHungry() {
            return isHungry;
        }
    }

    public static void main(String[] args) {
        // instantiate the ZooAnimal class;
        ZooAnimal animal = new ZooAnimal();
        ZooAnimal animal2 = new ZooAnimal();
        ZooAnimal animal3 = new ZooAnimal("Coop", "cat", 1, true);

        // setter
        animal.setName("Cheetahhh");
        animal.setType("monKey");
        animal.setAge(2);
        animal.setHungry(true);

        // getter
        System.out.println("The name of the animal: " + animal.getName());
        System.out.println("The type of the animal: " + animal.getType());
        System.out.println("The age of the animal: " + animal.getAge());
        System.out.println("Is the animal hungry?: " + animal.isHungry());

        System.out.println("\nThe second animal:");
        System.out.println("Name: " + animal2.getName());
        System.out.println("Type: " + animal2.getType());
        System.out.println("Age: " + animal2.getAge());
        System.out.println("Is hungry: " + animal2.isHungry());

        System.out.println("\nThe third animal:");
        System.out.println("Name: " + animal3.getName());
        System.out.println("Type: " + animal3.getType());
        System.out.println("Age: " + animal3.getAge());
        System.out.println("Is hungry: " + animal3.isHungry());
    }
}