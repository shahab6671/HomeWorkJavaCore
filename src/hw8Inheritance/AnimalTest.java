package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		System.out.println("\n.......01.......Animal...............\n");
		Animal animal = new Animal();
		animal.animalInfo();// parents class
		
		System.out.println("\n......02.......Mammal.............\n");
		Mammal mammal = new Mammal(); // here animal is parents class so mammal(child class)can inherit animal as a(parents class)
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n......03......Birds.................\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n........04.....Robin................\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.animalInfo();
		robin.birdsInfo();

		System.out.println("\n.......05..... Dog..................\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.animalInfo();
		dog.mammalInfo();

		System.out.println("\n........06...BullDog................\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.animalInfo();
		bullDog.mammalInfo();

		System.out.println("\n.......07...... Snake..............\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.animalInfo();

		System.out.println("\n........08..... Cobra...............\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.animalInfo();

		System.out.println("\n........09..... Reptile.............\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

	}

}
