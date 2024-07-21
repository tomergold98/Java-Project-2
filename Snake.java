
public class Snake extends Reptile{
	
	public Snake(String FirstNameAnimal, double WeightAnimal, int GenderAnimal,double AnimalLength) {
		super(FirstNameAnimal,WeightAnimal,GenderAnimal,AnimalLength);
	}
	public Snake(Snake a) {
		super(a.FirstNameAnimal,a.getWeightAnimal(),a.getGenderAnimal(),a.getAnimalLengh());
	}
	public void converse() {
		System.out.println(FirstNameAnimal + ": Tsssssssss");
	}
	public String toString() {
		return ("The First Name: " + FirstNameAnimal + " The Weight: " + WeightAnimal + " The Gender: " + GenderAnimal + " Animal Length: " + AnimalLength);
	}
}
