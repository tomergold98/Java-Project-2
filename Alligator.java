
public class Alligator extends Reptile{

	public Alligator(String FirstNameAnimal, double WeightAnimal, int GenderAnimal,double AnimalLength) {
		super(FirstNameAnimal,WeightAnimal,GenderAnimal,AnimalLength);
	}
	public Alligator(Alligator a) {
		super(a.FirstNameAnimal,a.getWeightAnimal(),a.getGenderAnimal(),a.getAnimalLengh());
	}
	public void converse() {
		System.out.println(FirstNameAnimal + ": Whaaaaaaaammmmmmm");
	}
	public String toString() {
		return ("The First Name: " + FirstNameAnimal + " The Weight: " + WeightAnimal + " The Gender: " + GenderAnimal + " Animal Length: " + AnimalLength);
	}

}
