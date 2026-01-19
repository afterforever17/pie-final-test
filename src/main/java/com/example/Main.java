package com.example;
import com.example.Roata;
import com.example.Masina;
import java.util.*;

public class Main {
	public static void main(String[] args) throws PreaMulteRoti{
		Roata roata1 = new Roata(5);
		Roata roata2 = new Roata(3);
		Roata roata3 = new Roata(6);
		Roata roata4 = new Roata(2);
		
		Masina volvo = new Masina("volvo");
		
		volvo.adaugaRoata(roata1);
		volvo.adaugaRoata(roata2);
		volvo.adaugaRoata(roata3);
		volvo.adaugaRoata(roata4);
		
		
		System.out.println(volvo.calculeazaArieTotala());
		
	}
}