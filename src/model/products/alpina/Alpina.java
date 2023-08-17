package model.products.alpina;

import model.products.Fabrica;
import model.products.Queso;
import model.products.Yogurt;

public class Alpina implements Fabrica{

	public Queso getQueso() {
		// TODO Auto-generated method stub
		return new Alpinito();
	}

	public Yogurt getYogurt() {
		// TODO Auto-generated method stub
		return new YogoYogo();
	}
	

}
