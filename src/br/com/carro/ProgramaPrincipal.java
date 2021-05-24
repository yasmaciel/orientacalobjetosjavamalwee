package br.com.carro;

import br.com.maciel.Pessoa;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		
		carro1.setMarca("Mercedes Benz");
		carro1.setModelo("A200");
		carro1.setAno(2015);
		carro1.setqtdportas(4);
		
		carro2.setMarca("Gol");
		carro2.setModelo("Volkswagen");
		carro2.setAno(2020);
		carro2.setqtdportas(4);
		
		carro3.setMarca("Fiat");
		carro3.setModelo("Palio");
		carro3.setAno(2010);
		carro3.setqtdportas(4);
		
		carro4.setMarca("Fiat");
		carro4.setModelo("Siena");
		carro4.setAno(2014);
		carro4.setqtdportas(4);
		
		carro5.setMarca("HB20");
		carro5.setModelo("Hyundai");
		carro5.setAno(2021);
		carro5.setqtdportas(4);
		
		System.out.println("---CARRO 1 ---");
		System.out.println(carro1.setMarca("Mercedes Benz"));
		System.out.println();
	
		
		

	}

}
