
public class Elephant extends Walker {

	public Elephant(String FirstNameAnimal, double WeightAnimal, int GenderAnimal,double RunningSpeed, double TailLength) {
		super(FirstNameAnimal,WeightAnimal,GenderAnimal,RunningSpeed,TailLength);
	}	
	public Elephant(Elephant a) {
		super(a.FirstNameAnimal,a.getWeightAnimal(),a.getGenderAnimal(),a.getRunningSpeed(),a.getTailLength());
	}
	
	public void converse() {
		System.out.println(FirstNameAnimal + ": WUOOOOOOO");
	}
	public String toString() {
		return ("The First Name: " + FirstNameAnimal + " The Weight: " + WeightAnimal + " The Gender: " + GenderAnimal + " The Running Speed: " + RunningSpeed + " The Tail Length: " + TailLength);
	}
}
	
