
public class ZooZoo {

	public static void main(String[] args) {
		
		
		Animal animals[] = new Animal[10];
		animals[0] = new Elephant("Pili",100,0,17,2);
		animals[1] = new Doe("Dodi",20,1,10,1);
		animals[2] = new Elephant("Papi",120,1,10,1);
		animals[3] = new Doe("Dagal",30,0,21,2);
		animals[4] = new Snake("Shis",50,0,3);
		animals[5] = new Alligator("Ali",70,0,4);
		animals[6] = new Snake("Shas",20,1,2);
		animals[7] = new Alligator("Gadi",65,1,5);
		animals[8] = new Elephant("Eli",130,1,15,2);
		animals[9] = new Doe("Dan",25,0,25,2);
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].goOut();
			animals[i].converse();
			animals[i].getBack();
		}
		
		
		
//		Animal ind = animals[0];
//		double maxw = animals[0].getWeightAnimal();
//		
//		for (int i = 0; i < animals.length; i++) {
//			if(animals[i].getWeightAnimal() > maxw) {
//				maxw = animals[i].getWeightAnimal();
//				ind = animals[i];
//			}
//				
//		}
		int ind = 0;
		double maxw = 0;
		
		for (int i = 0; i < animals.length; i++) {
			if(animals[i].getWeightAnimal() > maxw) {
				maxw = animals[i].getWeightAnimal();
				ind = i;
			}
				
		}
		
		System.out.println(animals[ind]);

			
		

	}

}
