
public class Doe extends Walker{

	public Doe(String FirstNameAnimal, double WeightAnimal, int GenderAnimal,double RunningSpeed, double TailLength) {
		super(FirstNameAnimal,WeightAnimal,GenderAnimal,RunningSpeed,TailLength);
	}
	public Doe(Doe a) {
		super(a.FirstNameAnimal,a.getWeightAnimal(),a.getGenderAnimal(),a.getRunningSpeed(),a.getTailLength());
	}
	
	public void converse() {
		System.out.println(FirstNameAnimal + ": Laillatilati");
	}
	public String toString() {
		return ("The First Name: " + FirstNameAnimal + " The Weight: " + WeightAnimal + " The Gender: " + GenderAnimal + " The Running Speed: " + RunningSpeed + " The Tail Length: " + TailLength);
	}
}
