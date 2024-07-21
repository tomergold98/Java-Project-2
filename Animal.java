
public abstract class Animal {
	protected String FirstNameAnimal;
	protected double WeightAnimal;
	protected int GenderAnimal;
	
	public Animal(String FirstNameAnimal,double WeightAnimal,int GenderAnimal) {
		this.FirstNameAnimal = FirstNameAnimal;
		if(WeightAnimal > 0)
			this.WeightAnimal = WeightAnimal;
		else {
			this.WeightAnimal = 0;
		}
		if(GenderAnimal == 0 || GenderAnimal == 1)
			this.GenderAnimal = GenderAnimal;
		else {
			this.GenderAnimal = 0;
		}
	}
	public Animal(Animal a) {
		this.FirstNameAnimal = a.FirstNameAnimal;
		this.WeightAnimal = a.WeightAnimal;
		this.GenderAnimal = a.GenderAnimal;
	}
	
	public String getFirstNameAnimal() {
		return FirstNameAnimal;
	}
	public double getWeightAnimal() {
		return WeightAnimal;
	}
	public int getGenderAnimal() {
		return GenderAnimal;
	}
	public void setFirstNameAnimal(String FirstNameAnimal) {
		this.FirstNameAnimal = FirstNameAnimal;
	}
	public void setWeightAnimal(double WeightAnimal) {
		if(WeightAnimal > 0)
			this.WeightAnimal = WeightAnimal;
		else {
			this.WeightAnimal = 0;
		}
	}
	public void setGenderAnimal(int GenderAnimal) {
		if(GenderAnimal == 0 || GenderAnimal == 1)
			this.GenderAnimal = GenderAnimal;
		else {
			this.GenderAnimal = 0;
		}
	}
	public abstract void goOut();
		
	
	public abstract void converse();
		
	
	public void getBack() {
		System.out.println(FirstNameAnimal + ": getting back");
		
	}
	
	

}
