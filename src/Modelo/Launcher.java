package Modelo;

import java.util.Random;

import model.products.Fabrica;
import model.products.Queso;
import model.products.Yogurt;
import model.products.alpina.Alpina;
import model.products.colanta.Colanta;

public class Launcher {
	
	public static void main(String[] a ) {
		Fabrica f=null;
		
		Random r=new Random();
		
		int i = r.nextInt(10);
		if(i<5) {
			f=new Alpina();
		}else {
			f=new Colanta();
		}
		
		System.out.println(i);
		
		Queso queso=f.getQueso();
		Yogurt y=f.getYogurt();
		
		System.out.println(queso.darMensaje());
		System.out.println(y.getMessage());
	}

}
