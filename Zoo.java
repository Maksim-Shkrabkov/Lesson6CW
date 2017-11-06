package by.htp.les6;

public class Zoo {
	
	private Animal[] animals;
	
	
	public Zoo() {
		animals = new Animal[5];
	}
	
	public void addAnimal(Animal animal, int position) {
		animals[position] = animal;
	}
	
	
	
	public void timeToPlay() {
		
		for(Animal animal: animals) {
			
			if(animal != null) {
			
				animal.play();
			
			}
		}
		
	}

}
