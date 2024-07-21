
public abstract class Walker extends Animal {
	protected double RunningSpeed;
	protected double TailLength;

	public Walker(String FirstNameAnimal, double WeightAnimal, int GenderAnimal,double RunningSpeed, double TailLength) {
		super(FirstNameAnimal, WeightAnimal, GenderAnimal);
		this.RunningSpeed = RunningSpeed;
		this.TailLength = TailLength;
	}
	
	public Walker(Walker a) {
		super(a.FirstNameAnimal,a.getWeightAnimal(),a.getGenderAnimal());
		this.RunningSpeed = a.RunningSpeed;
		this.TailLength = a.TailLength;
	}
	public double getRunningSpeed() {
		return RunningSpeed;
	}
	public double getTailLength() {
		return TailLength;
	}
	public void setRunningSpeed(double RunningSpeed) {
		if(RunningSpeed >= 0)
			this.RunningSpeed = RunningSpeed;
		else {
			this.RunningSpeed = 0;
		}
	}
	public void setTailLength(double TailLength) {
		if(TailLength >= 0)
			this.TailLength = TailLength;
		else {
			this.TailLength = 0;
		}
	}
	public void goOut() {
		System.out.println(FirstNameAnimal + ": strolling out");
	}

		
	
	

}
