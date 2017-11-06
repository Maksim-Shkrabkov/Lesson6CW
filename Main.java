package by.htp.les6;

public class Main {

	public static void main(String[] args) {

//			A a = new A();
//			Object o = new A();
//			
//			Object ob = new B();
//			A ab = new B();
//			B b = new B();
//			
//			//Собеседование. Благодоря полиформизму тип ссылки может 
//			//быть родительским для типа самого обьекта
//			
//			Object[] obj = new Object[10];
//			obj[0] = new A();
//			obj[1] = new Object();
//			obj[2] = new B();
//			obj[3] =  new String(); 
			
		
//		Animal a = new Animal();
//		a.play();
		
		Cat c = new Cat();
		c.play();
		
		Tiger tiger = new Tiger();
		tiger.play();
		
		Zoo zoo = new Zoo();
//		zoo.addAnimal(a, 0);
		zoo.addAnimal(tiger, 1);
		zoo.addAnimal(c, 2);
		
		Animal monkey = new Monkey();
		Animal hamster = new Hamster();
		
		zoo.addAnimal(monkey, 3);
		zoo.addAnimal(hamster, 4);
		
		zoo.timeToPlay();
		
		String s = monkey.toString();
		System.out.println(s);
		
		
		
	}

}
