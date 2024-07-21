
public abstract class Reptile extends Animal {
		protected double AnimalLength;

		public Reptile(String FirstNameAnimal, double WeightAnimal, int GenderAnimal,double AnimalLength) {
			super(FirstNameAnimal, WeightAnimal, GenderAnimal);
			this.AnimalLength = AnimalLength;
		
		}
		public Reptile(Reptile a) {
			super(a.FirstNameAnimal, a.getWeightAnimal(), a.getGenderAnimal());
			this.AnimalLength = a.AnimalLength;
		}
		public double getAnimalLengh() {
			return AnimalLength;
		}
		public void setAnimalLengh(double AnimalLength) {
			if(AnimalLength >= 0)
				this.AnimalLength = AnimalLength;
			else {
				this.AnimalLength = 0;
			}
		}
		public void goOut() {
			System.out.println(FirstNameAnimal + ": crawling out");
		}
		
		
		

}
