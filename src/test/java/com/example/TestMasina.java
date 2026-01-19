package com.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.Masina;
import com.example.Roata;

public class TestMasina {
    @Test
	public void testRoata() throws PreaMulteRoti {
		Masina masina = new Masina("DS");
		masina.adaugaRoata(new Roata(2));
		Assertions.assertEquals(masina.calculeazaArieTotala(), 19.7192);
	}
}