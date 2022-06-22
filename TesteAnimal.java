package br.com.generation.heranca;


public class TesteAnimal {

	public static void main(String[] args) {
	
		Cachorro auau1 = new Cachorro();
		auau1.setNome("Skye");
		auau1.setIdade(2);
		auau1.setSom("au au au");
		auau1.setPatas(4);
		System.out.println("O nome do cão é: "+ auau1.getNome());
		System.out.println("A idade do cão é:  "+ auau1.getIdade()+ " anos.");
		System.out.println("O som que o cão emite é assim:  " +auau1.isSom());
		System.out.println("O cão possui "+ auau1.getPatas()+" patas.");
		
		System.out.println();
		
		Borboleta butterfly = new Borboleta();
		butterfly.setNome("Blue");
		butterfly.setIdade(1);
		butterfly.setSom("chuua chuua");
	
		System.out.println("O nome da borboleta é: " + butterfly.getNome());
		System.out.println("A idade da borboleta é de " + butterfly.getIdade() +" meses de idade.");
		System.out.println("Várias borboletas juntas chamamos de panapanã, o som de todas batendo as asas juntas é mais ou menos assim: "+ butterfly.isSom() + ", como o som de uma cascata");
		
		System.out.println();
		
		System.out.println("A borboleta possui 6 patas e 2 pares de asas, mas não são capazes de voar. Verdadeiro ou Falso? "+ butterfly.isVoa());
	}

}
