package Herencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<MedioTransporte> transportes= new ArrayList<MedioTransporte>();
	
		
		Carro bugatti = new Carro("JJJ555","MODELO1","MOTOR1",0.0,true);
		
		MedioTransporte mazda = new Carro("JJJ555","MODELO1","MOTOR1",0.0,true);
		
		transportes.add(mazda);
		
		System.out.println(bugatti.isDeportivo());
		
		System.out.println(bugatti.getMotor());
		
		
//		carro1.getMatricula();
//		
//		System.out.println(carro1.toString());
		
		
		ListaAgregarDosVeces<MedioTransporte> transportes2 = new ListaAgregarDosVeces<MedioTransporte>();
		
		
		transportes2.add(bugatti);
		
		transportes2.add(mazda);
	
		System.out.println(transportes2.get(0).toString());
		
		System.out.println(transportes2.get(1).toString());
		
		System.out.println(transportes2.get(2).toString());
		

	}

}
