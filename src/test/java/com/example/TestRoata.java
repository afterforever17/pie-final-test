package com.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.Roata;

public class TestRoata {

    @Test
	public void testRoata() {
		Roata roata = new Roata(2);
		Assertions.assertEquals(roata.calculeazaArie(), 19.7192);
	}
}